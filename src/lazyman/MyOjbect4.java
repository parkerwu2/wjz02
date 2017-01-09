package lazyman;

/**
 * Created by Administrator on 2016/11/23.
 */
public class MyOjbect4 {
    private static MyOjbect4 instance = null;
    private MyOjbect4(){}
    static {
        instance = new MyOjbect4();
    }
    public static MyOjbect4 getInstance() {
        return instance;
    }
}
