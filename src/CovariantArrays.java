import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2016/12/21.
 */
class Fruit{}
class Apple extends Fruit{}
class Jonathan extends Apple{}
class Orange extends Fruit{}
public class CovariantArrays {
    public static void main(String[] args) {
        List<? extends Fruit> flist = Arrays.asList(new Apple());
        Apple a = (Apple)flist.get(0);
        System.out.println(flist.contains(new Apple()));
        System.out.println(flist.indexOf(new Apple()));
        System.out.println(flist.contains(a));
        System.out.println(flist.indexOf(a));
    }
}
