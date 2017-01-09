package baseThread;

/**
 * Created by Administrator on 2016/11/23.
 */
public class ThreadA extends Thread {
    private Add p;
    public ThreadA(Add p) {
        super();
        this.p = p;
    }

    @Override
    public void run() {
        p.add();
    }
}
