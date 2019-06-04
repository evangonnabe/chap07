package io.epicaracer.springmvc.expert001_02;

public class Driver {
	public static void main(String[] args) {
		/* new를 통해 타이어를 생산하는 부분이 Car -> Driver로 이동
		 * 자동차가 생산될 때 어떤 타이어를 생산해서 자착할까를 자동차 스스로가 고민하지 않고
		 * 운전자가 어떤 타이어를 장착할까 고민하게 하는 것
		 * 
		 */
		Tire tire = new KoreaTire();
//		Tire tire = new AmreicaTire();
		
		Car car = new Car(tire);
		
		System.out.println(car.getTireBrand());
		
	}
}
