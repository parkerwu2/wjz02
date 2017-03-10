import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Main2 {

    public static void main(String[] args){
        List<Integer> l = new ArrayList<>(20);
        //int nThreads = 30;
        //ThreadPoolExecutor tr = new  ThreadPoolExecutor(nThreads, nThreads, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());
        BlockingQueue<Runnable> workQueue = new LinkedBlockingQueue<>(10);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10,40,0L,TimeUnit.SECONDS, workQueue);
        final AtomicInteger index = new AtomicInteger(0);
        //test2();
        for (int i = 0 ; i < 1000 ; i++ ) {
            System.out.println("cycle"+i);
                threadPoolExecutor.execute(new Runnable() {
                    @Override
                    public void run() {
                        throw new NullPointerException("测试异常" + index.getAndIncrement());
                    }
                });

            System.out.println("out:" + i);
        }
        System.out.println("over");
    }
}
