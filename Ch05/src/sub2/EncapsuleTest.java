package sub2;
/**
 * 날짜 : 2024/01/02
 * 이름 : 박임재 
 * 내용 : JAVA 클래스 실습하기
 */
public class EncapsuleTest {

	public static void main(String[] args) {
		
		// 객체 생성
		Car sonata = new Car("소나타", "흰색", 10);
		
		// 캡슐화된 속성에 대한 초기화는 생성자에서 수행
		// sonata.name = "소나타"; // 취약 코드 -> 캡슐화
		// sonata.color = "흰색";
		// sonata.speed = 10;
		
		// 메서드는 무조건 public
		
		sonata.speedup(80);
		sonata.speeddown(20);
		sonata.show();

		// 캡슐화된 속성에 대한 수정을 위해 setter 호출
		sonata.setColor("회색");
		sonata.show();
		
		// Account 객체 생성 및 초기화
		Account kb = new Account("국민은행", "123-125125-223", "김김김", 10000);
		kb.deposit(80000);
		kb.withdraw(70000);
		kb.show();
		
				
				
	}
}
