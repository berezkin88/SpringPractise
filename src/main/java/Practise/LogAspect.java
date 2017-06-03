package Practise;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

/**
 * Created by Alexander on 21/05/2017.
 */

@Aspect

public class LogAspect {


    @Around("execution(* NumbersController.execute())")
    public Object onNumbers(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("LogAspect. Before execution of " + pjp.getSignature().getName());
        Object result = pjp.proceed();
        System.out.println("LogAspect. After execution of " + pjp.getSignature().getName());
        return result;
    }
}
