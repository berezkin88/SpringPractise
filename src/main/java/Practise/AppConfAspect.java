package Practise;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Alexander on 03/06/2017.
 */

@Aspect
@Configuration
@EnableAspectJAutoProxy
public class AppConfAspect {

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }
}
