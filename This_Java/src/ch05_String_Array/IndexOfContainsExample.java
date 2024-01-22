package ch05_String_Array;
// 교재 p.163
public class IndexOfContainsExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		// "프로그래밍" 문자열이 시작하는 인덱스 값 3을 반환
		
		String subString = subject.substring(location);
		System.out.println(subString);
		// subString(3) => subject의 인덱스 번호 3부터 출력
		
		// 문자열에서 특정 문자열의 위치를 찾을때 indexOf() 메서드 사용
		// indexOf()는 특정 문자열이 시작되는 인덱스를 리턴
		
		// 만약 indexOf()에서 주어진 문자열이 포함되지 않으면 '-1'을 리턴
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책입니다.");
		}else {
			System.out.println("자바와 관련 없는 책입니다.");
		}
		
		// 단순하게 주어진 문자열이 포함되어 있는지만 조사할때는 contains() 메서드 사용
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책입니다.");
		} else {
			System.out.println("자바와 관련 없는 책입니다.");
		}
	}
}
