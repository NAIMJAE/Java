package sub6;
/**
 * 날짜 : 2024/01/03
 * 이름 : 박임재
 * 내용 : Java 다형성 실습
 */
public class PolyTest {
	public static void main(String[] args) {
		
		// 업캐스팅으로 다형성 구현
		// 타입을 부모 클래스로 설정
		Animal t = new Tiger();
		t.move();
		t.hunt();
		
		Animal e = new Eagel();
		e.move();
		e.hunt();
		
		Animal s = new Shark();
		s.move();
		s.hunt();
		
		// 객체 타입 비교 연산 / instanceof 연산자
		if (t instanceof Tiger) {
			System.out.println("Tiger 입니다");
		}
		if (e instanceof Eagel) {
			System.out.println("Eagel 입니다");
		}
		if (s instanceof Shark) {
			System.out.println("Shark 입니다");
		}
		
	}
}
