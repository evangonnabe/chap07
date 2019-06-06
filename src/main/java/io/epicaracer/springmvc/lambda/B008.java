package io.epicaracer.springmvc.lambda;

/*
 * 메서드 인자로 람다식(함수형 인터페이스)  사용
 * 
 */
public class B008 {
	public static void main(String[] args) {
//		MyFunctionalInterface mfi = a -> a * a;

		doIt(a -> a * a);

	}

	private static void doIt(MyFunctionalInterface mfi) {
		int b = mfi.runSomething(5);
		System.out.println(b);

	}
}
