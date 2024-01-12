package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 날짜 : 2024/01/12
 * 이름 : 홍길동
 * 내용 : 로또번호 연습문제
 */
public class test07 {
	public static void main(String[] args) {
		
		for(int count = 1 ; count <= 5 ; count++) {
			System.out.println(makeLotto());
		}
	}

	public static Set<Integer> makeLotto() {
		
		Set<Integer> lottoSet = new HashSet<>();
		
		for(;;) { // 무한루프 for문 랜덤 숫자 1~46사이 생성
			int num =(int) (Math.random()*45) + 1;
					
			lottoSet.add(num);
			// lottoSet의 길이가 6이되면 종료
			if(lottoSet.size() == 6) {
				break;
			}
		}
		
		// 정렬을 위해 TreeSet 사용
		Set<Integer> treeSet = new TreeSet<Integer>(lottoSet);
		
		return treeSet;
	}
}
