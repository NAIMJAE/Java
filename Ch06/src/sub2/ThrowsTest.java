package sub2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 날짜 : 2024/01/08
 * 이름 : 박임재
 * 내용 : Java 예외 던지기 실습
 */

// 호출 순서
// JVM -> main -> method1 -> method2
public class ThrowsTest {
	public static void main(String[] args) {
		
		try {
			method1(10);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
	}
	
	public static void method1(int n1) 
		throws Exception {
		method2(n1);
	}
	
	// 입력과 result에서 예외 발생 가능
	public static void method2(int n2) 
		throws Exception {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int input = sc.nextInt();
		
		int result = n2 / input;
		System.out.println("result : " + result);
	}
}
