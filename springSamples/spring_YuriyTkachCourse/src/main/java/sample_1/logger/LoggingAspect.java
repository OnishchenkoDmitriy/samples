package sample_1.logger;

import org.apache.commons.logging.Log;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* *.logEvent(..))")
    private void allEventMethods(){ }

    @Before("allEventMethods()")
    public void logBefore(JoinPoint joinPoint){
        System.out.println("BEFORE: " + joinPoint.getTarget().getClass().getSimpleName() + " " +
        joinPoint.getSignature().getName());
    }




}
