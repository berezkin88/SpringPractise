package Practise;

import Practise.DAO.Implementations.CompImpl;
import Practise.DAO.Implementations.MaDImpl;
import Practise.DAO.Implementations.SaSImpl;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.aop.framework.autoproxy.BeanNameAutoProxyCreator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

/**
 * Created by Alexander on 14/05/2017.
 */

@Configuration
//@EnableAspectJAutoProxy
public class AppConfig {

    @Bean
    public Main main (NumbersController numbersController){
        Main main = new Main();
        main.setNumbersController(numbersController);
        return main;
    }

    @Bean
    public NumbersController numbersController(CompImpl comp, MaDImpl maD, SaSImpl saS){
        NumbersController numbersController = new NumbersController();
        numbersController.setComparing(comp);
        numbersController.setMultiplicationAndDivision(maD);
        numbersController.setSumAndSubtraction(saS);
        return numbersController;
    }

    @Bean
    public CompImpl comp() {
        return new CompImpl();
    }

    @Bean
    public MaDImpl maD() {
        return new MaDImpl();
    }

    @Bean
    public SaSImpl saS(){
        return new SaSImpl();
    }

//    @Bean
//    @Scope("prototype")
//    public ProxySaS proxySaS(SaSImpl saS){
//        ProxySaS proxySaS = new ProxySaS();
//        proxySaS.setSaS(saS);
//        return proxySaS;
//    }

//    @Bean
//    public BeanNameAutoProxyCreator beanNameAutoProxyCreator(){
//        BeanNameAutoProxyCreator beanNameAutoProxyCreator = new BeanNameAutoProxyCreator();
//        beanNameAutoProxyCreator.setProxyTargetClass(true);
//        beanNameAutoProxyCreator.setBeanNames("saS*");
//        beanNameAutoProxyCreator.setInterceptorNames("saSInterceptor");
//        return beanNameAutoProxyCreator;
//    }
//
//
//    @Bean
//    public SaSInterceptor saSInterceptor(){
//        return new SaSInterceptor();
//    }

    @Bean
    public LogAspect logAspect(){
        return new LogAspect();
    }

//    @Before("e")

}
