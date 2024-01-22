package ch05_String_Array;
// 교재 p.186
public class ArrayReferenceObjectExample {
	public static void main(String[] args) {
		String[] strArray = new String[3];
		strArray[0] = "Java";
		strArray[1] = "Java";
		strArray[2] = new String("Java");
		
		// strArray[0]과 strArray[1] 은 같은 객체 참조
		// strArray[2]는 새로 만든 객체 참조
		// 하지만 strArray[1]과 strArray[2]는 같은 값을 가짐
		System.out.println(strArray[0] == strArray[1]);
		System.out.println(strArray[0] == strArray[2]);
		System.out.println(strArray[0].equals(strArray[2]));
	}
}
