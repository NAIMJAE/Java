package GPT03;

public class Student extends Person {
	public String major;
	
	public Student (String name, String major) {
		super(name);
		this.major = major;
	}
	
	@Override
	public void introduce () {
		System.out.println("나는 " + getname() + "이고");
		System.out.println("전공은 " + major + "입니다.");
	}
	
}