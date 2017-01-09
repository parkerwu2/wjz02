package lazyman;

/**
 * Created by Administrator on 2016/11/23.
 */
public class Run {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new MyThread().start();
        }
    }
}
