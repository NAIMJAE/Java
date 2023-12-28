package test1;
/**
 * 
 * 날짜 : 2023/12/28
 * 이름 : 박임재
 * 내용 : Java 연산자 연습문제
 */
public class Test_03 {
	public static void main(String[] args) {
		
		int result = 0;
		int num = 1;
		
		// --,++ 의 위치에 따라서 연산 후 합산 과 합산 후 연산 차이
		result = num++;    // result = 0+1+(1) / num = 1+1
		System.out.println("result : " + result);

		result = ++num;    // result = 2+1 / num = 2+1
		System.out.println("result : " + result);
		
		result = num--;    // result = 3-(1) / num = 3-1
		System.out.println("result : " + result);
		
		result = --num;    // result = 2-1 / num = 2-1
		System.out.println("result : " + result);
		
	}
}
