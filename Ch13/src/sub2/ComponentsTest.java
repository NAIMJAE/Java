package sub2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class ComponentsTest {

	private JFrame frame;
	private JTextField textIUD;
	private JTextField textNAME;
	private JTextField textHP;
	private JTextField txtNum1;
	private JTextField txtNum2;
	private JTextField txtNum3;
	private JTextField txtNum4;
	private JTextField txtNum5;
	private JTextField txtNum6;
	private JTextField txtNum7;
	private JTextField txtNum8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ComponentsTest window = new ComponentsTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ComponentsTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 620);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("컴포넌트 실습");
		lblNewLabel.setBounds(12, 10, 81, 15);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("버튼 실습");
		lblNewLabel_1.setBounds(12, 35, 57, 15);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btn1 = new JButton("확인");
		btn1.setBounds(12, 60, 97, 23);
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("안녕");
			}
		});
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("취소");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showConfirmDialog(null, "버튼2번 클릭");
			}
		});
		btn2.setBounds(121, 60, 97, 23);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("화인");
		btn3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int answer = JOptionPane.showConfirmDialog(null, "버튼3 클릭", "확인대화상자", JOptionPane.YES_NO_OPTION);
				
				if(answer == 0) {
					System.out.println("YES 클릭");
				}else {
					System.out.println("No 클릭");
				}
				
			}
		});
		btn3.setBounds(230, 60, 97, 23);
		frame.getContentPane().add(btn3);
		
		JLabel lblNewLabel_2 = new JLabel("텍스트필드 실습");
		lblNewLabel_2.setBounds(12, 93, 97, 15);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel label = new JLabel("아이디");
		label.setBounds(12, 118, 42, 15);
		frame.getContentPane().add(label);
		
		JButton btnUID = new JButton("확인");
		
		btnUID.setBounds(185, 114, 64, 23);
		frame.getContentPane().add(btnUID);
		
		JLabel lbresultUID = new JLabel("결과 :");
		lbresultUID.setBounds(261, 118, 144, 15);
		frame.getContentPane().add(lbresultUID);
		
		textIUD = new JTextField();
		textIUD.setBounds(57, 115, 116, 21);
		frame.getContentPane().add(textIUD);
		textIUD.setColumns(10);
		
		JLabel label_1 = new JLabel("이름");
		label_1.setBounds(12, 149, 42, 15);
		frame.getContentPane().add(label_1);
		
		textNAME = new JTextField();
		textNAME.setColumns(10);
		textNAME.setBounds(57, 146, 116, 21);
		frame.getContentPane().add(textNAME);
		
		JButton btnNAME = new JButton("확인");
		
		btnNAME.setBounds(185, 145, 64, 23);
		frame.getContentPane().add(btnNAME);
		
		JLabel lbresultNAME = new JLabel("결과 :");
		lbresultNAME.setBounds(261, 149, 144, 15);
		frame.getContentPane().add(lbresultNAME);
		
		JLabel label_2 = new JLabel("휴대폰");
		label_2.setBounds(12, 180, 42, 15);
		frame.getContentPane().add(label_2);
		
		textHP = new JTextField();
		textHP.setColumns(10);
		textHP.setBounds(57, 177, 116, 21);
		frame.getContentPane().add(textHP);
		
		JButton btnHP = new JButton("확인");
	
		btnHP.setBounds(185, 176, 64, 23);
		frame.getContentPane().add(btnHP);
		
		JLabel lbresultHP = new JLabel("결과 :");
		lbresultHP.setBounds(261, 180, 144, 15);
		frame.getContentPane().add(lbresultHP);
		
		JLabel label_2_1 = new JLabel("덧셈");
		label_2_1.setBounds(12, 225, 42, 15);
		frame.getContentPane().add(label_2_1);
		
		txtNum1 = new JTextField();
		txtNum1.setColumns(10);
		txtNum1.setBounds(57, 222, 42, 21);
		frame.getContentPane().add(txtNum1);
		
		JButton btnplus = new JButton("확인");
		
		btnplus.setBounds(185, 221, 64, 23);
		frame.getContentPane().add(btnplus);
		
		JLabel lbresultplus = new JLabel("결과 :");
		lbresultplus.setBounds(261, 225, 144, 15);
		frame.getContentPane().add(lbresultplus);
		
		txtNum2 = new JTextField();
		txtNum2.setColumns(10);
		txtNum2.setBounds(131, 222, 42, 21);
		frame.getContentPane().add(txtNum2);
		
		JLabel label_2_1_1 = new JLabel("+");
		label_2_1_1.setBounds(111, 225, 14, 15);
		frame.getContentPane().add(label_2_1_1);
		
		JLabel label_2_1_2 = new JLabel("뺄셈");
		label_2_1_2.setBounds(12, 254, 42, 15);
		frame.getContentPane().add(label_2_1_2);
		
		txtNum3 = new JTextField();
		txtNum3.setColumns(10);
		txtNum3.setBounds(57, 251, 42, 21);
		frame.getContentPane().add(txtNum3);
		
		JLabel label_2_1_1_1 = new JLabel("-");
		label_2_1_1_1.setBounds(111, 254, 14, 15);
		frame.getContentPane().add(label_2_1_1_1);
		
		txtNum4 = new JTextField();
		txtNum4.setColumns(10);
		txtNum4.setBounds(131, 251, 42, 21);
		frame.getContentPane().add(txtNum4);
		
		JButton btnminus = new JButton("확인");
		
		btnminus.setBounds(185, 250, 64, 23);
		frame.getContentPane().add(btnminus);
		
		JLabel lbresultminus = new JLabel("결과 :");
		lbresultminus.setBounds(261, 254, 144, 15);
		frame.getContentPane().add(lbresultminus);
		
		JLabel label_2_1_3 = new JLabel("곱셈");
		label_2_1_3.setBounds(12, 283, 42, 15);
		frame.getContentPane().add(label_2_1_3);
		
		txtNum5 = new JTextField();
		txtNum5.setColumns(10);
		txtNum5.setBounds(57, 280, 42, 21);
		frame.getContentPane().add(txtNum5);
		
		JLabel label_2_1_1_2 = new JLabel("*");
		label_2_1_1_2.setBounds(111, 283, 14, 15);
		frame.getContentPane().add(label_2_1_1_2);
		
		txtNum6 = new JTextField();
		txtNum6.setColumns(10);
		txtNum6.setBounds(131, 280, 42, 21);
		frame.getContentPane().add(txtNum6);
		
		JButton btnmuti = new JButton("확인");
		btnmuti.setBounds(185, 279, 64, 23);
		frame.getContentPane().add(btnmuti);
		
		JLabel lbresultmuti = new JLabel("결과 :");
		lbresultmuti.setBounds(261, 283, 144, 15);
		frame.getContentPane().add(lbresultmuti);
		
		JLabel label_2_1_4 = new JLabel("나눗셈");
		label_2_1_4.setBounds(12, 312, 42, 15);
		frame.getContentPane().add(label_2_1_4);
		
		txtNum7 = new JTextField();
		txtNum7.setColumns(10);
		txtNum7.setBounds(57, 309, 42, 21);
		frame.getContentPane().add(txtNum7);
		
		JLabel label_2_1_1_3 = new JLabel("/");
		label_2_1_1_3.setBounds(111, 312, 14, 15);
		frame.getContentPane().add(label_2_1_1_3);
		
		txtNum8 = new JTextField();
		txtNum8.setColumns(10);
		txtNum8.setBounds(131, 309, 42, 21);
		frame.getContentPane().add(txtNum8);
		
		JButton btndiv = new JButton("확인");
		btndiv.setBounds(185, 308, 64, 23);
		frame.getContentPane().add(btndiv);
		
		JLabel lbresultdiv = new JLabel("결과 :");
		lbresultdiv.setBounds(261, 312, 144, 15);
		frame.getContentPane().add(lbresultdiv);
		
		JCheckBox chc1 = new JCheckBox("서울");
		chc1.setBounds(12, 376, 57, 23);
		frame.getContentPane().add(chc1);
		
		JLabel lblNewLabel_3 = new JLabel("체크 박스 실습");
		lblNewLabel_3.setBounds(12, 355, 97, 15);
		frame.getContentPane().add(lblNewLabel_3);
		
		JCheckBox chc2 = new JCheckBox("대구");
		chc2.setBounds(73, 376, 57, 23);
		frame.getContentPane().add(chc2);
		
		JCheckBox chc3 = new JCheckBox("대전");
		chc3.setBounds(134, 376, 57, 23);
		frame.getContentPane().add(chc3);
		
		JCheckBox chc4 = new JCheckBox("부산");
		chc4.setBounds(195, 376, 57, 23);
		frame.getContentPane().add(chc4);
		
		JCheckBox chc5 = new JCheckBox("광주");
		chc5.setBounds(256, 376, 57, 23);
		frame.getContentPane().add(chc5);
		
		JButton btncheck = new JButton("확인");
		
		btncheck.setBounds(325, 376, 97, 23);
		frame.getContentPane().add(btncheck);
		
		JLabel lbcheckresult = new JLabel("선택 :");
		lbcheckresult.setBounds(12, 415, 410, 23);
		frame.getContentPane().add(lbcheckresult);
		
		// uid 이벤트 리스너
		btnUID.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 텍스트 필드에 입력된 문자 가져오기
				String uid = textIUD.getText();
				// 결과 라벨에 가져온 문자열 입력하기
				lbresultUID.setText("결과 : "+uid);
			}
		});
		// name 이벤트 리스너
		btnNAME.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String name = textNAME.getText();
				lbresultNAME.setText("결과 : " + name);
				
			}
		});
		// hp 이벤트 리스너
		btnHP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String hp = textHP.getText();
				lbresultHP.setText("결과 : " + hp);
				
			}
		});
		
		// 덧셈 이벤트 리스너
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1 = Integer.parseInt(txtNum1.getText());
				int num2 = Integer.parseInt(txtNum2.getText());
				int plus = num1 + num2;
				
				lbresultplus.setText("결과 : " + plus);
			}
		});
		// 빼기 이벤트 리스너
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num3 = Integer.parseInt(txtNum3.getText());
				int num4 = Integer.parseInt(txtNum4.getText());
				int plus = num3 - num4;
				
				lbresultminus.setText("결과 : " + plus);
			}
		});
		// 곱하기 이벤트 리스너
		btnmuti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num5 = Integer.parseInt(txtNum5.getText());
				int num6 = Integer.parseInt(txtNum6.getText());
				int multi = num5 * num6;
				
				lbresultmuti.setText("결과 : " + multi);
			}
		});
		// 나누기 이벤트 리스너
		btndiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double num7 = Double.parseDouble(txtNum7.getText());
				double num8 = Double.parseDouble(txtNum8.getText());
				double div = num7 / num8;
				
				lbresultdiv.setText("결과 : " + div);
			}
		});
		// 체크박스 이벤터 리스너
		btncheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				List<String> cities = new ArrayList<String>();
				
				if(chc1.isSelected()) {
					cities.add(chc1.getText());
				}
				if(chc2.isSelected()) {
					cities.add(chc2.getText());
				}
				if(chc3.isSelected()) {
					cities.add(chc3.getText());
				}
				if(chc4.isSelected()) {
					cities.add(chc4.getText());
				}
				if(chc5.isSelected()) {
					cities.add(chc5.getText());
				}
				
				lbcheckresult.setText("선택 : " + cities.toString());
				
			}
		});
		
	}
}
