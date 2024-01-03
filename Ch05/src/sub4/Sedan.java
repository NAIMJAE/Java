package sub4;

public class Sedan extends Car { 
	// extends = 상속 키워드 /Car 클래스의 기능과 속성을 물려받는다
	// 부모의 속성을 자식이 초기화위해 부모의 생성자를 호출
	
	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed);  // super 부모클래스의 생성자 호출 키워드
		this.cc = cc;  // 자식클래스 생성자 초기화
	}
	
	public void speedTurbo() {
		this.speed += 20;
		// 부모 클래스에서 속성값이 private로 선언되면 참조 불가능
		// 자식 클래스에만 참조가능하게 해주어야함
		// 부모 클래스에서 속석 값에 protected를 선언
	}
	public void show() {
		super.show();
		System.out.println("배기량 : " + this.cc);
	}
	
}
