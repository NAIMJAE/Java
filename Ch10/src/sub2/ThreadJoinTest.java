package sub2;
/**
 * 날짜 : 2024/01/15
 * 이름 : 박임재
 * 내용 : Java Thread Join 상태 실습
 */
class ChildThread extends Thread {
	@Override
	public void run() {
		
		for (int i = 1; i<=10 ; i++) {
			System.out.println("i : " + i);
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("자식 스레드 종료...");
	}
}

public class ThreadJoinTest {
	public static void main(String[] args) {
		
		ChildThread ct = new ChildThread();
		
		// 자식 스레드 실행
		ct.start();
		
		// main 스레드 대기 (자식 스레드가 종료될 때까지)
		try {
			ct.join(); //★ join ★ (main pause)
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램(메인 스레드) 종료...");
	}
}
