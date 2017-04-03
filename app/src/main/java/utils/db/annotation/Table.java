package utils.db.annotation;

/**
 * info:
 * date: 2017/4/3  16 ：56
 * mode:  - -!
 * author: Lvmoy
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Table {

    String name();

    String onCreated() default "";
}
