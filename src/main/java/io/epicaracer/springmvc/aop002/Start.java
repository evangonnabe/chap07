package io.epicaracer.springmvc.aop002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
	public static void main(String[] args) {
//		Boy romeo = new Boy();
//		Girl juliet = new Girl();
		
		ApplicationContext context = new ClassPathXmlApplicationContext("io/epicaracer/springmvc/aop002/aop002.xml");
		
		Person romeo = context.getBean("boy", Person.class);
		
		romeo.runSomething();
	}
}
