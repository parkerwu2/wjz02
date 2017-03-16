package autoclosable;

/**
 * Created by Administrator on 2017/3/16.
 */
public class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("资源被关闭了！");
    }
    public void doSomething(){
        System.out.println("干活了！");
    }
}
