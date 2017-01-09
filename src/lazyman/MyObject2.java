package lazyman;

/**
 * Created by Administrator on 2016/11/23.
 */
public class MyObject2 {
    private static class innerClass {
        private static MyObject2 myObject2 = new MyObject2();
    }
    private MyObject2(){}
    public static MyObject2 getInstance() {
        return innerClass.myObject2;
    }
}
