package Ex3;


/**
 * Created by Administrator on 2016/10/12.
 */
public class Run {
    public static void main(String[] args) {
        try {
            MyThread thread = new MyThread();
            thread.start();
            Thread.sleep(1000);
            thread.interrupt();
            System.out.println("是否停止1:" + thread.isInterrupted());
            System.out.println("是否停止2:" + thread.isInterrupted());
        } catch (InterruptedException e) {
            System.out.println("enter inter catch");
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
