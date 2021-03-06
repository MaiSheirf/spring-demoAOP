package demo.AOP.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class loggingAspect {

    @Before("execution(public void addAccount())")
    public void beforeAddAccount(){
        System.out.println("before advice logging");
    }
}

