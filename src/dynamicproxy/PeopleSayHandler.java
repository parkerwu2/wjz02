package dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2017/2/4.
 */
public class PeopleSayHandler implements InvocationHandler {
    private Object obj;
    public PeopleSayHandler(Object obj) {
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("handler before");
        Object result = method.invoke(obj, args);
        System.out.println("handler after");
        return result;
    }

}
