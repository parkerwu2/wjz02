import java.util.*;
import java.util.concurrent.locks.ReentrantLock;
class A {

}
public class Main {

    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = null;
//        while ((s = in.next()) != null) {
//
//        }
//        ReentrantLock lock1 = new ReentrantLock();
//        final ReentrantLock reentrantLock = lock1;
        List<A> l = new ArrayList<>();
        l.add(new A());
        l.add(new A());
        List<A> l2 = new ArrayList<>();
        l2 = null;
//        l2.add(new A());
//        l2.add(new A());
        l.addAll(l2);
        System.out.println(l.size());
    }
}
