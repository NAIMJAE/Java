package ch05_String_Array;
// 교재 p.159
public class LengthExample {
	public static void main(String[] args) {
		String ssn = "9610031095110";
		int length = ssn.length();
		if(length == 13) {
			System.out.println("13자리가 맞습니다.");
		}else {
			System.out.println("13자리가 아닙니다.");
		}
	}
}
