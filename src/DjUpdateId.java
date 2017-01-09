/**
 * Created by Administrator on 2017/1/6.
 */
public class DjUpdateId extends Thread {
    @Override
    public void run() {
        while (true) {
            try {
                int a = 4 / 1;
                Thread.sleep(300);
                System.out.println("I am alive");
            } catch (InterruptedException e) {
                System.out.println("I am interrupted");
            }
        }
    }

    public static void main(String[] args) {
        new DjUpdateId().run();
    }
}
