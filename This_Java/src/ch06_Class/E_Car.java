package ch06_Class;
// 교재 p.225
public class E_Car {
	// 필드 선언
	String company = "현대";
	String model;
	String color;
	int speed;
	
	// 생성자 선언
	E_Car() {}
	
	E_Car(String model) {
		this.model = model;
	}

	E_Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	E_Car(String model, String color, int speed) {
		this.model = model;
		this.color = color;
		this.speed = speed;
	}
}
