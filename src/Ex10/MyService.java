package Ex10;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Administrator on 2017/2/13.
 */
public class MyService {
    public MyService(Condition[] conditions, Lock lock) {
        this.lock = lock;
        this.condition = lock.newCondition();
    }
    private Lock lock;
    private Condition condition;
    private boolean hasValue = false;
    public void set() {
        try {
          lock.lock();
            while (hasValue) {
                System.out.println(Thread.currentThread().getName() + " wait");
                condition.await();
            }
            System.out.println(Thread.currentThread().getName() + " 打印*");
            hasValue = true;
            condition.signalAll();
            System.out.println(Thread.currentThread().getName() + " signalAll");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
    public void get() {
        try {
            lock.lock();
            while (!hasValue) {
                System.out.println(Thread.currentThread().getName() + " wait");
                condition.await();;
            }
            System.out.println(Thread.currentThread().getName() + " 打印0");
            hasValue = false;
            condition.signalAll();
            System.out.println(Thread.currentThread().getName() + " signalAll");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        Condition[] conditions = new Condition[7];
        Lock lock = new ReentrantLock();
        MyService service = new MyService(conditions, lock);
        MyThreadA[] threadAs = new MyThreadA[7];
        MyThreadB[] threadBs = new MyThreadB[7];
        for (int i = 0; i < 7; i++) {
            threadAs[i] = new MyThreadA(service, i);
            threadBs[i] = new MyThreadB(service, i);
            conditions[i] = lock.newCondition();
            threadAs[i].start();
            threadBs[i].start();
        }
    }
}
