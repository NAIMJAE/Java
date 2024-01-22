package GPT06;

public class Calculator {
	
	
	public double divide(int a,int b) throws ArithmeticException {
		if (b == 0) {
			throw new ArithmeticException("0으로 나눌 수 없다");
		}
		return(double) a / b;
	}
}
