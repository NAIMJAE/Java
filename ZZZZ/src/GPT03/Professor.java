package GPT03;

public class Professor extends Person {
	public String department;
	
	public Professor (String name, String department) {
		super(name);
		this.department = department;
	}
	
	@Override
	public void introduce () {
		System.out.println("나는 " + getname() + "이고");
		System.out.println(department + "학과에서 교수 합니다.");
	}
	
	}
