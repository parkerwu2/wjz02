package Ex10;

/**
 * Created by Administrator on 2017/2/13.
 */
public class MyThreadB extends Thread {
    private MyService service;
    public MyThreadB(MyService service, int i) {
        super("ThreadB" + i);
        this.service = service;
    }

    @Override
    public void run() {
        service.set();
    }
}
