package io.epicaracer.springmvc.lambda;

/* java 8 이전의 방식
 * 
 */
public class B002 {
	public static void main(String[] args) {
		Runnable r = new Runnable() {
			public void run() {
				System.out.println("Hello lambda 2!!!");
			}
		};
		
		r.run();
	}
}
