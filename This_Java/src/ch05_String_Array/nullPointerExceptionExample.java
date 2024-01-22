package ch05_String_Array;
// 교재 p.151
public class nullPointerExceptionExample {
	public static void main(String[] args) {
		
		int[] intArray = null; // 아직 intArray 배열이 번지수를 참조하고 있지 않음
		//intArray[0] = 10; // nullPointException 발생
		
		String str = null; // String도 마찬가지
		//System.out.println("총 문자 수 : " + str.length());
		
		// 참조타입의 변수는 null값이면 아무 번지도 참조하지 않기 때문에 nullPointException 발생
	}
}
