package ch06_Class;

public class D_KoreanExample {
	public static void main(String[] args) {
		// D_Korean 객체 생성
		D_Korean k1 = new D_Korean("홍길동", "0154-54030");
		
		// D_Korean 의 필드값 참조하여 출력
		System.out.println("K1.nation : " + k1.nation);
		System.out.println("K1.name : " + k1.name);
		System.out.println("K1.ssn : " + k1.ssn);
		System.out.println();
		
		// D_Korean 또 다른 객체 생성
		D_Korean k2 = new D_Korean("임꺽정", "0154-1254030");
			
		// D_Korean 의 필드값 참조하여 출력
		System.out.println("K2.nation : " + k2.nation);
		System.out.println("K2.name : " + k2.name);
		System.out.println("K2.ssn : " + k2.ssn);
		System.out.println();
				
	}
}
