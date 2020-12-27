import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.GridLayout;
import javax.swing.BoxLayout;

public class ArithmeticMaths {

	private JFrame frame;
	private JTextField textFieldNum1;
	private JTextField textFieldNum2;
	private JTextField textFieldAns;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArithmeticMaths window = new ArithmeticMaths();
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
	public ArithmeticMaths() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 981, 527);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Add");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans= num1 + num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Please enter a valit number.");
					}
			}
		});
		btnNewButton.setBounds(80, 146, 221, 81);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Subtract");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans= num1 - num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Please enter a valit number.");
					}
			}
		});
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_1.setBounds(631, 146, 221, 81);
		frame.getContentPane().add(btnNewButton_1);
		
		textFieldNum1 = new JTextField();
		textFieldNum1.setFont(new Font("Arial Black", Font.ITALIC, 20));
		textFieldNum1.setBounds(80, 37, 221, 81);
		frame.getContentPane().add(textFieldNum1);
		textFieldNum1.setColumns(10);
		
		textFieldNum2 = new JTextField();
		textFieldNum2.setFont(new Font("Arial Black", Font.ITALIC, 20));
		textFieldNum2.setBounds(631, 37, 221, 81);
		frame.getContentPane().add(textFieldNum2);
		textFieldNum2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("The Answer is :");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(122, 327, 177, 60);
		frame.getContentPane().add(lblNewLabel);
		
		textFieldAns = new JTextField();
		textFieldAns.setFont(new Font("Times New Roman", Font.BOLD, 20));
		textFieldAns.setBounds(631, 327, 221, 60);
		frame.getContentPane().add(textFieldAns);
		textFieldAns.setColumns(10);
		
		btnNewButton_2 = new JButton("Multiply");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans= num1 * num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Please enter a valit number.");
					}
			}
		});
		btnNewButton_2.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_2.setBounds(80, 251, 221, 67);
		frame.getContentPane().add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Divide");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1, num2, ans;
				try {
					num1 = Integer.parseInt(textFieldNum1.getText());
					num2 = Integer.parseInt(textFieldNum2.getText());
					
					ans= num1 / num2;
					textFieldAns.setText(Integer.toString(ans));
					}catch(Exception e) {
						JOptionPane.showMessageDialog(null, "Please enter a valit number.");
					}
			}
		});
		btnNewButton_3.setFont(new Font("Times New Roman", Font.BOLD, 20));
		btnNewButton_3.setBounds(631, 251, 221, 60);
		frame.getContentPane().add(btnNewButton_3);
	}
}
