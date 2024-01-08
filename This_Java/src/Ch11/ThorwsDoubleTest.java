package Ch11;

public class ThorwsDoubleTest {
	public static void main(String[] args) {
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("예외 처리 : " + e.toString());
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
		int a = 1;
		int b = 0;
		int c = a / b;
		System.out.println(c);
	}
}

