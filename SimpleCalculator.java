package simpleCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class SimpleCalculator {

	private JFrame frame;
	private JTextField addvalue;
	private JTextField subvalue;
	private JTextField txtDisplay;
	private JButton btnDiv;
	private JButton btnMult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SimpleCalculator window = new SimpleCalculator();
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
	public SimpleCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1237, 760);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		addvalue = new JTextField();
		addvalue.setFont(new Font("Tahoma", Font.BOLD, 30));
		addvalue.setBounds(26, 28, 236, 73);
		frame.getContentPane().add(addvalue);
		addvalue.setColumns(10);
		
		subvalue = new JTextField();
		subvalue.setFont(new Font("Tahoma", Font.BOLD, 30));
		subvalue.setColumns(10);
		subvalue.setBounds(943, 28, 236, 73);
		frame.getContentPane().add(subvalue);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.setBackground(Color.WHITE);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,num3,num4,ans;
				try
				{
					num1 = Integer.parseInt(addvalue.getText());
					
					num2 = Integer.parseInt(subvalue.getText());
					
					num3 = Integer.parseInt(addvalue.getText());
					
					num4 = Integer.parseInt(subvalue.getText());
					
					ans = num1 + num2;
					
					txtDisplay.setText(Integer.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Only Valid/Integer numbers accepted");
					
				}
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnAdd.setBounds(451, 290, 142, 43);
		frame.getContentPane().add(btnAdd);
		
		JButton btnSub = new JButton("Sub");
		btnSub.setBackground(Color.WHITE);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,num3,num4,ans;
				try
				{
					num1 = Integer.parseInt(addvalue.getText());
					
					num2 = Integer.parseInt(subvalue.getText());
					
					num3 = Integer.parseInt(addvalue.getText());
					
					num4 = Integer.parseInt(subvalue.getText());
					
					ans = num1 - num2;
					
					txtDisplay.setText(Integer.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Only Valid/Integer numbers accepted");
				}
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnSub.setBounds(591, 290, 142, 43);
		frame.getContentPane().add(btnSub);
		
		txtDisplay = new JTextField();
		txtDisplay.setFont(new Font("Tahoma", Font.BOLD, 30));
		txtDisplay.setBounds(493, 616, 236, 39);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		btnDiv = new JButton("Div");
		btnDiv.setBackground(Color.WHITE);
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				int num1,num2,num3,num4,ans;
				try
				{
					num1 = Integer.parseInt(addvalue.getText());
					
					num2 = Integer.parseInt(subvalue.getText());
					
					num3 = Integer.parseInt(addvalue.getText());
					
					num4 = Integer.parseInt(subvalue.getText());
					
					ans = num1 / num2;
					
					txtDisplay.setText(Integer.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Only Valid/Integer numbers accepted");
				}
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnDiv.setBounds(591, 333, 142, 43);
		frame.getContentPane().add(btnDiv);
		
		btnMult = new JButton("Mult");
		btnMult.setBackground(Color.WHITE);
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int num1,num2,num3,num4,ans;
				try
				{
					num1 = Integer.parseInt(addvalue.getText());
					
					num2 = Integer.parseInt(subvalue.getText());
					
					num3 = Integer.parseInt(addvalue.getText());
					
					num4 = Integer.parseInt(subvalue.getText());
					
					ans = num1 * num2;
					
					txtDisplay.setText(Integer.toString(ans));
					
				}
				catch(Exception e1)
				{
					JOptionPane.showMessageDialog(null, "Only Valid/Integer numbers accepted");
				}
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnMult.setBounds(451, 333, 142, 43);
		frame.getContentPane().add(btnMult);
	}

}
