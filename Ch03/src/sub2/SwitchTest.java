package sub2;

import java.util.Scanner;

/**
 * 날짜 : 2023/12/27
 * 이름 : 박임재
 * 내용 : Java 조건문 Switch 실습
 */
public class SwitchTest {

	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		// System.out -> 콘솔 / System.in -> 키보드
		
		// 사용자 입력
		Scanner scan = new Scanner(System.in);
			int number = scan.nextInt();
			System.out.println("입력한 숫자 : " + number );
			
		// swtich는 조건문이 아니라 조건값
		switch(number % 2) {
		case 0:
			System.out.println("number는 짝수 입니다.");
			break;
		case 1:
			System.out.println("number는 홀수 입니다.");
			break;
		}
	}
}
