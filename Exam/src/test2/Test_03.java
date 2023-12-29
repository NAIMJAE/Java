package test2;
/**
 * 날짜 : 2023/12/29
 * 이름 : 박임재
 * 내용 : Java 배열 역순으로 정렬 연습문제
 */
public class Test_03 {
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		// 현재 배열 출력
		for (int i = 0; i < 10 ; i++) {
			System.out.print(arr[i]+", ");
		}
		
		System.out.print("\n");
		
		// 배열의 원소를 역순으로 정렬
		for (int j = 0; j < 5 ; j++) {
			int temp = arr[j];
			// 순서를 바꾸기 위해서는 덮어써야하는데 원래 값이 날라가니 임시저장
			arr[j] = arr [9 - j];
			arr[9 - j] = temp;
		}
	
		
		// 역순으로 정렬된 배열 출력
		for (int n : arr) {
			System.out.print(n+", ");
		}
	}
}
