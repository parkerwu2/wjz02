package printExchange;

/**
 * Created by Administrator on 2017/2/6.
 */
public class Run {
    public static void main(String[] args) {
        MyService myService = new MyService();
        ThreadA a = new ThreadA(myService);
        ThreadB b = new ThreadB(myService);
        a.start();
        b.start();
    }
}
