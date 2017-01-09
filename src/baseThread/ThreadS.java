package baseThread;

/**
 * Created by Administrator on 2016/11/23.
 */
public class ThreadS extends Thread {
    private Subtract r;
    public ThreadS(Subtract r) {
        super();
        this.r = r;
    }

    @Override
    public void run() {
        r.subtract();
    }
}
