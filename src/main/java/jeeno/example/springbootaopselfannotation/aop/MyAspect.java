package jeeno.example.springbootaopselfannotation.aop;

import jeeno.example.springbootaopselfannotation.annotation.OptLog;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Jeeno
 * @version 1.0.0
 * @date 2019/10/29 21:17
 */
@Slf4j
@Aspect
@Component
public class MyAspect {


    @Pointcut("execution(* jeeno.example.springbootaopselfannotation.controller..*.*(..))")
    public void pointCut(){
    }

    @Around("pointCut()")
    public Object doAroundAdvice(ProceedingJoinPoint pjp) throws Throwable {

        // 方法签名
        MethodSignature signature = (MethodSignature) pjp.getSignature();
        Method method = signature.getMethod();
        Object response = pjp.proceed();
        // 取到注解内容
        OptLog action = method.getAnnotation(OptLog.class);
        if (action != null) {
            log.info(action.value());
            // 请求参数
            Object[] args = pjp.getArgs();
            log.info("request:{}", Arrays.toString(args));
            log.info("response:{}", response.toString());
        }

        return response;
    }

}
