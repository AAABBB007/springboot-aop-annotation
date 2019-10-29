package jeeno.example.springbootaopselfannotation.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 操作日志使用的注解
 * @author Jeeno
 * @version 1.0.0
 * @date 2019/10/29 22:45
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
public @interface OptLog {
    String value() default "";
}
