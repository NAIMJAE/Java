package Ch07;
// 교재 p.286
public class A_SmartPhone extends A_Phone{
	// 필드 선언
	public boolean wifi;
	
	// 생성자 선언
	public A_SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
	}
	
	// 메소드 선언
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이 파이 상태 변경");
	}

	public void internet() {
		System.out.println("인터넷 연결");
	}
}
