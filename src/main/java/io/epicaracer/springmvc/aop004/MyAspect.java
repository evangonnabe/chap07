package io.epicaracer.springmvc.aop004;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/* 
 * POJO & XML 기반 - spring framework에 종속되지 않음
 */

public class MyAspect {
	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 인식 확인 : 문을 개방하라");
	}

	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("주인님 나갔다 : 어이 문 잠가!!!");
	}
}
