package ch05_String_Array;
// 교재 p.161
public class SubStringExample {
	public static void main(String[] args) {
		String ssn = "961003-1095110";
				
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);	
		
		String secondNum = ssn.substring(7);
		System.out.println(secondNum);
		
		// subString() 문자열 잘라내기
		// subString(int beginIndex);
		// subString(int beginIndex, int endIndex);
	}
}
