package test2;
/**
 * 날짜 : 2023/12/29
 * 이름 : 박임재
 * 내용 : Java 배열 문자 출력 연습문제
 */
public class Test_01 {
	public static void main(String[] args) {
		
		char str[] = {'I', ' ', 'L', 'O', 'V', 'E', ' ', 'Y', 'O', 'U'};
		int row, col;
		
		for (row = 1; row < 10 ; row++) {
			
			for (col = 0; col <= row ; col++) {
				
				System.out.print(str[col]);
				
			}
			
			System.out.println("\n");
		}
		
		
	}
}
