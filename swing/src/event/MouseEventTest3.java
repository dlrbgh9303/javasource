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
		setTitle("텍스트 움직이기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//현재 설정된 레이아웃 없애기
		setLayout(null);
	
		//레이블 배치
		lbl.setLocation(50, 50); // 레이아웃을 없앴으니깐 좌표 직접 찍기
		lbl.setSize(100,20);
		add(lbl);
		
		setSize(200,200);
		setVisible(true);
		
		
		// 레이블이 포커스를 받을 수 있도록 설정
		Container contentPane = getContentPane();
		contentPane.addMouseListener((MouseListener) new MyKeyAdapter());
		contentPane.setFocusable(true);
		// 키 입력을 받을 수 있도록 포커스 강제 지정
		contentPane.requestFocus();
		
	}
	
	
	
	public static void main(String[] args) {
		new MouseEventTest3();

	}
	
	class MyKeyAdapter extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			//상,하,좌,우 키에 맞춰서 글자를 이동
			
			//어느키가 눌러졌는지 확인
			int keyCode = e.getKeyCode();
			
			switch (keyCode) {
			case KeyEvent.VK_UP: //up키 화살표 위
				lbl.setLocation(lbl.getX(),lbl.getY()-10);
				break;
			case KeyEvent.VK_DOWN: //down 키 화살표 위
				lbl.setLocation(lbl.getX(),lbl.getY()+10);
				break;
			case KeyEvent.VK_LEFT: //left 키 화살표 위
				lbl.setLocation(lbl.getX()-10,lbl.getY());
				break;
			case KeyEvent.VK_RIGHT: //right 키 화살표 위
				lbl.setLocation(lbl.getX()+10,lbl.getY());
				break;	
			default:
				break;
			}
		}
	}
	
}
























