package ch06;

public class E_CarExample {
	public static void main(String[] args) {
		
		E_Car car1 = new E_Car();
		
		System.out.println(car1.company);
		
		E_Car car2 = new E_Car("그랜저");
		
		System.out.println(car2.company);
		System.out.println(car2.model);
		
		E_Car car3 = new E_Car("소나타", "검정");
		
		System.out.println(car3.company);
		System.out.println(car3.model);
		System.out.println(car3.color);

		E_Car car4 = new E_Car("아반떼", "빨강", 100);
		
		System.out.println(car4.company);
		System.out.println(car4.model);
		System.out.println(car4.color);
		System.out.println(car4.speed);
	}
}
// new 키워드를 이용해 E_Car 클래스를 다양하게 활용
// 오버로딩 매개변수 값을 다르게 하여 같은 이름의 생성자 여러개 사용
// 근데 이러면 중복되는 코드가 많다 생성자에서 this() 이용해 축약가능