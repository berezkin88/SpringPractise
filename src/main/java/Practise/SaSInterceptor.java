package Practise;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by Alexander on 20/05/2017.
 */
public class SaSInterceptor implements MethodInterceptor {


    @Override

    public Object invoke(MethodInvocation invocation) throws Throwable {
        System.out.println("Interceptor. Before execution of " + invocation.getMethod().getName());
        Object result = invocation.proceed();
        System.out.println("Interceptor. After execution of " + invocation.getMethod().getName());
        return result;
    }

}
