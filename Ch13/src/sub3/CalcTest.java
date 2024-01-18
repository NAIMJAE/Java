package sub3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalcTest {

	private JFrame frame;
	private JTextField textField;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnequals;
	private JButton btnDiv;
	private JButton btnMulti;
	private JButton btnMinus;
	private JButton btnPlus;
	private JButton btn0;
	private JButton btnClear;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalcTest window = new CalcTest();
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
	public CalcTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	// 연산 준비
	private int operator = 0; // 
	private int num1 = 0;
	private int num2 = 0;
	private boolean check = true;
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 283, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 255, 255));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 40));
		textField.setEditable(false);
		textField.setText("0");
		textField.setBounds(12, 10, 244, 91);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		btn7 = new JButton("7");
		btn7.setForeground(new Color(255, 255, 255));
		btn7.setBackground(new Color(0, 128, 255));
		btn7.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btn7.setBounds(12, 111, 52, 52);
		frame.getContentPane().add(btn7);
		
		btn8 = new JButton("8");
		btn8.setForeground(new Color(255, 255, 255));
		btn8.setBackground(new Color(0, 128, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn8.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btn8.setBounds(76, 111, 52, 52);
		frame.getContentPane().add(btn8);
		
		btn9 = new JButton("9");
		btn9.setForeground(new Color(255, 255, 255));
		btn9.setBackground(new Color(0, 128, 255));
		btn9.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btn9.setBounds(140, 111, 52, 52);
		frame.getContentPane().add(btn9);
		
		btn4 = new JButton("4");
		btn4.setForeground(new Color(255, 255, 255));
		btn4.setBackground(new Color(0, 128, 255));
		btn4.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btn4.setBounds(12, 173, 52, 52);
		frame.getContentPane().add(btn4);
		
		btn5 = new JButton("5");
		btn5.setForeground(new Color(255, 255, 255));
		btn5.setBackground(new Color(0, 128, 255));
		btn5.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btn5.setBounds(76, 173, 52, 52);
		frame.getContentPane().add(btn5);
		
		btn6 = new JButton("6");
		btn6.setForeground(new Color(255, 255, 255));
		btn6.setBackground(new Color(0, 128, 255));
		btn6.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btn6.setBounds(140, 173, 52, 52);
		frame.getContentPane().add(btn6);
		
		btn1 = new JButton("1");
		btn1.setForeground(new Color(255, 255, 255));
		btn1.setBackground(new Color(0, 128, 255));
		btn1.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btn1.setBounds(12, 235, 52, 52);
		frame.getContentPane().add(btn1);
		
		btn2 = new JButton("2");
		btn2.setForeground(new Color(255, 255, 255));
		btn2.setBackground(new Color(0, 128, 255));
		btn2.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btn2.setBounds(76, 235, 52, 52);
		frame.getContentPane().add(btn2);
		
		btn3 = new JButton("3");
		btn3.setForeground(new Color(255, 255, 255));
		btn3.setBackground(new Color(0, 128, 255));
		btn3.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btn3.setBounds(140, 235, 52, 52);
		frame.getContentPane().add(btn3);
		
		btnequals = new JButton("=");
		btnequals.setForeground(new Color(255, 255, 255));
		btnequals.setBackground(new Color(0, 128, 255));
		btnequals.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btnequals.setBounds(140, 297, 52, 52);
		frame.getContentPane().add(btnequals);
		
		btnDiv = new JButton("/");
		btnDiv.setForeground(new Color(255, 255, 255));
		btnDiv.setBackground(new Color(0, 128, 255));
		btnDiv.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btnDiv.setBounds(204, 111, 52, 52);
		frame.getContentPane().add(btnDiv);
		
		btnMulti = new JButton("*");
		btnMulti.setForeground(new Color(255, 255, 255));
		btnMulti.setBackground(new Color(0, 128, 255));
		btnMulti.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btnMulti.setBounds(204, 173, 52, 52);
		frame.getContentPane().add(btnMulti);
		
		btnMinus = new JButton("-");
		btnMinus.setForeground(new Color(255, 255, 255));
		btnMinus.setBackground(new Color(0, 128, 255));
		btnMinus.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btnMinus.setBounds(204, 235, 52, 52);
		frame.getContentPane().add(btnMinus);
		
		btnPlus = new JButton("+");
		btnPlus.setForeground(new Color(255, 255, 255));
		btnPlus.setBackground(new Color(0, 128, 255));
		btnPlus.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btnPlus.setBounds(204, 297, 52, 52);
		frame.getContentPane().add(btnPlus);
		
		btn0 = new JButton("0");
		btn0.setForeground(new Color(255, 255, 255));
		btn0.setBackground(new Color(0, 128, 255));
		btn0.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btn0.setBounds(76, 297, 52, 52);
		frame.getContentPane().add(btn0);
		
		btnClear = new JButton("C");
		btnClear.setForeground(new Color(255, 255, 255));
		btnClear.setBackground(new Color(0, 128, 255));
		btnClear.setFont(new Font("맑은 고딕", Font.BOLD, 24));
		btnClear.setBounds(12, 297, 52, 52);
		frame.getContentPane().add(btnClear);
		
		// 연산자 리스너
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check==true) {
					operator = 1;
					check = false;
				}else if(check==false) {
					num1 = num1 + num2;
					textField.setText(""+ num1);
					operator = 1;

				}
			}
		});
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 2;
				check = false;
			}
		});
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 3;
				check = false;
			}
		});
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 4;
				check = false;
			}
		});
		btnequals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = 0;
				
				if(operator == 1) {
					result = num1 + num2;
				}else if(operator == 2) {
					result = num1 - num2;
				}else if(operator == 3) {
					result = num1 * num2;
				}else if(operator == 4) {
					result = num1 / num2;
				}
				
				textField.setText(""+ result);
				check = true;
			}
		});
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operator = 0;
				check = true;
				textField.setText("0");
				num1 = 0;
				num2 = 0;
			}
		});
		
		// 숫자 리스너
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check == true) {
					textField.setText("1");
					num1 = 1;
				} else {
					textField.setText("1");
					num2 = 1;
				}
			}
		});
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check == true) {
					textField.setText("2");
					num1 = 2;
				} else {
					textField.setText("2");
					num2 = 2;
				}
			}
		});
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check == true) {
					textField.setText("3");
					num1 = 3;
				} else {
					textField.setText("3");
					num2 = 3;
				}
			}
		});
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check == true) {
					textField.setText("4");
					num1 = 4;
				} else {
					textField.setText("4");
					num2 = 4;
				}
			}
		});
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check == true) {
					textField.setText("5");
					num1 = 5;
				} else {
					textField.setText("5");
					num2 = 5;
				}
			}
		});
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check == true) {
					textField.setText("6");
					num1 = 6;
				} else {
					textField.setText("6");
					num2 = 6;
				}
			}
		});
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check == true) {
					textField.setText("7");
					num1 = 7;
				} else {
					textField.setText("7");
					num2 = 7;
				}
			}
		});
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check == true) {
					textField.setText("8");
					num1 = 8;
				} else {
					textField.setText("8");
					num2 = 8;
				}
			}
		});
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check == true) {
					textField.setText("9");
					num1 = 9;
				} else {
					textField.setText("9");
					num2 = 9;
				}
			}
		});
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(check == true) {
					textField.setText("0");
					num1 = 0;
				} else {
					textField.setText("0");
					num2 = 0;
				}
			}
		});
		
		
	}
}
