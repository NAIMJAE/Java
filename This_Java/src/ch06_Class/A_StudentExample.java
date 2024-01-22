package ch06_Class;

public class A_StudentExample {
	public static void main(String[] args) {
		A_student s1 = new A_student();
		System.out.println("S1 변수가 A_Student 객체를 참조");
		
		A_student s2 = new A_student();
		System.out.println("S2 변수가 또 다른 A_Student 객체를 참조");
	}
}
// A_Student 클래스를 참고해 HEAP영역에 s1, s2 객체 생성
// new 키워드 이용 / s1, s2는 서로 다른 영역