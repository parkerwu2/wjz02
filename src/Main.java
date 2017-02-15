import Ex5.T;

import java.util.*;
import java.util.concurrent.*;
class MyQueue<T> extends LinkedBlockingQueue<T> {
    public MyQueue() {}
    @Override
    public boolean add(T t) {
        return offer(t);
    }

    @Override
    public boolean offer(T t) {
        try {
            System.out.println("i am put into the queue" + t.toString());
            put(t);
        } catch(InterruptedException e) {
            return false;
        }
        return true;
    }
}

class A extends Thread {
    public A(String name) {
        super(name);
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " i run " + new Date());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
public class Main {

    public static void main(String[] args) {
        ThreadPoolExecutor pool = new ThreadPoolExecutor(1, 2, 0L,
                TimeUnit.SECONDS,
                new MyQueue<Runnable>());
        pool.execute(new A("1"));
        pool.execute(new A("2"));
        pool.execute(new A("3"));
    }
}
