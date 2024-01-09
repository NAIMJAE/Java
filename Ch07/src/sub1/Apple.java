package sub1;
/**
 * 날짜 : 2024/01/09
 * 이름 : 박임재
 * 내용 : Java Object 클래스 실습
 */
// 모든 클래스는 명시되어 있지 않지만 Object 클래스를 상속 받음
public class Apple {

	private String country;
	private int price;
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [hashCode="+hashCode()+", country=" + country + ", price=" + price + "]";
	}
}
