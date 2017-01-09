package Ex1;

/**
 * Created by Administrator on 2016/6/13.
 */
public class NumberPrinter extends Thread {
    private Printer p;
    public NumberPrinter(Printer p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 52; i++) {
            p.print(i);
        }
    }
}
