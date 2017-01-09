package Ex2;

/**
 * Created by Administrator on 2016/10/12.
 */
public class Ex1 {

    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "isstop3:" + Thread.currentThread().isInterrupted());
            System.out.println(Thread.currentThread().getName() + "isstop4:" + Thread.currentThread().isInterrupted());
//            thread.interrupt();
            Thread.currentThread().interrupt();
            System.out.println(Thread.currentThread().getName() + "isstop1:" + thread.isInterrupted());
            System.out.println(Thread.currentThread().getName() + "isstop2:" + thread.isInterrupted());
            System.out.println(Thread.currentThread().getName() + "isstop5:" + Thread.currentThread().isInterrupted());
            System.out.println(Thread.currentThread().getName() + "isstop6:" + Thread.currentThread().isInterrupted());
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + "main catch interruptedException");
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "end!");
    }
}
