package Ex7;

/**
 * Created by Administrator on 2017/2/7.
 */
public class ThreadA implements Runnable {
    private Data data;
    public ThreadA(Data d) {
        data = d;
    }

    @Override
    public void run() {
        synchronized (data) {
            String x = data.s;
            System.out.println("ThreadA get data" + x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            data.s = x + "d";
            System.out.println("ThreadA set data" + data.s);
        }
    }
}
