package utils.db.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * info:
 * date: 2017/4/3  16 ：56
 * mode:  - -!
 * author: Lvmoy
 */

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {

    String name();

    String property() default "";

    boolean isId() default false;

    boolean autoGen() default true;
}
