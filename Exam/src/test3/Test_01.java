package test3;
/**
 * 날짜 : 2024/01/04
 * 이름 : 박임재
 * 내용 : Java 클래스 연습문제
 */
public class Test_01 {
	private String name;
	private int age;
	
	public Test_01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void show() {
		System.out.println("=================");
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("-----------------");
	}
	public static void main(String[] args) {
		Test_01 kim = new Test_01("김유신", 23);
		Test_01 lee = new Test_01("이순신", 31);
		// 위에서 Test_01에 들어갈 매개변수 값을 설정해서 인자값 입력
		
		kim.show();
		lee.show();
	}
}
