package sub2;

public class Car {

	// 속성(필드) -> 캡슐화 시킴
	private String name;
	private String color;
	private int speed;
	
	// 생성자 - 캡슐화된 속성을 초기화하기 위한 메서드
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	
	}
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
	// color을 위한 Getter, Setter - 필요에 따라서 정의
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
		
	
}
