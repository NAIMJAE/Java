package ch05_String_Array;
// 교재 p.164
public class SplitExample {
	public static void main(String[] args) {
		String board = "1kk자바 학습kk참조 타입 String을 학습합니다.kk홍길동";
		
		// split() 주어진 값을 기준으로 문자열을 분리
		// split()을 이용해 문자열로 구성된 배열을 얻을 수 있다.
		// 문자열 분리
		String[] tokens = board.split("kk");
		
		// 인덱스별로 읽기
		System.out.println("번호 : " + tokens[0]);
		System.out.println("번호 : " + tokens[1]);
		System.out.println("번호 : " + tokens[2]);
		System.out.println("번호 : " + tokens[3]);
		System.out.println();
		
		// for 문을 이용한 읽기
		for(int i = 0 ; i < tokens.length ; i++) {
			System.out.println(tokens[i]);
		}
	}
}
