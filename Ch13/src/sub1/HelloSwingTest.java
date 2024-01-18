package sub1;

import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 * 날짜 : 2024/01/18
 * 이름 : 박임재
 * 내용 : Java Swing 실습
 */
public class HelloSwingTest {
	public static void main(String[] args) {
		
		// 윈도우 생성
		JFrame frame = new JFrame("Hello Swing");
		frame.setPreferredSize(new Dimension(300, 200));
		frame.pack();
		frame.setVisible(true);
		
		// 컨테이너 생성
		Container pane = frame.getContentPane();
		
		// 컴포넌트 배치
		JLabel Label = new JLabel("Hello Swing!");
		pane.add(Label);
		
		JButton button = new JButton("확인");
		pane.add(button);
		
		
		
		
	}
}
