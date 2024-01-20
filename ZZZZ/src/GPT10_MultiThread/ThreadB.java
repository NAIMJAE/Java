package GPT10_MultiThread;

import java.awt.desktop.ScreenSleepEvent;

public class ThreadB {
	public static void main(String[] args) {
		
		Thread subA = new ThreadA();
		subA.start();
		
		Thread subB = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for (int i = 1 ; i <= 3 ; i++) {
					System.out.println("HELLO, MultiThread");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		} );
		subB.start();
	}
}
