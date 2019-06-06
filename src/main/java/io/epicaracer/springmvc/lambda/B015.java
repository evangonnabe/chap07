package io.epicaracer.springmvc.lambda;

import java.util.Arrays;
import java.util.function.BiFunction;

public class B015 {
	public static void main(String[] args) {
		Double[] nums = {1.0, 4.0, 9.0, 16.0, 25.0 };
		
		System.out.println("===== Lambda =====");
		
		Arrays.stream(nums)
			.map(num -> Math.sqrt(num))
			.forEach(sqrtNum -> System.out.println(sqrtNum)); 

		System.out.println("===== Method Reference =====");
		
		Arrays.stream(nums)
		.map(Math::sqrt) //클래스::정적메서드, 람다식의 인자는 정적메서드의 인자가 된다.
		.forEach(System.out::println); //인스턴스::인스턴스메서드, 인스턴스 메서드의 인자가 된다.

		BiFunction<Integer, Integer, Integer> bip_lambda = (a, b) -> a.compareTo(b);
		BiFunction<Integer, Integer, Integer> bip_method_reference = Integer::compareTo; //클래스::인스턴스메서드
		//첫번째 인자는 인스턴스가 되고 그 다음 인자(들)은 인스턴스 메서드의 인자(들)가 된다.
		//(a, b) -> a.compareTo(b)

		System.out.println(bip_lambda.apply(10, 12));
		System.out.println(bip_lambda.apply(10, 10));
		System.out.println(bip_lambda.apply(10, 2));
	
		System.out.println(bip_method_reference.apply(10, 12));
		System.out.println(bip_method_reference.apply(10, 10));
		System.out.println(bip_method_reference.apply(10, 2));
	}
}
