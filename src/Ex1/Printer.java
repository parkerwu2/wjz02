package Ex1;

/**
 * Created by Administrator on 2016/6/13.
 */
public class Printer {
    private int index = 1;
    public synchronized void print(int i) {
        while (index % 3 == 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.print(" " + i);
        index++;
        notifyAll();
    }
    public synchronized  void print(char c) {
        while (index % 3 != 0) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        System.out.print(" " + c);
        index++;
        notifyAll();
    }
}
