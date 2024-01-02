package sub3;

public class Calc {

	// 싱글톤 객체 생성 -> 싱글톤은 예외적으로 static 앞에 private
	private static Calc instance = new Calc();
	public static Calc getInstance() {
		return instance;
	}
	private Calc() {} // 다른 곳에서 new Calc() 못하도록 막음
	
	// 해당 클래서 내에서 정적 변수로 선언해버림
	
	public int plus(int x, int y) {
		return x + y;
	}
	
	public int minus(int x, int y) {
		return x - y;
	}
	
	public int multi(int x, int y) {
		return x * y;
	}
	
	public int div(int x, int y) {
		return x / y;
	}
}

// calc 클래스를 불러오기 위해서는 new로 선언해야함! -> static 없어서
