package lazyman;

/**
 * Created by Administrator on 2016/11/23.
 */
public class MyObject {
    private static MyObject myObject;
    private MyObject(){}
    public static MyObject getInstance() {
        if (myObject != null) { //第一次检查
        } else {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (MyObject.class) { //加锁到部分代码，又保证了一定的性能
                if (myObject == null) { //第二次检查 double-check locking(dcl)
                    myObject = new MyObject();
                }
            }
        }
        return myObject;
    }
}
