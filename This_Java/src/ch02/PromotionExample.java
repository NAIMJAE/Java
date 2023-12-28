package ch02;
// 교재 p.54
public class PromotionExample {
	public static void main(String[] args) {
		// 자동 타입 변환
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue : " + intValue);

		// '가'를 유니코드로 변환
		char charValue = '가';
		intValue = charValue;
		System.out.println("'가'의 유니코드 : " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue : " + longValue);

		// long 정수를 float 실수로 변환
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue : " + floatValue);
		
		// 뒤에 F 사라짐
		floatValue = 100.5F;
		double doubleValue = floatValue;
		System.out.println("doubleValue : " + doubleValue);
		
	}
}
