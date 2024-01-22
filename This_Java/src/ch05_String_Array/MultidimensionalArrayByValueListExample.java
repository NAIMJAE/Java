package ch05_String_Array;
// 교재 p.178
public class MultidimensionalArrayByValueListExample {
	public static void main(String[] args) {
		// 2차원 배열 생성
		int[][] scores = {
					{80, 90, 96},
					{76, 88}
		};
		
		// 배열의 길이
		System.out.println("1차원 배열의 길이 : " + scores.length);
		System.out.println("2차원 배열의 길이(첫번째) : " + scores[0].length);
		System.out.println("2차원 배열의 길이(두번째) : " + scores[1].length);
		
		// 첫 번째 배열의 3번째 값
		System.out.println(scores[0][2]);
		
		// 두 번째 배열의 2번째 값
		System.out.println(scores[1][1]);
		
		// 첫 번째 배열의 평균 구하기
		int sum1 = 0;
		for(int i = 0 ; i <scores[0].length ; i++) {
			sum1 += scores[0][i];
		}
		double avg1 = (double)sum1/scores[0].length;
		System.out.println("첫 번째 배열의 평균 : " + avg1);
		
		// 두 번째 배열의 평균 구하기
		int sum2 = 0;
		for(int i = 0 ; i <scores[1].length ; i++) {
			sum2 += scores[1][i];
		}
		double avg2 = (double)sum2/scores[1].length;
		System.out.println("첫 번째 배열의 평균 : " + avg2);
		
		// 전체 배열의 평균 구하기
		int sum3 = 0;
		int arraySum = 0;
		for(int i = 0 ; i <scores.length ; i++) {
			arraySum += scores[i].length;
			for(int j = 0 ; j <scores[i].length ; j++) {
				sum3 += scores[i][j];
			}
		}
		double avg3 = (double)sum3/arraySum;
		System.out.println("첫 번째 배열의 평균 : " + avg3);
		
	}
}
