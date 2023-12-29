package sub2;
/**
 * 날짜 : 2023/12/29
 * 이름 : 박임재
 * 내용 : 매서드 실습
 */
public class MethodTest {
	// main method : 자바 프로그램 시작 메서드
	public static void main(String[] args) {
		
		// 메서드 호출
		int y1 = f(1);
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(y3);
		
		// 메서드 지역변수 콜스택 = (메서스가 사용될때 사용한 스택)
		int t1 = sum(1, 10);
		int t2 = sum(1, 100);
		
		System.out.println("t1 : " + t1);
		System.out.println("t2 : " + t2);
		
		
		
	} // main end
	
	// 전역변수
	int num = 1;
	
	// 메서드 정의 public void f() {} -> 일반적인 메서드 구조
	public static int f(int x) {
		// 지역변수 y
		int y = 2 * x + 3;
		return y;
	}
	
	public static int sum(int start, int end) {
		int total = 0;
		for(int k=start ; k<=end ; k++) {
			total += k;
		}
		return total;
	}
}
