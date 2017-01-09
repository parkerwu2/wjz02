import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/10/25.
 */
public class BF {
    public List<Integer> numbers = new ArrayList<>();
    private int i = 0;

    public BF() {
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
    }

    public synchronized Integer getNext() {
        if (i == 5) {
            i = 0;
        }
        return numbers.get(i++);
    }
    public static void main(String[] args) {
        BF bf = new BF();
        for (int i = 0; i < 10; i++) {
            BFThread bfThread = new BFThread(bf);
            bfThread.run();
        }
    }
}
