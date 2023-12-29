package test1;
/**
 * 
 * 날짜 : 2023/12/28
 * 이름 : 박임재
 * 내용 : Java 반복문 연습문제
 */
public class Test_08 {
	public static void main(String[] args) {
		
		int n = 5;
		
		for(int i=0 ; i<n ; i++) { // n=5 i=1 j=4
			
			for(int j=n-1 ; j>i ; j--) { // j=1 i=0
				System.out.print(" ");
			}
			for(int j=0 ; j <= 2*i ; j++) {
				System.out.print("*");
			}
		
			System.out.println("\n");
		}
	}
}
/**
i = 0 j = ~0 
1단 - 1개

i = 1 j = ~1
2단 - 3개

i = 2 j = ~2
3단 - 5개

i = 3 j = ~3
4단 - 7개

i = 4 j = ~4
5단 - 9개
*/