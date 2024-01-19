package ch08;

public class RemoteControlExample {
	public static void main(String[] args) {
		// 인터페이스 변수 선언
		RemoteControl rc;
		
		// Television 객체 생성하고 인터페이스 변수에 대입
		rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		// Audio 객체 생성하고 인터페이스 변수에 대입
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		
		// default 메서드 호출
		rc.setMute(false);
		rc.setMute(true);
		
		// 정적 매서드 호출
		// 정적 매서드는 객체 구현 없이 인터페이스명으로 호출 가능
		RemoteControl.changeBattery();
	}
}
