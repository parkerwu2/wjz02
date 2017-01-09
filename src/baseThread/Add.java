package baseThread;


/**
 * Created by Administrator on 2016/11/23.
 */
public class Add {
    private String lock;
    public Add(String lock) {
        super();
        this.lock = lock;
    }
    public void add() {
        synchronized (lock) {
            ValueObject.list.add("anyString");
            lock.notifyAll();
        }
    }
}
