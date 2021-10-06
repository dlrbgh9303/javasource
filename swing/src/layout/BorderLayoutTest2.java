package layout;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class BorderLayoutTest2 extends JFrame{
	
		public BorderLayoutTest2() {
			setTitle("BorderLayout �׽�Ʈ");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			
			Container container = getContentPane();
			container.setLayout(new BorderLayout(30,20));
			
			
			JButton btn1 = new JButton("��ư1");
			add(btn1);
			
			JButton btn2 = new JButton("��ư2");
			add(btn2);
			
			JButton btn3 = new JButton("��ư3");
			add(btn3);

			JButton btn4 = new JButton("��ư4");
			add(btn4);
			
			JButton btn5 = new JButton("��ư5");
			add(btn5);
			
			setSize(300,300);
			setVisible(true);
			
			
		}
	public static void main(String[] args) {
		BorderLayoutTest2 f = new BorderLayoutTest2();
		

	}

}
