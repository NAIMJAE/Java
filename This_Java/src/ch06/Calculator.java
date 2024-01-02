package ch06;
// 교재 p.231
public class Calculator {

	private static Calculator instance = new Calculator();
	public static Calculator getInstance() {
		return instance;
	}
	private Calculator() {} 
	
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}

	void powerOff() {
		System.out.println("전원을 끕니다.");		
	}

	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}

}
