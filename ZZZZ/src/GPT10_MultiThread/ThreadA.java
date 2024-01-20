package GPT10_MultiThread;

public class ThreadA extends Thread {
	@Override
	public void run() {
		for(int i = 1 ; i <= 5 ; i++) {
			System.out.println(i + "출력");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
