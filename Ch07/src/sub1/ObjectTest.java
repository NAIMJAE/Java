package sub1;
/**
 * 날짜 : 2024/01/09
 * 이름 : 박임재
 * 내용 : Java Object 클래스 실습
 */
public class ObjectTest {
	public static void main(String[] args) {
	
		// Apple a1 = new Apple("한국", 3000); 이 아니라
		// 다형성 가능 -> 업캐스팅
		Object a1 = new Apple("한국", 3000);
		Object a2 = new Apple("한국", 3000);
		
		// toString은 암시적으로 호출 가능
		System.out.println(a1);
		System.out.println(a2);
		
		// 객체 비교
		// a1, a2는 참조변수라서 주소 값을 비교 
		if (a1 == a2) {
			System.out.println("a1, a2 주소가 같다.");
		}else { 
			System.out.println("a1, a2 주소가 다르다.");
		}
		
		// ☆ a1, a2가 가리키는 HEAP 영역의 인스턴스 실체를 비교 ☆
		// .equals 객체 비교
		if (a1.equals(a2)) {
			System.out.println("a1, a2 객체가 같다.");
		}else { 
			System.out.println("a1, a2 객체가 다르다.");
		}
		
	}
}
