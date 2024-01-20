package GPT12;

public class Student {
	int score;
	String name;
	
	public Student(int score, String name) {
		this.score = score;
		this.name = name;
	}
	
	public void show() {
		System.out.println("학생 이름 : " + name);
		System.out.println("학생 점수 : " + score);
	}
	
	
}
