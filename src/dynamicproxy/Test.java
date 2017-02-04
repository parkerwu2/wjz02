package dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by Administrator on 2017/2/4.
 */
public class Test {
    public static void main(String[] args) {
        PeopleSayHandler peopleSayHandler = new PeopleSayHandler(new PeopleSay());
        Say proxy = (Say)Proxy.newProxyInstance(Say.class.getClassLoader(),
                new Class[]{Say.class},
                new PeopleSayHandler(new PeopleSay())
                );
        proxy.saywords("hello world");
    }
}
