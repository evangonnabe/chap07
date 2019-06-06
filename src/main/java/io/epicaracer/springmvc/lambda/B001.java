package io.epicaracer.springmvc.lambda;

public class B001 {
	/* 람다 - 코드 블록
	 * 메서드의 인자나 반환값으로 사용 가능 -> 변수처럼 사용
	 * 
	 */
	public static void main(String[] args) {
		MyTest mt = new MyTest();
		
		Runnable r = mt;
		
		r.run();
	}
}	
class MyTest implements Runnable {
	public void run() {
		System.out.println("Hello lambda!!!");
	}
}

