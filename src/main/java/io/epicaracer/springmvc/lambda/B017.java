package io.epicaracer.springmvc.lambda;

public class B017 {

	/*
	 *  java8에서 인터페이스가 가질수 있는 멤버
	 *  (기존 1.8 미만) 정적 상수, 추상 인스턴스 메서드
	 *  (1.8 이후 추가) 디폴트 메서드(구체 인스턴스 메서드), (구체)정적 메서드
	 */
	
	public static void main(String[] args) {
		System.out.format("정적 상수: %d\n", MyFunctionalInteface2.constant);

		MyFunctionalInteface2 mfi2
		 = () -> System.out.println("추상 인터페이스 메서드");
	
		 mfi2.abstractInstanceMethod();
		 
		 mfi2.concreteInstanceMethod();
	}
	
}

@FunctionalInterface
interface MyFunctionalInteface2 {
	//정적 상수
	public static final int constant = 1;
	
	//추상 인스턴스 메서드
	public abstract void abstractInstanceMethod();
	
	//java8 디폴트 메서드 - 구체 인스턴스 메서드
	public default void concreteInstanceMethod() {
		System.out.println("디폴트 메서드 - 구체 인스턴스 메서드");
	}
	
	//java8 정적 메서드 - 구체 정적 메서드
	public static void concreteStaticMethod() {
		System.out.println("정적 메서드 - 구체 정적 메서드");
	}
}
