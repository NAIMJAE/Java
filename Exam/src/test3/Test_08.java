package test3;
/**
 * 날짜 : 2024/01/04
 * 이름 : 박임재
 * 내용 : Java 다형성 연습문제
 */
// 부모 클래스
class Product{
	protected String category;
	protected int price;
	
	public Product(String category, int price) {
		this.category = category;
		this.price = price;
	}
	public void info() {}
}
// 자식 클래스1
class Television extends Product {
	
	// 부모 클래스의 Product의 매개변수 초기화
	public Television(String Category, int price) {
		super(Category, price);
	}
	
	// 부모클래스의 info를 Override
	@Override
	public void info() {
		System.out.println("제품분류 : " + category);
		System.out.println("제품가격 : " + price);
	}
}
// 자식 클래스2
class Computer extends Product {
	
	// 부모 클래스의 Product의 매개변수 초기화
	public Computer(String category, int price) {
		super(category, price);
	}
	
	// 부모클래스의 info를 Override
	@Override
	public void info() {
		System.out.println("제품분류 : " + category);
		System.out.println("제품가격 : " + price);
	}
}

public class Test_08 {
	public static void main(String[] args) {
		Product p1 = new Television("가전", 100);
		Product p2 = new Computer("컴퓨터", 150);
		
		p1.info();
		p2.info();
	}
}
