package io.epicaracer.springmvc.lambda;

/*
 * 추상 메서드를 하나만 같는 인터페이스를 자바 8부터는 Functional interface라 한다.
 * 이런 함수형 인터페이스만을 람다식으로 변경할 수 있다.
 * 
 * @FunctionalInterface (optional, 함수형 인터페이스의 조건이 맞는지 검사, 단 하나의 추상메서드만 가졌는지 확인)
 * 
 * (int a) -> { return a * a}; 원래 식
 * (a) -> { return a * a }; 인자로 사용한 a의 타입은 runSomething()에서 알 수 있으므로 생략가능
 * a -> { return a * a }; 인자가 하나이고 자료형을 표기하지 않는 경우 소괄호를 생략가능
 * a -> a * a   코드가 단 한줄인 경우 {} 생략가능. 단 return 구문도 생략하고 세미콜론(;)도 없애야 함
 */

public class B005 {
	public static void main(String[] args) {
		MyFunctionalInterface mfi = (int a) -> { return a * a; };
		
		int b = mfi.runSomething(5);
		
		System.out.println(b);
	}
}

@FunctionalInterface
interface MyFunctionalInterface {
	public abstract int runSomething(int count);
}