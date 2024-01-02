package ch06;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator cal1 = Calculator.getInstance();
		
		int rs1 = cal1.plus(2, 3);
		
		System.out.println(rs1);
		
	}
}
