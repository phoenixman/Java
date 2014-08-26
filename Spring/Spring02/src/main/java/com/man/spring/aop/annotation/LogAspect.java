package com.man.spring.aop.annotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Service;

/**
 * 日志切面
 * @author phoenix
 * 2014年8月25日
 */
@Aspect
@Service
public class LogAspect {
	@Pointcut("execution(* com.man.spring.aop.annotation.*.*(..))")
	public void anyMethod(){}
	
	@Before("anyMethod()")
	public void beforeAddBook(){
		System.out.println("前置通知");
	}
	@AfterReturning("anyMethod()")
	public void afterAddBook(){
		System.out.println("后置通知");
	}
	 @After("anyMethod()")  
	public void after(){  
	     System.out.println("最终通知");  
	 }  
	
	 @AfterThrowing("anyMethod()") 
	public void addBookFail(){
		System.out.println("例外通知");
	}
	 @Around("anyMethod()")
	public void  aroundAdvicer(ProceedingJoinPoint joinPoint){
		try {
			this.beforeAddBook();
			System.out.println("环绕通知");
			joinPoint.proceed();//执行被通知的方法
			this.afterAddBook();
		}catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
}
