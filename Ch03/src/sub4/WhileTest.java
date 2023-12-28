package sub4;

/**
 * 
 * 날짜 : 2023/12/28
 * 이름 : 박임재
 * 내용 : Java 반복문 While 실습
 */
public class WhileTest {
	public static void main(String[] args) {
		
		// 1부터 10까지 합
		int sum = 0;
		int k = 1;
		
		while(k <= 10) {
			sum += k;
			k++;
		}
		
		System.out.println("1부터 10까지 합 : " + sum);
		
		// 1부터 10까지 홀수 합
		int tot = 0;
		int j = 1;
		
		while(j <= 10) {
			if (j % 2 == 1) {
				tot += j;
			}
			j++;			
		}
		System.out.println("1부터 10까지 홀수 합 : " + tot);
		
		// do-while
		int eSum = 0;
		int i = 1;
		
		do {
			if (i % 2 == 0) {
				eSum += i;
			}
			i++;
		}while(i <= 10);
		
		System.out.println("1부터 10까지 짝수 합 : " + eSum);
		
		// break
		int num = 1;
		
		while(true) {
			if (num % 5 == 0 && num % 7 == 0) {
				break;
			}
			num++;
		}
		
		System.out.println("5와 7의 최소공배수 : " + num);
		
		// continue
		int total = 0;
		int n = 1;
		
		while(n <=10) {
			n++;
			if(n % 2 == 1) { // 홀수 필터링
				continue; // 처음으로 이동
			}
			total += n;
		}
		
		System.out.println("1부터 10까지 짝수 합 : " + total);
		
	}
}
