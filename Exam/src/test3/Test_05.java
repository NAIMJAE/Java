package test3;
/**
 * 날짜 : 2024/01/04
 * 이름 : 박임재
 * 내용 : Java 싱글톤 객체 연습문제
 */
class Vehicle {
	private String name;
	private int price;
	
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("============");
		System.out.println("차량명 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("------------");
	}
}

class CarFactory {
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}
	// new Vehicle을 return하므로 Vehicle
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
		// Vehicle aa = new Vehicle(name, price);
		// return aa;
		
	}
}
public class Test_05 {
	public static void main(String[] args) {
		
		CarFactory factory = CarFactory.getInstance();
		
		Vehicle avante = factory.createCar("아반떼", 2500);
		Vehicle sonata = factory.createCar("소나타", 3000);
		
		avante.info();
		sonata.info();
	}
}
