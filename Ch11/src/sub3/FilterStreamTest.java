package sub3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * 날짜 : 2024/01/16
 * 이름 : 박임재
 * 내용 : Java 컬렉션 스트림 필터 실습
 */
public class FilterStreamTest {
	public static void main(String[] args) {
		
		// List는 중복을 허용
		List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,1,2,3);
		System.out.println(numbers);
		
		// 중복제거 (Stream을 쓰지 않으면 너무 복잡함)
		numbers.stream().distinct().forEach(num -> System.out.print(num + ", "));
		System.out.println();
		
		// 5 이상 데이터만 필터링
		numbers
			.stream()
			.filter(num -> num>=5) // 람다식으로 필터링
			.forEach(num -> System.out.print(num + ", "));
		System.out.println();
		
		// 중복 제거하고 짝수만 필터링, 내림차순 정렬
		numbers
			.stream()
			.distinct()
			.filter(num -> (num % 2) == 0)
			.sorted(Collections.reverseOrder())
			.forEach(num -> System.out.print(num + ", "));
 		
	}
}
