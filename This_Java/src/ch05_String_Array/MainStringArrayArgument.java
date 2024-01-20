package ch05_String_Array;
// 교재 p.192
public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2) { // 입력된 데이터의 개수가 두 개가 아닐 경우
			System.out.println("프로그램 입력값이 부족");
			System.exit(0); // 프로그램 강제 종료
		}
		
		String strNum1 = args[0];
		String strNum2 = args[1];
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		
		int result = num1 + num2;
		System.out.println(num1 + " + " + num2 + " = " + result);
	}
}
// 이클립스 상단 메뉴 [Run] - [Run Configurations] 의 
// project 입력란 'Thisisjava' 입력란에 'MainStringArrayArgument'
// [Argument] 탭의 Program arguments 란에 10과 20 입력 그리고 [Run]