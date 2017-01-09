package test3;

/**
 * Created by Administrator on 2016/12/12.
 */
public class Son extends AbstractFather {

    @Override
    public Long work(Param p) {
        System.out.println("son work");
        return p.p * 10;
    }
}
