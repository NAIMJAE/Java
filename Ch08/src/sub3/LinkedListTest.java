package sub3;

import java.util.LinkedList;

/**
 * 날짜 : 2024/01/10
 * 이름 : 박임재
 * 내용 : Java LinkedList 실습
 */
public class LinkedListTest {
	public static void main(String[] args) {
		// ArrayList와 기능은 동일
		
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("서울");
		list.add("대전");
		list.add("대구");
		list.add("부산");
		list.add("광주");
		System.out.println(list);
		
		// 링크(데이터) 추가
		list.add(2, "제주");
		// ArrayList에는 없는 기능
		list.addFirst("인천");
		list.addLast("부산");
		System.out.println(list);
		
		
		
	}
}
