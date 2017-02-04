package Ex5;

import java.util.Date;

/**
 * Created by Administrator on 2017/1/26.
 */
public class A {
    static{
        System.out.println(Thread.currentThread().getName()
                +" "+new Date());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
