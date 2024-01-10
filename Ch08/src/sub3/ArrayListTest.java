package sub3;

import java.util.ArrayList;
import java.util.List;

import sub1.Apple;

/**
 * 날짜 : 2024/01/10
 * 이름 : 박임재
 * 내용 : Java ArrayList 실습
 */
public class ArrayListTest {
	public static void main(String[] args) {
		
		// ArrayList 생성
		// interface List를 구현
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		
		// List 데이터 삽입
		list.add(1, 6); // index 1번 자리에 '6' 삽입 하고 원래 데이터는 1칸 씩 밀림
		System.out.println(list);
		
		// List 데이터 삭제
		list.remove(2); // index 번호 삭제
		System.out.println(list);
		
		// List 데이터 추출
		System.out.println("1번째 원소 : " + list.get(0));
		System.out.println("2번째 원소 : " + list.get(1));
		System.out.println("3번째 원소 : " + list.get(3));

		// List 크기
		System.out.println("list 크기 : " + list.size());
		
		// List 반복문
		// 결국 list 포장에서 꺼내 쓰기때문에 int 써도 됨
		for (int num : list) {
			System.out.println(num + "");
		}
		
		// 문자열 List
		List<String> people = new ArrayList<>();
		people.add("김유신");
		people.add("김춘추");
		people.add("장보고");
		people.add("강감찬");
		people.add("이순신");
		
		System.out.println(people);
		
		
		// 객체 List
		List<Apple> apples = new ArrayList<>();
		
		Apple a1 = new Apple("한국", 3000);
		Apple a2 = new Apple("미국", 3000);
		Apple a3 = new Apple("일본", 3000);
		
		apples.add(a1);
		apples.add(a2);
		apples.add(a3);
		
		System.out.println(apples);
		
		for (Apple apple : apples) {
			System.out.println(apple);
		}
		
		
	}
}
