package Ex5;

import java.util.Date;

/**
 * Created by Administrator on 2017/1/26.
 */
public class T implements Runnable {
    public void run() {
        A a = new A();
        System.out.println(Thread.currentThread().getName()
                +" "+new Date());
    }

    public static void main(String[] args){
        T t1 = new T();
        T t2 = new T();
        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
    }
}
