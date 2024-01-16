package sub1;
/**
 * 날짜 : 2024/01/16
 * 이름 : 박임재
 * 내용 : Java 함수형 프로그래밍 실습
 * 
 * 함수형 프로그래밍
 * - 프로그래밍 단위를 함수(메서드) 위주로 프로그래밍하는 패러다임
 * - 자바는 객체지향이리때문에 프로그래밍 단위는 Class
 * - 함수형 프로그래밍을 람다식으로 구현
 */

interface A {
	public void hello(); // 추상 메서드
}

class B implements A {
	@Override
	public void hello() {
		System.out.println("HELLO");
	}
}

public class FunctionalTest {
	public static void main(String[] args) {
		
		// 객체지향 프로그래밍
		A a1 = new B(); // 업캐스팅
		a1.hello(); // 객체지향의 기본
		
		// 익명 객체 (인터페이스를 클래스로 구현하지 않고 객체로 바로 생성)
		A a2 = new A() {  
			@Override
			public void hello() {
				System.out.println("HELLO...");
			}
		};
		a2.hello();
		
		// 함수형 프로그래밍
		A a3 = () -> {System.out.println("WORLD");};
		a3.hello();
		
	}
}
