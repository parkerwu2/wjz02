package Ex17;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * Created by Administrator on 2017/3/13.
 */
public class Main {
    public static void main(String[] args) {
        ThreadPoolExecutor schedulePool = (ThreadPoolExecutor) Executors.newFixedThreadPool(1);
        for (int i = 0; i < 10; i++) {
            final int k = i;
            schedulePool.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println(k);
                }
            });
        }
        Map m = new HashMap();
    }
}
