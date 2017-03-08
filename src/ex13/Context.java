package ex13;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2017/2/27.
 */
public class Context {

    private String type;
    public Context(String type){
        this.type = type;
    }
    public void contextInterface(){
        Strategy s = StrategyFactory.getStrategy(type);
        s.strategyInterface();

    }
}
