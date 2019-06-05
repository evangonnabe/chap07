package io.epicaracer.springmvc.aop005;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/* Pointcut - 자르는 지점. aspect 적용 위치 지정자
 * Joinpoint - 연결 가능한 지점 , pointcut은 joinpoint의 부분집합, aspect적용이 가능한 모든 지점
 * advice - 조언. 언제(when).무엇(what)을 -> (@Before)에 before()메서드를.
 * aspect = advices + pointcuts
 * advisor = an advice + a pointcut , 어디서(where), 언제(when), 무엇(what)을.
 * 
 */

@Aspect
public class MyAspect {
//	@Before("execution(public void io.epicaracer.springmvc.aop002.Boy.runSomthing())")
	@Pointcut("execution(* runSomething())")
	private void iampc() {
		//여긴 무엇을 작성해도 의미가 없어요.
	}
	@Before("iampc()")
	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 인식 확인 : 문을 개방하라");
	}
	
	@After("iampc()")
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("주인님 나갔다 : 어이 문 잠가!!!");
	}
	
}
