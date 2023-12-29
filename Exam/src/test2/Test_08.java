package test2;
/**
 * 날짜 : 2023/12/29
 * 이름 : 박임재
 * 내용 : Java 팩토리얼 재귀 Method 연습문제
 */
public class Test_08 {
	public static void main(String[] args) {
		
		System.out.println("3! = " +factorial(3));
		System.out.println("4! = " +factorial(4));
		System.out.println("5! = " +factorial(5));
	}
	
	public static int factorial(int n) {
		
		if (n <= 1) {
			return 1;
		}
		
		return n * factorial(n-1);
	}
}
