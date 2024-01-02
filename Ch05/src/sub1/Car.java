package sub1;

public class Car {

	// 속성(핃드)
	String name;
	String color;
	int speed;
	
	
	// 기능(메서드)
	// this 문법 -> 클래스 내부의 변수를 참조
	public void speedup(int speed) {
		this.speed += speed; // 매개변수? 전역변수?
	}

	public void speeddown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
}
