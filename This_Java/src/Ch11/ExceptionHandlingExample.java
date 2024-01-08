package Ch11;
// 교재 p.466
public class ExceptionHandlingExample {
	public static void PrintLength (String data) {
		try {
			int result = data.length();
			System.out.println("문자 수 : " + result);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("[마무리 실행]\n");
		}
	}
	
	public static void main (String[] args) {
		System.out.println("[프로그램 시작]\n");
		PrintLength("ThisIsJava");
		PrintLength(null);
		System.out.println("[프로그램 종료]");
	}
}
