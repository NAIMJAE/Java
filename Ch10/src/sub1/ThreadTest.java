package sub1;

import java.util.Iterator;

/**
 * 날짜 : 2024/01/15
 * 이름 : 박임재
 * 내용 : Java Thread 실습
 */

class SubThread extends Thread {
	
	@Override
	public void run() {
		// 자식 스레드로 실행할 로직
		
		for (int i = 1 ; i <= 10 ; i++) {
			System.out.println(getName() + "스레드 실행...");
			
			try {
				sleep(1000); // 1초 동안 스레드 잠들기
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + "스레드 종료...");
	}
	
}

public class ThreadTest {
	public static void main(String[] args) {
		
		// Thread 생성
		SubThread st1 = new SubThread();
		SubThread st2 = new SubThread();
		
		// Thread 이름 설정
		st1.setName("Sub1");
		st2.setName("Sub2");
		
		System.out.println(st1.getName());

		
		// 데몬 스레드 (메인 스레드가 종료되면 같이 종료되는 스레드)
		st1.setDaemon(true);
		
		// st1.run()은 직렬 st1.start()는 병렬
		// Thread 실행
		st1.start();
		st2.start();
		
		
		for(int i = 1 ; i <= 10 ; i++) {
			System.out.println("Main 스레드 실행");
			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
		}
		
		System.out.println("프로그램 종료...");
		
	}
}
