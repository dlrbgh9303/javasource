package layout;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;

public class OrderPizza extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OrderPizza frame = new OrderPizza();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OrderPizza() {
		setTitle("MyFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 143);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel_1 = new JLabel("\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4. \uD53C\uC790\uC758 \uC885\uB960\uB97C \uC120\uD0DD\uD558\uC2DC\uC624 ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("\uCF64\uBCF4\uD53C\uC790");
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton = new JButton("\uD3EC\uD14C\uC774\uD1A0\uD53C\uC790");
		contentPane.add(btnNewButton);
		
		JLabel label = new JLabel("");
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("");
		contentPane.add(label_1);
		
		JButton btnNewButton_2 = new JButton("\uBD88\uACE0\uAE30\uD53C\uC790");
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("\uAC1C\uC218");
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
