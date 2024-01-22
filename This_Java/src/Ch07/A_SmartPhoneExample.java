package Ch07;
//교재 p.286
public class A_SmartPhoneExample {
	public static void main(String[] args) {
		// A_SmartPhone 객체 생성
		A_SmartPhone myPhone = new A_SmartPhone("갤럭시", "은색");
		
		// A_Phone로부터 상송받은 필드 읽기
		System.out.println("모델 : " + myPhone.model);
		System.out.println("색상 : " + myPhone.color);
		
		// A_SmartPhone의 필드 읽기
		System.out.println("와이파이 상태 : " + myPhone.wifi);
		
		// A_Phone로부터 상속받은 메소드 호출
		myPhone.bell();
		myPhone.sendVoice("여보세요");
		myPhone.receiveVoice("안녕하세요");
		myPhone.hangUp();
		
		// A_SmartPhone의 메소드 호출
		myPhone.setWifi(true);
		myPhone.internet();
	}
}
