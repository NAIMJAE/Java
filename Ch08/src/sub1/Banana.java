package sub1;

public class Banana {
	// 필드
	private String country;
	private int price;
	// 생성자
	public Banana (String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}
	
	
}
