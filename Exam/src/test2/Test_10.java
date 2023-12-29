package test2;
/**
 * 날짜 : 2023/12/29
 * 이름 : 박임재
 * 내용 : Java 파보나치 수열 재귀 Method 연습문제
 */
public class Test_10 {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print(fibo(i)+" ");
		}
	}
	
	public static int fibo(int n) {
		
		if(n <= 1) {
			return n;
		}
		
		return fibo(n-2) + fibo(n-1);
	}
}
