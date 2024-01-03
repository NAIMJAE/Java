package sub4;
/**
 * 날짜 : 2024/01/03
 * 이름 : 박임재
 * 내용 : Java 상속 실습
 */
public class InheritanceTest {
	public static void main(String[] args) {

		// Car Truck 객체 생성
		Sedan sonata = new Sedan("소나타", "흰색", 0 , 2000);
		sonata.speedUp(80);
		sonata.speedTurbo();
		sonata.show();
		
		Truck bongo = new Truck("봉고", "남색", 0, 0);
		bongo.load(100);
		bongo.speedUp(60);
		bongo.show();
		
		StockAccount kb = new StockAccount
			("KB증권", "101-1252-52", "홍길동", 1000000, "삼성전자", 0, 0);
		kb.deposit(1000000);
		kb.buy(10, 50000);
		kb.sell(5,50000);
		
		kb.show();
		// private면 직접 참조 불가능하지만 protected로 하면 가능
	}
}
