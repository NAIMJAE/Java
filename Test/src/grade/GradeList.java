package grade;

public class GradeList {
	private String name;
	private int score;
	private String grade;
	
	public GradeList(String name, int score, String grade) {
		this.name = name;
		this.score = score;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	public String getGrade() {
		return grade;
	}
}
