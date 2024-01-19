package ch14;

import java.awt.Toolkit;

public class BeepPrintExample {
	public static void main(String[] args) {
		// Thread 클래스로부터 작업 스레드 객체 직접 생성
		Thread thread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0 ; i < 5 ; i++) {
					toolkit.beep();
					try {Thread.sleep(500);} catch (Exception e) {}
				}
			}
		}); 
		// 작업 스레드 실행
		thread.start();
		// 메인 스레드 진행
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch (Exception e) {}
		}
	}
}







