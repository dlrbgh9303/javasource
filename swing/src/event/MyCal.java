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
		
		setTitle("덧셈 계산기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//상단 부착 패널 생성
		JPanel top = new JPanel();
		
		//숫자를 입력하고 결과를 출력할 텍스트필드 생성
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
		
		//하단 부착 패널 생성
		JPanel bottom = new JPanel();
		
		// 버튼 두개 생성
		
		JButton btn1 = new JButton("확인");
		btn1.addActionListener(this);
		JButton btn2 = new JButton("취소");
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
		if(cmd.equals("확인")) {
			//확인 버튼 클릭
			//num1,num2 에 들어 있는 값 가져오기
			int op1 =Integer.parseInt(num1.getText());
			int op2 =Integer.parseInt(num2.getText());
			
			//가져온 숫자를 덧셈
			int total = op1+op2;
			
			//결과를 result 보여주기
			result.setText(total+"");
			
		}else {
			num1.setText("");
			num2.setText("");
			result.setText("");
			//취소 버튼 클릭
			//num1, num2, result 에 들어있는 값 지우기
		}
		

	}

	public static void main(String[] args) {
		new MyCal();

	}

}
