package Ex7;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Administrator on 2017/2/7.
 */
public class Tedst {
    public static void main(String[] args) {
        ExecutorService poolExecutor = Executors.newFixedThreadPool(2);
        Data d = new Data();
        ThreadA a = new ThreadA(d);
        ThreadB b = new ThreadB(d);
        poolExecutor.execute(a);
        poolExecutor.execute(b);
    }
}
