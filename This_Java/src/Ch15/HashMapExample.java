package Ch15;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


// 교재 p.658
public class HashMapExample {
	public static void main(String[] args) {
		
		// Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // 위와 키가 같기 때문에 제일 마지막 값만 저장
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		
		// 키로 값 얻기
		String key = "홍길동";
		int value = map.get(key);
		System.out.println(key + ":" + value);
		System.out.println();
		
		// 키 Set 컬렉션을 얻고, 반복해서 키와 값을 얻기
		Set<String> keySet = map.keySet();
		Iterator<String> KeyIterator = keySet.iterator();
		while (KeyIterator.hasNext()) {
			String k = KeyIterator.next();
			Integer v = map.get(k);
			System.out.println(k + " : " + v);
		}
		System.out.println();
	}
}
