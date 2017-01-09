package Ex1;

/**
 * Created by Administrator on 2016/6/13.
 */
public class LetterPrinter extends Thread {
    private Printer p;
    public LetterPrinter(Printer p) {
        this.p = p;
    }

    @Override
    public void run() {
        for (char c = 'A'; c <= 'Z'; c++) {
            p.print(c);
        }
    }
}
