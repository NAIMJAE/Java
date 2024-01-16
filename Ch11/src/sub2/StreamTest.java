package sub2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

/**
 * 날짜 : 2024/01/16
 * 이름 : 박임재
 * 내용 : Java 컬렉션 스트림 실습
 */
class Person {
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}


public class StreamTest {
	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		names.add("김유신");
		names.add("김춘추");
		names.add("장보고");
		names.add("강감찬");
		names.add("이순신");
		
		// 외부 반복자를 이용한 출력
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		// 내부 반복자를 이용한 출력
		Stream<String> stream = names.stream();
		stream.forEach((name) -> {
			System.out.println(name);
		});
		
		// 
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신", 23));
		persons.add(new Person("김춘추", 58));
		persons.add(new Person("장보고", 22));
		persons.add(new Person("강감찬", 65));
		persons.add(new Person("이순신", 24));
		
		// 외부 반복자 처리
		for(Person person : persons) {
			System.out.println(person);
		}
		
		// 내부 반복자 처리
		Stream<Person> pstream = persons.stream();
		pstream.forEach(person -> {
			System.out.println(person);
		});
		
		pstream.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
	}
}
