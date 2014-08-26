package com.man.spring.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 日志切面
 * @author phoenix
 * 2014年8月25日
 */
public class Log {
	public void beforeAddBook(){
		System.out.println("before add book!");
	}
	
	public void afterAddBook(){
		System.out.println("after add book!");
	}
	
	public void addBookFail(){
		System.out.println("oh sorry!");
	}
	
	public void  aroundAdvicer(ProceedingJoinPoint joinPoint){
		try {
			this.beforeAddBook();
			joinPoint.proceed();//执行被通知的方法
			this.afterAddBook();
		}catch (Throwable e) {
			e.printStackTrace();
		}
		
	}
}
