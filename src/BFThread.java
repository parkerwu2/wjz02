/**
 * Created by Administrator on 2016/10/25.
 */
public class BFThread implements Runnable {
    private BF bf;
    public BFThread(BF bf) {
        this.bf = bf;
    }
    @Override
    public void run() {
        System.out.println(bf.getNext() + ", " + Thread.currentThread().getName());
    }
}
