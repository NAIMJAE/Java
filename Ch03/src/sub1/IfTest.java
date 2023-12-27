package sub1;

/**
 * 
 * 날짜 : 2023/12/27
 * 이름 : 박임재
 * 내용 : Java 조건문 if 실습하기
 */
public class IfTest {
	
	public static void main(String[] args) {
		
		// if
		int num1 = 1;
		int num2 = 2;
		
		if(num1 < num2) {
			
			System.out.println("num1은 num2보다 작다.");
		
		} 
		
		if (num1 > 1) {
			
			System.out.println("num1은 1보다 크다.");
			
		} // 거짓이면 실행값없고 건너뜀.
		
		
		// 중복과 &&는 내용적으로 같다.
		if (num1 > 0) {
			if (num2 > 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
			}
		}
		
		if (num1 > 0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 그리고 num2는 1보다 크다.");
		}
		
		// if ~ else
		int var1 = 1;
		int var2 = 2;
		
		if (var1 > var2) {
			// 조건이 참 일때
			System.out.println("var1이 var2보다 크다.");
		}else {
			// 조건이 거짓 일때
			System.out.println("var1이 var2보다 작다.");
		}
		
		// if ~ else if ~ else
		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		
		if (n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
		}else if(n2 < n3){
			System.out.println("n2이 n3보다 크다.");
		}else if(n3 < n4) {
			System.out.println("n3이 n4보다 크다.");
		}else {
			System.out.println("n4가 가장 크다.");
		}
		// 흐름의 우선순위에 따라서 먼저 조건이 맞는 것만 실행되고 종료!
		
	}
}
