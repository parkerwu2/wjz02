import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Administrator on 2017/1/24.
 */
public class NotInitialization {
    public static void main(String[] args) {
        List l2 = Collections.synchronizedList(new ArrayList<>());
        CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    }
}
