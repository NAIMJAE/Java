package ch05_String_Array;
// 교재 p.175
public class ArrayLengthExample {
	public static void main(String[] args) {
		// 배열 변수 선언과 배열 대입
		int[] scores = {84, 90, 96};
		
		// 배열 항목의 총합 구하기
		int sum = 0;
		for(int i = 0 ; i < scores.length ; i++) {
			sum += scores[i];
		}
		System.out.println("배열의 총합 : " + sum);
		
		// 배열 항목의 평균 구하기
		double avg = sum / scores.length;
		System.out.println("배열의 평균 : " + avg);
	}
}
