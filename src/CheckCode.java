import java.util.Random;

/**
 * Created by Administrator on 2016/6/13.
 */
public class CheckCode extends Thread {
    private Random rand = new Random();
    String s = "1234567890ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    @Override
    public void run() {
        while (!Var.stop) {
            if (!Var.has) {
                String result = "";
                for (int i =0; i < 4; i++ )
                {
                    int n = rand.nextInt(62);
                    result += s.charAt(n);
                }
                Var.code = result;
                Var.has = true;
                try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
