package lazyman;

/**
 * Created by Administrator on 2016/11/23.
 */
public class MyObject3 {
    private static MyObject3 myObject3 = new MyObject3();
    private MyObject3() {}
    public static MyObject3 getInstance() {
        return myObject3;
    }
}
