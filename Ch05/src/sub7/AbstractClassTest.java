package sub7;
/**
 * 날짜 : 2024/01/04
 * 이름 : 박임재
 * 내용 : Java 추상클래스 실습 
 */
public class AbstractClassTest {
	public static void main(String[] args) {
		// 추상클래스는 객체 생성이 불가능
		// Car car = new Car("소나타", "흰색", 0);
		
		Sedan sonata = new Sedan("소나타", "흰색", 0, 2000);
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		
		// 조금 더 유연한 코딩 -> 업캐스팅
		Car sonata2 = new Sedan("소나타", "흰색", 0, 2000);
		Car bongo1 = new Truck("봉고", "남색", 0, 0);
		
		sonata2.speedUp(20);
		sonata2.speedDown(10);
		sonata2.show();

		bongo1.speedUp(50);
		bongo1.speedDown(10);
		bongo1.show();
		
		
		
	}
}
