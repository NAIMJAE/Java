package test3;
/**
 * 날짜 : 2024/01/04
 * 이름 : 박임재
 * 내용 : Java 클래스 상속 연습문제
 */
class Customer {
	protected int id;
	protected String name;
	protected String grade;
	protected int point;
	protected double pointRatio;
	
	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		this.grade = "SILVER";
		this.point = 100;
		this.pointRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price;
	}
	
	public void showInfo() {
		System.out.println("========================");
		System.out.println("고객번호 : " + id);
		System.out.println("고객이름 : " + name);
		System.out.println("고객등급 : " + grade);
		System.out.println("현재 포인트 : " + point);
		System.out.println("포인트 적립율 : " + pointRatio);
		System.out.println("------------------------");
	}
}

class VipCustomer extends Customer {
	
	private double saleRatio;
	
	public VipCustomer(int id, String name) {
		super(id, name); // 매개변수 값을 리턴하겠따?
		super.grade = "VIP"; // 직접 참조 가능 위에 protected
		super.point = 1000;
		super.pointRatio = 0.05;
		this.saleRatio = 0.1;  // 상속받지 않는 변수
	}
	// VipCustomer의 포인트 적립율은 다르게 가져가겠다.
	@Override
	public int calcPrice(int price) {
		point += price * pointRatio;
		return price - (int)(price * saleRatio);
	}
}
public class Test_07 {
	public static void main(String[] args) {
		Customer kim = new Customer(1001, "김춘추");
		VipCustomer lee = new VipCustomer(1002, "이순신");
		
		System.out.println("김춘추님이 지불할 금액 : " + kim.calcPrice(10000));
		System.out.println("이순신님이 지불할 금액 : " + lee.calcPrice(10000));
		
		kim.showInfo();
		lee.showInfo();
	}
}
