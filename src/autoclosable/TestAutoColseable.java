package autoclosable;

/**
 * Created by Administrator on 2017/3/16.
 */
public class TestAutoColseable {
    public static void main(String[] args) {
        try (MyResource mr = new MyResource())
        {
            mr.doSomething();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{

        }
    }
}
