package Ex11;

/**
 * Created by Administrator on 2017/2/16.
 */
public class Main {
    public synchronized void m4t1() {
        int i = 5;
        while (i -- > 0) {
            System.out.println(Thread.currentThread().getName() + i + ", ");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
    public synchronized void m4t2() {
        int i = 5;
        while (i -- > 0) {
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {}
        }
    }
    public static void main(String[] args) {
        final Main main2 = new Main();
        final Main main3 = new Main();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                main2.m4t1();
            }
        }, "t1");
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                main3.m4t2();
            }
        }, "t2");
        t1.start();
        t2.start();
    }
}
