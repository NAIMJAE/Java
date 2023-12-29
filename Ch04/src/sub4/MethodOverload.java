package sub4;
/**
 * 날짜 : 2023/12/29
 * 이름 : 박임재
 * 내용 : Method Overload 실습
 * 
 * Method Overload
 * - 같은 이름의 메서드를 매개변수로 구분한 메서드
 * - 매개변수 갯수, 타입으로 구분
 * - 반환타입은 메서드 오버로드 지원 안됨
 */
public class MethodOverload {
	public static void main(String[] args) {
		
		int result1 = add(3);
		int result2 = add(1, 2);
		double result3 = add(1, 2);
		String result4 = add("Hello", "World");
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		
	}
	
	// Method Overloading
	public static int add(int a) {
		
		return a + a;
	}
	
	public static int add(int a, int b) {
		
		return a + b;
	}

	public static double add(double a, double b) {
		
		return a + b;
	}

	public static String add(String a, String b) {
		
		return a + b;
	}
	
	
	
}
