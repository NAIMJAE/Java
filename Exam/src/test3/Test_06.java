package test3;
/**
 * 날짜 : 2024/01/04
 * 이름 : 박임재
 * 내용 : Java 싱글톤 객체와 인스턴스 객체 연습문제
 */
class Adder {
	// Adder를 싱글톤 객체로 생성
	private static Adder instance = new Adder();
	public static Adder getInstance() {
		return instance;
	}
	// 다른 곳에서 new 못하게 private
	private Adder() {}
	
	private Adder(int value) {
		y += value;
	}
	private int x;
	private int y;
	
	public void add(int x, int y) {
		this.x += x;
		y++;
	}
	// int 타입으로 받을 배열 int[] arr 생성
	public void add(int[] arr) {
		this.x += arr[0];
		this.y += arr[1];
	}
	// 아래 main에서 a1의 리턴값이 Adder이라
	public static void add(Adder a2) {
		a2.x += 10;
		// .참조연산자가 나와서 a2는 객체다
	}
	// Adder의 생성자를 보면 calue는 int
	public static Adder add(Adder a3, int value) {
		return new Adder(value);
	}
	public void show() {
		System.out.println("x : " + x);
		System.out.println("y : " + y);
	}
}
public class Test_06 {
	public static void main(String[] args) {
		// 싱글톤 객체 받아오기 getInstance()
		Adder a1 = Adder.getInstance();
		
		a1.add(1, 2);  //
		a1.show();
		
		int[] arr = {10, 20};
		a1.add(arr);
		a1.show();
		// Adder 클래스로 호출 스태틱 메서드
		Adder.add(a1);
		a1.show();
		//
		a1 = Adder.add(a1, 3);
		a1.show();
	}
}
