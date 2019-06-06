package io.epicaracer.springmvc.lambda;

/* java 8 이후의 방식
 * (인자 목록) -> { 로직 }
 * 코드 블럭이 한줄인 경우는 블록 기호 생략 가능
 */
public class B003 {
	public static void main(String[] args) {
		Runnable r = () -> {
			System.out.println("Hello lamda 3!!!");
		};
		
		r.run();
	}
}
