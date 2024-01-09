package sub3;
/**
 * 날짜 : 2024/01/09
 * 이름 : 박임재
 * 내용 : Java StringBuilder 클래스 실습
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		
		// String immutable(불변성) 특성
		String str = "Hello";
		System.out.println("str 객체 주소 : " + System.identityHashCode(str));
		
		str += "world";
		System.out.println("str 객체 주소 : " + System.identityHashCode(str));
		System.out.println("str : " + str);
		
		// 메모리가 낭비되는 것을 최소화하기 위해
		// String immutable 단점을 개선한 StringBilder
		StringBuilder sb = new StringBuilder("Hello");
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		
		sb.append("world"); // StringBuilder는 같은 주소값(메모리)을 계속 사용
		System.out.println("sb 객체 주소 : " + System.identityHashCode(sb));
		System.out.println("sb : " + sb);
		
	}
}
