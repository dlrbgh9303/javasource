package event;

import java.awt.Container;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MouseEventTest3 extends JFrame {
	
	private JLabel lbl = new JLabel("HELLO");
	
	public MouseEventTest3() {
		setTitle("�ؽ�Ʈ �����̱�");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//���� ������ ���̾ƿ� ���ֱ�
		setLayout(null);
	
		//���̺� ��ġ
		lbl.setLocation(50, 50); // ���̾ƿ��� �������ϱ� ��ǥ ���� ���
		lbl.setSize(100,20);
		add(lbl);
		
		setSize(200,200);
		setVisible(true);
		
		
		// ���̺��� ��Ŀ���� ���� �� �ֵ��� ����
		Container contentPane = getContentPane();
		contentPane.addMouseListener((MouseListener) new MyKeyAdapter());
		contentPane.setFocusable(true);
		// Ű �Է��� ���� �� �ֵ��� ��Ŀ�� ���� ����
		contentPane.requestFocus();
		
	}
	
	
	
	public static void main(String[] args) {
		new MouseEventTest3();

	}
	
	class MyKeyAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			//��,��,��,�� Ű�� ���缭 ���ڸ� �̵�
			
			//���Ű�� ���������� Ȯ��
			int keyCode = e.getKeyCode();
			
			switch (keyCode) {
			case KeyEvent.VK_UP: //upŰ ȭ��ǥ ��
				lbl.setLocation(lbl.getX(),lbl.getY()-10);
				break;
			case KeyEvent.VK_DOWN: //down Ű ȭ��ǥ ��
				lbl.setLocation(lbl.getX(),lbl.getY()+10);
				break;
			case KeyEvent.VK_LEFT: //left Ű ȭ��ǥ ��
				lbl.setLocation(lbl.getX()-10,lbl.getY());
				break;
			case KeyEvent.VK_RIGHT: //right Ű ȭ��ǥ ��
				lbl.setLocation(lbl.getX()+10,lbl.getY());
				break;	
			default:
				break;
			}
		}
	}
	
}
























