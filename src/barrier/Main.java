package barrier;

import java.util.Date;
import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2017/2/17.
 */
class Horse implements Runnable {
    private int name;
    private CyclicBarrier barrier;
    public Horse(int n, CyclicBarrier barrier) {
        name = n;
        this.barrier = barrier;
    }
    @Override
    public void run() {
        try {
            barrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        try {
            Thread.sleep(new Random().nextInt(5000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("horse " + name + " reached the goal" + new Date());
    }
}
public class Main {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(5);
        CyclicBarrier barrier = new CyclicBarrier(5, new Runnable() {
            @Override
            public void run() {
                System.out.println("barrier start");
            }
        });
        for (int i = 0; i < 5; i++) {
            pool.execute(new Horse(i, barrier));
        }
    }
}
