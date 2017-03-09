package annotationself;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/3/9.
 */
public class Test {
    @MethoSort(value = 4)
    public void method1() {
        System.out.println("1");
    }
    @MethoSort(value = 3)
    public void method2() {
        System.out.println("2");
    }
    @MethoSort()
    public void method3() {
        System.out.println("3");
    }
    @MethoSort(value = 1)
    public void method4() {
        System.out.println("4");
    }
    void run(Class c) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Method[] ms = c.getDeclaredMethods();
        Object o = c.newInstance();
        TreeMap<Integer, Method> map = new TreeMap<>();
        for (Method m : ms) {
            MethoSort annotation = m.getAnnotation(MethoSort.class);
            if (annotation != null) {
                map.put(annotation.value(), m);
            }
        }
        for (Method mm : map.values()) {
            mm.invoke(o);
        }
    }

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        Test t = new Test();
        new Test().run(t.getClass());
    }
}
