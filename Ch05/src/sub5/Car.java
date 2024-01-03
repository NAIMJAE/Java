package sub5;

public class Car {
	// 속성들
	protected String name;  // protected 자식 클래스에서 참조할 수 있도록
	protected String color;
	protected int speed;
	// 생성자 초기화
	public Car(String name, String color, int speed) {
		this.name = name;
		this.color = color;
		this.speed = speed;
	}
	// 기능들
	public void speedUp(int speed) {
		this.speed += speed;
	}
	
	public void speedDown(int speed) {
		this.speed -= speed;
	}
	
	public void show() {
		System.out.println("차량명 : " + this.name);
		System.out.println("차량색 : " + this.color);
		System.out.println("현재속도 : " + this.speed);
	}
	
	
}
