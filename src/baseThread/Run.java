package baseThread;


/**
 * Created by Administrator on 2016/11/23.
 */
public class Run {
    public static void main(String[] args) throws InterruptedException {
        String lock = new String("");
        Add add = new Add(lock);
        Subtract subtract = new Subtract(lock);
        ThreadS threadS = new ThreadS(subtract);
        threadS.setName("subtract1Thread");;
        threadS.start();
        ThreadS threadS2 = new ThreadS(subtract);
        threadS2.setName("subtract2Thread");;
        threadS2.start();
        Thread.sleep(1000);
        ThreadA threadA = new ThreadA(add);
        threadA.setName("addThread");
        threadA.start();
    }
}
