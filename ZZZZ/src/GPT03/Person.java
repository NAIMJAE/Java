package GPT03;

public class Person {
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	public void introduce () {
		System.out.println("나는 " + name + "이고");
	}
	
	public String getname() {
		return name;
	}
}
