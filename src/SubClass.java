/**
 * Created by Administrator on 2017/1/24.
 */
public class SubClass extends SuperClass {
    static {
        System.out.println("SubClass init!");
    }
    public static void main(String[] args) {
        System.out.println(SubClass.value);
    }
}
