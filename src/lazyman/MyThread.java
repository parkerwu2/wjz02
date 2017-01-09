package lazyman;

/**
 * Created by Administrator on 2016/11/23.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println(MyOjbect4.getInstance().hashCode());
    }
}
