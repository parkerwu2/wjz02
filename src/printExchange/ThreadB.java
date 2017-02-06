package printExchange;

/**
 * Created by Administrator on 2017/2/6.
 */
public class ThreadB extends Thread{
    private MyService myService;
    public ThreadB(MyService myService) {
        super();
        this.myService = myService;
    }

    @Override
    public void run() {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            myService.get();
        }
    }
}
