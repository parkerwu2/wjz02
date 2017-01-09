package Ex3;

/**
 * Created by Administrator on 2016/10/12.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        for (int i = 0; i < 500000; i++) {
            if (this.isInterrupted()) {
                System.out.println("i am interrupted");
            }
            System.out.println("i=" + (i + 1));
        }
    }
}
