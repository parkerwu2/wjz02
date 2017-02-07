package Ex7;

/**
 * Created by Administrator on 2017/2/7.
 */
public class ThreadB implements Runnable {
    private Data data;
    public ThreadB(Data d) {
        data = d;
    }
    @Override
    public void run() {
        synchronized (data) {
            String x = data.s;
            System.out.println("ThreadB get data" + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data.s = x + "e";
            System.out.println("ThreadB set data" + data.s);
        }
    }
}
