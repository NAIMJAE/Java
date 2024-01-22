package GPT06;

public class Calmain {
	public static void main(String[] args) {
        Calculator calculator = new Calculator();
        
        int numerator = 10;
        int denominator = 0;

        try {
            double result = calculator.divide(numerator, denominator);
            System.out.println("나눗셈 결과: " + result);
        } catch (ArithmeticException e) {
            System.out.println("예외 발생: " + e.getMessage());
            // 사용자에게 다른 처리 방법을 안내하거나 필요한 추가 작업을 수행할 수 있습니다.
        }
    }
}
