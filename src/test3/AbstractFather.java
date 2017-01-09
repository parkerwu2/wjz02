package test3;

/**
 * Created by Administrator on 2016/12/12.
 */
public abstract class AbstractFather {

    public void run(Param p) {
        System.out.println("start: " + p);
        Long l = work(p);
        System.out.println("end l:" + l);
    }
    private void before() {
        System.out.println("father before");
    }
    public abstract Long work(Param p);
}
