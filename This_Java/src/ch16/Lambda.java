package ch16;

public class Lambda {
	public static void main(String[] args) {
		Person person = new Person();
		
		person.action1((name, job) -> {
			System.out.println(name + "와" + job);
		});
		
	}
}
