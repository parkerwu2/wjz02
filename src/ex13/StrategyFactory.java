package ex13;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/2/27.
 */
public class StrategyFactory {
    private static Map<String, String> m = new HashMap<>();
    static {
        m.put("a", "ex13.ProtocolTypeLoginProcess");
    }
    public static Strategy getStrategy(String type) {
        try {
            return (Strategy)Class.forName(m.get(type)).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
