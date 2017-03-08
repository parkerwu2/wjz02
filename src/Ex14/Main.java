package Ex14;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.InetSocketAddress;
import java.nio.channels.Channel;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Created by Administrator on 2017/2/27.
 */
class Lock {
    public  Integer state = 1;
    public  boolean isStop = false;
};
class A implements Runnable {
    private Lock lock;
    public A(Lock l) {
        lock = l;
    }

    @Override
    public void run() {
        while (!lock.isStop) {
            synchronized (lock) {
                while (lock.state != 1) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("A");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
                lock.state = 2;
                lock.notifyAll();
            }
        }
    }
}
class B implements Runnable {
    private Lock lock;
    public B(Lock l) {
        lock = l;
    }

    @Override
    public void run() {
        while (!lock.isStop) {
            synchronized (lock) {
                while (lock.state != 2) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("B");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
                lock.state = 3;
                lock.notifyAll();
            }
        }
    }
}
class C implements Runnable {
    private Lock lock;
    public C(Lock l) {
        lock = l;
    }

    @Override
    public void run() {
        while (!lock.isStop) {
            synchronized (lock) {
                while (lock.state != 3) {
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                    }
                }
                System.out.println("C");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
                lock.state = 1;
                lock.notifyAll();
            }
        }
    }
}
public class Main {
    private Integer a = 2;
    static {
        System.out.println("static");
    }
    private Main(){
        System.out.println("Main()");
    };
    public static Main getInstance() {
        System.out.println("Main Instance");
        return Inner.instance;
    }
    static class Inner {
        private static Main instance = new Main();
    }
    static int getmid(int[]a, int low, int high) {
        return (low + high) / 2;
    }
    static int find (int target, int[] a, int low, int high) {
        int mid = getmid(a, low, high);
        if (a[mid] == target) {
            return 1;
        }
        if (low >= high) {
            return 0;
        }
        if (a[mid] < target) {
            return find(target, a, low, mid - 1);
        } else {
            return find(target, a, mid + 1, high);
        }
    }
    public static void main(String[] args) throws InterruptedException, IOException {
        int[] a = new int[]{1, 2, 3, 4, 4, 5, 9, 10, 11};
        System.out.println(find(4, a, 0, a.length - 1));
    }
}
