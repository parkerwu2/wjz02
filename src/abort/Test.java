package abort;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/2/4.
 */
class MyRunnable implements Runnable{
    private String name;
    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("thread:" + name + " has begun...");
    }
}
public class Test {
    private static final int THREADS_SIZE = 1;
    private static final int CAPACITY = 1;

    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(THREADS_SIZE, THREADS_SIZE, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(CAPACITY));
        pool.setRejectedExecutionHandler(new ThreadPoolExecutor.DiscardOldestPolicy());
        try {
            for (int i = 0; i < 10; i++) {
                Runnable myrun = new MyRunnable("task-"+i);
                pool.execute(myrun);
            }
        } catch (Exception e) {
            e.printStackTrace();
            // 关闭线程池
            pool.shutdown();
        }


    }
}
