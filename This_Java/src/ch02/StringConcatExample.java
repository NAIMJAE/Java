package ch02;
// 교재 p.64
public class StringConcatExample {
	public static void main(String[] args) {
		// 숫자 연산
		int result1 = 10 + 2 + 8;
		System.out.println("result1 : " + result1);
		
		// 결합 연산
		// 피연산자 중 하나가 문자열이면 나머지도 문자열로 변경 후 연산
		// but. 순차적으로 연산 {(정수 + 정수)문자열로 변환} + 문자열
		String result2 = 10 + 2 + "8";
		System.out.println("result2 : " + result2);
		
		String result3 = 10 + "2" + 8;
		System.out.println("resylt3 : " + result3);

		String result4 = "10" + 2 + 8;
		System.out.println("resylt4 : " + result4);
		
		String result5 = "10" + (2 + 8);
		System.out.println("resylt5 : " + result5);
		
		}
}
