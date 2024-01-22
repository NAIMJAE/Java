package ch05_String_Array;
// 교재 p.157
public class EmptyStringExample {
	public static void main(String[] args) {
		String hobby = "";
		if(hobby.equals("")) {
			System.out.println("hobby 변수가 참조하는 String 객체는 빈 문자열");
			// 빈 문자열도 역시 String 객체로 생성됨
		}
	}
}
