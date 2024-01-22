package ch06_Class;
// 교재 p.238
public class H_CarExample {
	public static void main(String[] args) {
		// H_Car 객체 생성
		H_Car myCar = new H_Car();
		
		// 리턴값이 없는 setGas() 메서드 호출
		myCar.setGas(5);
		
		// isLeftGas() 메서드 호출해서 받은 리턴값이 true일 경우 if 블록 실행
		if(myCar.isLeftGas()) {
			System.out.println("출발합니다.");
			
			// 리턴값이 없는 run() 메서드 호출
			myCar.run();
		}
		System.out.println("gas를 주입하세요.");
	}
}
