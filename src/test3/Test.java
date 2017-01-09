package test3;

/**
 * Created by Administrator on 2016/12/12.
 */
public class Test {
    public static void main(String[] args) {
        String topClass = "2, 3,4 ,5 ";
        String[] topClasses = topClass.split(",");
        for (String x : topClasses) {
            System.out.println(Integer.valueOf(x.trim()));
        }
    }
}
