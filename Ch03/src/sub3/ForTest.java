package sub3;

/**
 * 날짜 : 2023/12/27
 * 이름 : 박임재
 * 내용 : Java 반복문 for 실습
 *  - for(초기식(반복변수) ; 조건식 ; 증감식)
 *  - for문 속에 for문은 속의 for문이 끝날때 까지~
 */
public class ForTest {
	
	public static void main(String[] args) {
		
		// for
		//for(초기식(반복변수) ; 조건식 ; 증감식)
		for(int i=1 ; i<=5 ; i++) {
			System.out.println("i : " + i);
		}
		
		// 1부터 10까지 합
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			sum += k; // (= sum = sum + k;)
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		// 1부터 10까지 짝수합
		int tot = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			
			if(k % 2 == 0) {
				tot += k;
			}
			
		}
		System.out.println("1부터 10까지 짝수합 : " + tot);
		
		// for 종결
		for(int a=1 ; a<=3 ; a++) {
			
			System.out.println("a : " + a);
			
			for(int b=1 ; b<=5 ; b++) {
				
				System.out.println("b : " + b);
				
			}
		}
		
		// 구구단
		for(int x=2 ; x<=9 ; x++) {
			
			System.out.println(x+"단");
			
			for(int y=1 ; y<=9 ; y++) {
				
				int z = x * y;
				System.out.printf("%d x %d = %d\n", x, y, z); // printf = 형식을 지정해서 출력
			}
			
		}
		
		// 별삼각형
		for(int start=1 ; start <= 10 ; start++) {
			
			for(int end=1 ; end <= start ; end++) {
				
				System.out.print("★");
			}
			System.out.println();
			
		}
		
		for(int start=1 ; start <= 10 ; start++) {
			
			for(int end=10 ; end >= start ; end--) {
				
				System.out.print("★");
			}
			System.out.println();
			
		}
		
		for(int start=10 ; start >= 1 ; start--) {
			
			for(int end=1 ; end <= start ; end++) {
				
				System.out.print("★");
			}
			System.out.println();
			
		}
		
	}

}
