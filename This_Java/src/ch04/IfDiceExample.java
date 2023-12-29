package ch04;
// 교재 p.116
public class IfDiceExample {
	public static void main(String[] args) {
		int num = (int)(Math.random()*6) + 1;
		// Math.random() 메소드는 0.0 ~ 1.0 사이의 double 타입 난수를 리턴
		// 6을 곱하면 0.0 ~ 6.0 사이의 double 타입 난수를 리턴
		// (int) 타입으로 강제 타입 변환하면 0, 1, 2, 3, 4, 5 중 하나의 정수 난수 리턴
		// 1을 더해 1 ~ 6 사이의 정수 난수를 리턴
		
		if(num==1) {
			System.out.println("1번이 나왔습니다.");
		}else if(num==2) {
			System.out.println("2번이 나왔습니다.");
		}else if(num==3) {
			System.out.println("3번이 나왔습니다.");
		}else if(num==4) {
			System.out.println("4번이 나왔습니다.");
		}else if(num==5) {
			System.out.println("5번이 나왔습니다.");
		}else {
			System.out.println("6번이 나왔습니다.");
		}
		
	}
}

