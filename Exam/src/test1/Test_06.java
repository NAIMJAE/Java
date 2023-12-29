package test1;

import java.util.Scanner;

/**
 * 
 * 날짜 : 2023/12/28
 * 이름 : 박임재
 * 내용 : Java 삼항연산자 연습문제
 */
public class Test_06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("x값 입력 : ");
		int x = sc.nextInt();
		
		System.out.print("y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 큽니다." : "y가 더 큽니다.";
		// println에서 문자열로 받을거니 String
		// 삼항연산자 앞에는 조건 ? 뒤로는 true면 첫번째 결과, false면 두번째 결과
		System.out.println(result);
		
		sc.close();
	}
}
