package ch06_Class;

public class F_CalculatorTest {

	public static void main(String[] args) {
		// F_Calculator 객체 생성
		F_Calculator mycal = new F_Calculator();
		
		// 리턴값이 없는 powerOn() 메서드 호출
		mycal.powerOn();
		
		// plus 메서드 호출 시 5와 6을 매개값으로 제공
		// 덧셈 결과를 리턴 받아 result1 변수에 대입
		int result1 = mycal.plus(5, 6);
		System.out.println("result1 : " + result1);
		
		int x =10;
		int y = 4;
		// divide() 메서드 호출 시 변수 x와 y값을 매개값으로 제공하고
		// 나눗셈 결과를 리턴 받아 result2 변수에 대입
		double result2 = mycal.divide(x, y);
		System.out.println("result2 : " + result2);
		
		// 리턴값이 없는 powerOff() 메서드 호출
		mycal.powerOff();
		
	}
}
