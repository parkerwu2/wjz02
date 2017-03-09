package annotationself;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Administrator on 2017/3/9.
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MethoSort {
    int value() default 0;
}
