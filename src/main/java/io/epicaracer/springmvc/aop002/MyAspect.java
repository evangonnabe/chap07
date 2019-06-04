package io.epicaracer.springmvc.aop002;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {
//	@Before("execution(public void io.epicaracer.springmvc.aop002.Boy.runSomthing())")
	@Before("execution(* runSomething())")
	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 인식 확인 : 문을 개방하라");
	}
	
}
