package sub4;
/**
 * 날짜 : 2024/01/15
 * 이름 : 박임재
 * 내용 : Java Thread 제어 상태 실습
 */
public class ThreadWaitTest {
	public static void main(String[] args) {
		
		Store store = new Store();
		
		Thread producer = new Producer(store);
		Thread consumer = new Consumer(store);
		
		producer.start();  //store.produce();
		consumer.start();  //store.consume();
		
		try {
			producer.join();
			consumer.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료...");
	}
}
	