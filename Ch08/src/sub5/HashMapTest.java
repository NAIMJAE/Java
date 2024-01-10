package sub5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 날짜 : 2024/01/10
 * 이름 : 박임재
 * 내용 : Java HashMap 실습
 */
public class HashMapTest {
	public static void main(String[] args) {
		
		// Map 생성
		Map<Character, String> map = new HashMap<>();
		
		// 데이터 입력
		map.put('A', "Apple");
		map.put('B', "Banana");
		map.put('C', "Cherry");
		
		System.out.println(map);
		
		// Map 의 크기 (개수)
		System.out.println("Map 크기 : " + map.size());
		
		// Map 데이터 추출 // key 값으로 추출
		System.out.println("Map A값 : " + map.get('A'));
		System.out.println("Map B값 : " + map.get('B'));
		System.out.println("Map C값 : " + map.get('C'));
		
		// Map 반복문
		// Key 값을 집합으로 만들어 그 집합을 반복 시켜야함
		for(char k : map.keySet()) {
			System.out.println(k + " - " + map.get(k));
		}
		
		// List와 Map을 이용한 자료 구조
		List<Map<Integer, Apple>> mylist = new ArrayList<>();
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국", 3000));
		m1.put(102, new Apple("중국", 3000));
		m1.put(103, new Apple("일본", 3000));

		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("미국", 3000));
		m2.put(202, new Apple("영국", 3000));
		m2.put(203, new Apple("호주", 3000));
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("대만", 3000));
		m3.put(302, new Apple("태국", 3000));
		m3.put(303, new Apple("인도", 3000));
		
		mylist.add(m1);
		mylist.add(m2);
		mylist.add(m3);
		
		// 한국 사과
		Map<Integer, Apple> resultmap1 = mylist.get(0);
		Apple apple = resultmap1.get(101);
		apple.show();
		
		// 호주 사과
		Map<Integer, Apple> resultmap2 = mylist.get(1);
		Apple apple2 = resultmap2.get(203);
		apple2.show();
		
		// 한줄로 간단히
		mylist.get(1).get(203).show(); // 메서드 체이닝

		// 태국 사과
		mylist.get(2).get(302).show();
	}
}
