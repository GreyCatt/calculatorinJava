package calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class calc {
	private JFrame frame;
	private JTextField textField;
	double first;
	double second;
	double result;
	String operation;
	String answer;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calc window = new calc();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public calc() {
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 14));
		frame.setBounds(100, 100, 448, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 11, 410, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton.getText();
				textField.setText(number);
			}
		});
		btnNewButton.setBounds(10, 54, 74, 43);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton2 = new JButton("2");
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton2.getText();
				textField.setText(number);
			}
		});
		btnNewButton2.setBounds(94, 54, 74, 43);
		frame.getContentPane().add(btnNewButton2);
		
		JButton btnNewButton3 = new JButton("3");
		btnNewButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton3.getText();
				textField.setText(number);
			}
		});
		btnNewButton3.setBounds(178, 54, 74, 43);
		frame.getContentPane().add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("4");
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton4.getText();
				textField.setText(number);
			}
		});
		btnNewButton4.setBounds(262, 54, 74, 43);
		frame.getContentPane().add(btnNewButton4);
		
		JButton btnNewButton5 = new JButton("5");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton5.getText();
				textField.setText(number);
			}
		});
		btnNewButton5.setBounds(10, 108, 74, 43);
		frame.getContentPane().add(btnNewButton5);
		
		JButton btnNewButton6 = new JButton("6");
		btnNewButton6.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String number=textField.getText()+btnNewButton6.getText();
		textField.setText(number);
			}
		});
		btnNewButton6.setBounds(94, 108, 74, 43);
		frame.getContentPane().add(btnNewButton6);
		
		JButton btnNewButton7 = new JButton("7");
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton7.getText();
				textField.setText(number);
			}
		});
		btnNewButton7.setBounds(178, 108, 74, 43);
		frame.getContentPane().add(btnNewButton7);
		
		JButton btnNewButton8 = new JButton("8");
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton8.getText();
				textField.setText(number);
			}
		});
		btnNewButton8.setBounds(262, 108, 74, 43);
		frame.getContentPane().add(btnNewButton8);
		
		JButton btnNewButton9 = new JButton("9");
		btnNewButton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton9.getText();
				textField.setText(number);
			}
		});
		btnNewButton9.setBounds(10, 162, 74, 43);
		frame.getContentPane().add(btnNewButton9);
		
		JButton btnNewButtonEQ = new JButton("=");
		btnNewButtonEQ.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String answer;
				second = Double.parseDouble(textField.getText());
				if(operation == "+") {
					result = first+second;
					answer = String.format("%.2f",result);
					textField.setText(answer);
				}
				else if(operation == "-") {
					result = first-second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "/") {
					result = first/second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation == "*") {
					result = first*second;
					answer = String.format("%.2f", result);
					textField.setText(answer);
					
				}
			}
		});
		btnNewButtonEQ.setBounds(346, 54, 74, 205);
		frame.getContentPane().add(btnNewButtonEQ);
		
		JButton btnNewButtonPL = new JButton("+");
		btnNewButtonPL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "+";
				
			}
		});
		btnNewButtonPL.setBounds(178, 162, 74, 43);
		frame.getContentPane().add(btnNewButtonPL);
		
		JButton btnNewButtonMIN = new JButton("-");
		btnNewButtonMIN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "-";
			}
		});
		btnNewButtonMIN.setBounds(262, 162, 74, 43);
		frame.getContentPane().add(btnNewButtonMIN);
		
		JButton btnNewButtonDIV = new JButton("/");
		btnNewButtonDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "/";
			}
		});
		btnNewButtonDIV.setBounds(10, 216, 74, 43);
		frame.getContentPane().add(btnNewButtonDIV);
		
		JButton btnNewButtonTIM = new JButton("*");
		btnNewButtonTIM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation = "*";
			}
		});
		btnNewButtonTIM.setBounds(94, 216, 74, 43);
		frame.getContentPane().add(btnNewButtonTIM);
		
		JButton btnNewButtonCLR = new JButton("CLR");
		btnNewButtonCLR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);
			}
		});
		btnNewButtonCLR.setBounds(178, 216, 74, 43);
		frame.getContentPane().add(btnNewButtonCLR);
		
		JButton btnNewButtonBKSE = new JButton("BACK");
		btnNewButtonBKSE.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String backSpace=null;
				if(textField.getText().length()>0) {
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace=str.toString();
					textField.setText(backSpace);
				}
			}
		});
		btnNewButtonBKSE.setBounds(262, 216, 74, 43);
		frame.getContentPane().add(btnNewButtonBKSE);
		
		JButton btnNewButton0 = new JButton("0");
		btnNewButton0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btnNewButton0.getText();
				textField.setText(number);
			}
		});
		btnNewButton0.setBounds(94, 162, 74, 43);
		frame.getContentPane().add(btnNewButton0);
	}
}
