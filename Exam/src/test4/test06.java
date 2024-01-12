package test4;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 날짜 : 2024/01/12
 * 이름 : 홍길동
 * 내용 : Java 리스트 연습문제
 */
public class test06 {
	public static void main(String[] args) {
		
		// 60 ~ 100 사이 임의의 수 10개를 더하므로 결과값이 항상 다름
		printList(createList());
	}
	
	public static void printList(List<Integer> scoreList) {
		
		int total = 0;
		int size = scoreList.size();
		
		for(int i = 0 ; i < size ; i++) {
			
			// scoreList 배열의 i번째 인수를 total에 더함
			int score = scoreList.get(i);
			
			total += score;
			
			System.out.print(score);
			
			if(i == size - 1) {
				System.out.print(" = ");
			}else {
				System.out.print(" + ");
			}
			
		}
		System.out.println(total);
	}
	
	// 반환 타입이 List<Integer>인 createList 메서드
	public static List<Integer> createList() {
		
		List<Integer> scoreList = new ArrayList<>();
		Random rand = new Random();
		
		// 60 ~ 100 사이의 임의의 수 10개를 뽑아 scoreList에 저장
		for(int i = 1 ; i <= 10 ; i++) {
			//60 ~ 100 사이 임의의 수
			int num = rand.nextInt(41) + 60;
			scoreList.add(num);
		}
		return scoreList;
	}
}
