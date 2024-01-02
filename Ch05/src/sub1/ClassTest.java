package sub1;

/**
 * 날짜 : 2024/01/02
 * 이름 : 박임재
 * 내용 : JAVA 클래스 실습하기 
 */
public class ClassTest {
	
	public static void main(String[] args) {

		// 객체 생성
		// class 타입의 'Car'
		// sonata -> 참조변수 객체
		Car sonata = new Car();
		
		// 객체의 속성 초기화
		// . <- 참조변수 포인트
		sonata.name = "소나타";
		sonata.color = "흰색";
		sonata.speed = 0;
		
		// 객체 상호작용
		sonata.speedup(60); // 메서드 호출
		sonata.speeddown(20);
		sonata.show();
		
		// 객체 선언, 생성, 초기화, 상호작용
		Car avante;
		
		avante = new Car();
		
		avante.name = "아반떼";
		avante.color = "검은색";
		avante.speed = 0;
		
		avante.speedup(80);
		avante.speeddown(10);
		avante.show();
		
		// Account 객체 생성/초기화/상호작용
		Account kb = new Account();
		kb.bank = "국민은행";
		kb.id = "112-45612-126123";
		kb.name = "김김김";
		kb.balance = 10000;
		
		kb.deposit(40000);
		kb.withdraw(30000);
		kb.show();
		
		
	}
	
}
