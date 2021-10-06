package event;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import layout.BorderLayoutTest1;

public class MyCal extends JFrame implements ActionListener {

	private JTextField num1,num2,result;
	
	
	public MyCal() {
		
		setTitle("���� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//��� ���� �г� ����
		JPanel top = new JPanel();
		
		//���ڸ� �Է��ϰ� ����� ����� �ؽ�Ʈ�ʵ� ����
		num1 = new JTextField(10);
		top.add(num1);
		
		JLabel op = new JLabel("+");
		top.add(op);
		
		num2 = new JTextField(10);
		top.add(num2);
		
		JLabel op2 = new JLabel("=");
		top.add(op2);
		
		result = new JTextField(10);
		top.add(result);
		
		
		
		add(top,BorderLayout.NORTH);
		
		//�ϴ� ���� �г� ����
		JPanel bottom = new JPanel();
		
		// ��ư �ΰ� ����
		
		JButton btn1 = new JButton("Ȯ��");
		btn1.addActionListener(this);
		JButton btn2 = new JButton("���");
		btn2.addActionListener(this);
		bottom.add(btn1);
		bottom.add(btn2);
		
		add(bottom,BorderLayout.CENTER);
		
		
		setSize(450,150);
		setVisible(true);
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		String cmd = e.getActionCommand();
		if(cmd.equals("Ȯ��")) {
			//Ȯ�� ��ư Ŭ��
			//num1,num2 �� ��� �ִ� �� ��������
			int op1 =Integer.parseInt(num1.getText());
			int op2 =Integer.parseInt(num2.getText());
			
			//������ ���ڸ� ����
			int total = op1+op2;
			
			//����� result �����ֱ�
			result.setText(total+"");
			
		}else {
			num1.setText("");
			num2.setText("");
			result.setText("");
			//��� ��ư Ŭ��
			//num1, num2, result �� ����ִ� �� �����
		}
		

	}

	public static void main(String[] args) {
		new MyCal();

	}

}
