package sub2;
/**
 * 날짜 : 2024/01/15
 * 이름 : 박임재
 * 내용 : Java Thread 상태 실습
 */
class SubThread extends Thread {
	@Override
	public void run() {
		
		int i = 1;
		try { 
			while(true) {
				
				System.out.println("i : " + i);
				i++;
				
				sleep(1000);
				
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public class ThreadInterruptTest {
	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		sub.setName("sub");
		
		// 자식 스레드 실행
		sub.start();
		
		// main Thread 10초 일시 정지
		try {
			Thread.sleep(1000 * 10);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 자식 Thread 종료 (InterruptedException 발생)
		sub.interrupt();
		
		
		System.out.println("Main Thread 종료...");
		
		
	}
}
