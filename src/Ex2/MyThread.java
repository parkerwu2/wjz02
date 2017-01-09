package Ex2;

/**
 * Created by Administrator on 2016/10/12.
 */
public class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
//        try {
            for (int i = 0; i < 50; i++) {
//                if (Thread.currentThread().isInterrupted()) {
//                    System.out.println(Thread.currentThread().getName() + "stop i will quit");
//                    //throw new InterruptedException();
//                    break;
//                }
                System.out.println(Thread.currentThread().getName() + "i=" + (i + 1));
            }
            System.out.println(Thread.currentThread().getName() + "i am under for");
//        } catch (InterruptedException e) {
//            System.out.println(Thread.currentThread().getName() + "enter mythread catch");
//            e.printStackTrace();
//        }
    }
}
