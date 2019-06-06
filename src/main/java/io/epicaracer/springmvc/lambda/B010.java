package io.epicaracer.springmvc.lambda;

import java.util.function.*;
/* java.util.function 패키지에서는 총 43개의 함수형 인터페이스를 제공.
 * 만일 43개 중 필요로 하는 것이 없다면 사용자 정의 함수형 인터페이스를 정의해서 사용.
 * 
 */
public class B010 {
	public static void main(String[] args) {
		Runnable run = () -> System.out.println("hello");
		Supplier<Integer> sup = () -> 3 * 3;
		Consumer<Integer> con = num -> System.out.println(num);
		Function<Integer, String> fun = num -> "input: " + num;
		Predicate<Integer> pre = num -> num > 10;
		UnaryOperator<Integer> uOp = num -> num * num;
		
		BiConsumer<String, Integer> bCon = (str, num) -> System.out.println(str + num);
		BiFunction<Integer, Integer, String> bFun = (num1, num2) -> "add result: "  + (num1 + num2);
		BiPredicate<Integer, Integer> bPre = (num1, num2) -> num1 > num2;
		BinaryOperator<Integer> b0p = (num1, num2) -> num1 - num2;
		
	}
}
