package sub1;

public class Apple {
	// 필드
	private String country;
	private int price;
	// 생성자
	public Apple (String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
	
	
}
