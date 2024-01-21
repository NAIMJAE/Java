package ch06_Class;
// 교재 p.217, p.220
public class B_CarExamplee {
	public static void main(String[] args) {
		// B_Car 클래스 참고하여 myCar 객체 생성
		B_Car myCar = new B_Car();
					
		// myCar 객체의 필드값 참조
		System.out.println("제작회사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색깔 : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);

		// Car 객체의 필드값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
	}
}