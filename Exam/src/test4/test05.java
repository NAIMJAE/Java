package test4;
/**
 * 날짜 : 2024/01/12
 * 이름 : 홍길동
 * 내용 : Java API 클래스 연습문제
 */
class Apple {
	private String country;
	private int price;
	
	public Apple (String country, int price){
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Apple [country=" + country + ", price=" + price + "]";
	}
}
class Banana {
	private String country;
	private int price;
	
	public Banana (String country, int price){
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Banana [country=" + country + ", price=" + price + "]";
	}
}
class Grape {
	private String country;
	private int price;
	
	public Grape (String country, int price){
		this.country = country;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Grape [country=" + country + ", price=" + price + "]";
	}
}

public class test05 {
	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 2000);
		Grape grape = new Grape("일본", 1000);
		
		showInfo(apple);
		showInfo(banana);
		showInfo(grape);
	}
	public static void showInfo(Object fruit) { // 생성자 없이 바로 호출하기에 static
			// 다운캐스팅?
		if(fruit instanceof Apple) {//instanceof  객체가 특정 클래스의 하위 인스턴스인지 확인
			Apple apple = (Apple) fruit;  // 형변환하기 위해 검사?
			System.out.println(apple);
		}
		if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;  
			System.out.println(banana);
		}
		if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;  
			System.out.println(grape);
		}
			
	}
}
