package GPT03;

public class Test {
	public static void main(String[] args) {
		Professor PF = new Professor("홍길동","물리");
		Student ST = new Student("장보고","경제");
		
		PF.introduce();
		ST.introduce();
	}
}
