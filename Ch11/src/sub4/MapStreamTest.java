package sub4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * 날짜 : 2024/01/16
 * 이름 : 박임재
 * 내용 : Java 컬렉션 스트림 Map 실습
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

public class MapStreamTest {
	public static void main(String[] args) {
		
		List<Person> persons = new ArrayList<>();
		persons.add(new Person("김유신", 23));
		persons.add(new Person("김춘추", 58));
		persons.add(new Person("장보고", 22));
		persons.add(new Person("강감찬", 65));
		persons.add(new Person("이순신", 24));
		
		// map : 스트림의 특정요소를 다른 요소로 변환
		persons
			.stream()
			.map(person -> person.getName())
			.forEach(name -> System.out.print(name + ", "));
		
		System.out.println();
	
		// flatMap : 스트림 특정 요소를 다른 여러개의 요소로 변환
		List<List<String>> nestedList = Arrays.asList(
				Arrays.asList("apple", "Banana"),
				Arrays.asList("Orange", "Grape"),
				Arrays.asList("Peach", "Melon")
				);
		
		nestedList.stream()
					.flatMap(list -> list.stream())
					.forEach(str -> System.out.println(str + ", "));
				
		
		
	}
}
