package sub5;

public class Apple {
	// 필드
	private String country;
	private int price;
	// 생성자
	public Apple (String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("--------------------");
		System.out.println("원산지 : " + country);
		System.out.println("가 격 : " + price);
		System.out.println("--------------------");
	}
	
	
}
