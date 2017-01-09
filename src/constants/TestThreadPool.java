package constants;

import java.math.BigDecimal;
import java.util.concurrent.Executors;

/**
 * Created by Administrator on 2016/6/16.
 */
public class TestThreadPool {
    public static void main(String[] args) {
        int effectiveCallCount = 36;
        int callCount = 87;
        long actualCallProportion = (long)effectiveCallCount * 100 / (long)callCount;
        BigDecimal b  =   new BigDecimal(actualCallProportion);
        float   actualCallProportionPercent   =  b.setScale(0, BigDecimal.ROUND_HALF_UP).floatValue();
        System.out.println(Math.round(actualCallProportionPercent));
    }
}
