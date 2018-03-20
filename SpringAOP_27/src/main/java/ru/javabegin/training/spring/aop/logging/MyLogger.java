package ru.javabegin.training.spring.aop.logging;

import java.util.Map;
import java.util.Set;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyLogger {

	@Pointcut("execution(* ru.javabegin.training.spring.aop.objects.Manager.*(..))")
	private void allMethods() {
	};

	@Around("allMethods() && execution(java.util.Map *(..))")
	public Object watchTime(ProceedingJoinPoint joinpoint) {
		long start = System.currentTimeMillis();
		System.out.println("method begin: " + joinpoint.getSignature().toShortString() + " >>");
		Object output = null;

		for (Object object : joinpoint.getArgs()) {
			System.out.println("Param : " + object);
		}

		try {
			output = joinpoint.proceed();
		} catch (Throwable e) {
			e.printStackTrace();
		}

		long time = System.currentTimeMillis() - start;
		System.out.println("method end: " + joinpoint.getSignature().toShortString() + ", time=" + time + " ms <<");
		System.out.println();

		return output;
	}

	@SuppressWarnings("rawtypes")
	@AfterReturning(pointcut = "execution(java.util.Map *(..))", returning = "object")
	public void printMap(Object object){
		System.out.println("Printing Map >> ");

		Map map = (Map) object;
		for (Object obj : map.keySet()) {
			System.out.println("key = " + obj + ", " + map.get(obj));
		}

		System.out.println("End printing Map <<");
		System.out.println();
	}

	@SuppressWarnings("rawtypes")
	@AfterReturning(pointcut = "execution(java.util.Set *(..))", returning = "object")
	public void printSet(Object object){
		System.out.println("Printing Set >> ");

		Set set = (Set) object;
		for (Object obj : set) {
			System.out.println(obj);
		}

		System.out.println("End printing Set <<");
		System.out.println();
	}
}
