package Ex1;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Test {
    public static void main(String[] args) {
        Printer p = new Printer();
        Thread t1 = new NumberPrinter(p);
        Thread t2 = new LetterPrinter(p);
        t1.start();
        t2.start();
    }
}
