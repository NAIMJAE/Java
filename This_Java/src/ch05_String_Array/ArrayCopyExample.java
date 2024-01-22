package ch05_String_Array;
// 교재 p.188
public class ArrayCopyExample {
	public static void main(String[] args) {
		// 길이가 3인 배열
		String[] oldStrArray = {"java", "array", "copy"};
		// 길이가 5인 배열 생성
		String[] newStrArray = new String[5];
		// 배열 항목 복사
		for (int i = 0 ; i < oldStrArray.length ; i++) {
			newStrArray[i] = oldStrArray[i];
		}
		// 배열 항목 출력
		for (int i = 0 ; i < newStrArray.length ; i++) {
			System.out.println("newStrArray["+i+"] : " + newStrArray[i]);
		}
	}
}
