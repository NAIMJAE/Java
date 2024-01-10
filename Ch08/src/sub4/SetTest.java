package sub4;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 날짜 : 2024/01.10
 * 이름 : 박임재
 * 내용 : Java HashSet 실습
 */
public class SetTest {
	public static void main(String[] args) {
		
		// HashSet(집합) 생성
		HashSet<Integer> set = new HashSet<>();
		
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(6);
		set.add(7);
		set.add(2);
		set.add(8);
		
		System.out.println(set);
		
		// 데이터 추출 (반복자 이용)
		Iterator<Integer> it = set.iterator();
		
		while(it.hasNext()) {
			// 다음 데이터가 있을때까지 반복
			System.out.println(it.next());
			
		}
		// 배열반복문으로 데이터 출력
		for(int num : set) {
			System.out.println(num);
			
		}
		
	}
}
