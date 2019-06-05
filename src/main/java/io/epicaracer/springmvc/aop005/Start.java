package io.epicaracer.springmvc.aop005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
	public static void main(String[] args) {
//		Boy romeo = new Boy();
//		Girl juliet = new Girl();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("io/epicaracer/springmvc/aop005/aop005.xml");
		
		Person romeo = context.getBean("boy", Person.class);
		Person juliet = context.getBean("girl", Person.class);	
		
		romeo.runSomething();
		System.out.println("-----------------");
		juliet.runSomething();
	}
}
