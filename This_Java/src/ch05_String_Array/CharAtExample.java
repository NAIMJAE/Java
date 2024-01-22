package ch05_String_Array;
// 교재 p/158
public class CharAtExample {
	public static void main(String[] args) {
		String ssn = "9610031095110";
		char sex = ssn.charAt(6);
		// charAt()는 매개값으로 주어진 인덱스의 문자를 리턴
		switch (sex) {
			case '1':
			case '3':
				System.out.println("남자입니다.");
				break;
			case '2':
			case '4':
				System.out.println("여자입니다.");
				break;
		}
	}
}
