import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Long a = 152l;
        Long b = 152l;
        Map<Long, String> map = new HashMap<>();
        map.put(a, "1");
        map.put(b, "2");
        System.out.println(map.size());
    }
}
