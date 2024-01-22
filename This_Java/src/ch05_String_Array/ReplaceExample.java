package ch05_String_Array;
// 교재 p.160
public class ReplaceExample {
	public static void main(String[] args) {
		String oldStr = "자바 문자열은 불변입니다. 자바 문자열은 String입니다.";
		String newStr = oldStr.replace("자바", "Java");
		// replace(수정전, 수정후) 는 String 객체를 변경하는 것이 아닌
		// 이전의 String 객체를 참조해 수정된 새로운 String 객체를 생성
		
		System.out.println(oldStr);
		System.out.println(newStr);
	}
}
