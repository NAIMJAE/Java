package sub3;
/**
 * 날짜 : 2024/01/15
 * 이름 : 박임재
 * 내용 : Java Thread 동기화 실습
 * 
 * 동기(Synchronize)
 * - 동기 방식은 순서에 따라서 차례대로 처리되는 실행 흐름
 * - 운영체제, 스케줄링 등
 * - 투수-포수 관계 : 순서를 맞춰야함
 * 비동기(Asynchronize)
 * - 순서에 상관없이 처리되는 실행 흐름
 * - 웹 비동기 통신
 * - 키커-골키퍼 관계 : 순서를 맞추면 안됨ㅋㅋ
 */
class Count {
	private int num;
	
	// getter, setter
	public int getNum() {
		return num;
	}
	// 임계영역
	// - 멀티 스레드에 의해 공유자원이 참조 되는 코드의 범위
	// - 스레드간 경합이 발생 (제대로 된 연산 X)
	// - 스레드들간의 경합을 피하기 위해 동기화 시켜주어야 함
	// - 다른 스레드가 사용 중이면 나머지 스레드들은 락! 걸려서 대기
	// - 너무 많은 스레드가 발생할 경우 교착상태에 빠질 수 있음
	public synchronized void setNum() {
		num++;
		
	}
}

class CountThread extends Thread {
	
	private Count count;
	
	public CountThread (Count count) {
		this.count = count;
	}
	@Override
	public void run() {
		for (int i=1 ; i<=1000 ; i++) {
			count.setNum();
		}
		System.out.println(getName() + "종료");
	}
}

public class ThreadSyncTest {
	public static void main(String[] args) {
		
		Count count = new Count();
		
		CountThread ct1 = new CountThread(count);
		CountThread ct2 = new CountThread(count);
		CountThread ct3 = new CountThread(count);
		
		ct1.start();
		ct2.start();
		ct3.start();
		

		try {
			ct1.join();
			ct2.join();
			ct3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Count : " + count.getNum());
	}
}
