package component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.ResultSet;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.GridLayout;


import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Toolkit;

public class Pizza extends JFrame implements ItemListener, ActionListener {

	private JPanel contentPane;
	private JRadioButton 콤보,포테이토,불고기,rdo피망,rdo치즈,rdo페페로니,rdo베이컨,스몰,미디움,라지;
	private JButton 주문,취소;
	private JLabel 최종금액;
	private ButtonGroup group,group2,group3;
	
	//그룹별 주문금액 변수 설정
	private int kindMoney,toppigMoney,sizeMoney;
	//그룹별 제품선택 변수 설정
	private String Kind,topping,size;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pizza frame = new Pizza();
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
	public Pizza() {
		setTitle("\uD53C\uC790\uC8FC\uBB38");
		setIconImage(Toolkit.getDefaultToolkit().getImage(Pizza.class.getResource("/component/pizza1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 350);
		contentPane = new JPanel();
		contentPane.setBackground(Color.white);
		contentPane.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel(
				"\uC790\uBC14 \uD53C\uC790\uC5D0 \uC624\uC2E0 \uAC83\uC744 \uD658\uC601\uD569\uB2C8\uB2E4");
		lblNewLabel.setFont(new Font("D2Coding", Font.BOLD, 19));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uC885\uB958", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_2);
		panel_2.setLayout(new GridLayout(0, 1, 0, 0));

		콤보 = new JRadioButton("\uCF64\uBCF4");
		콤보.addItemListener(this);
		panel_2.add(콤보);

	    포테이토 = new JRadioButton("\uD3EC\uD14C\uC774\uD1A0");
		포테이토.addItemListener(this);
		panel_2.add(포테이토);

		불고기 = new JRadioButton("\uBD88\uACE0\uAE30");
		불고기.addItemListener(this);
		panel_2.add(불고기);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		rdo피망 = new JRadioButton("\uD53C\uB9DD");
		rdo피망.addItemListener(this);
		panel_3.add(rdo피망);

		rdo치즈 = new JRadioButton("\uCE58\uC988");
		rdo치즈.addItemListener(this);
		panel_3.add(rdo치즈);

		rdo페페로니 = new JRadioButton("\uD398\uD398\uB85C\uB2C8");
		rdo페페로니.addItemListener(this);
		panel_3.add(rdo페페로니);

		rdo베이컨 = new JRadioButton("\uBCA0\uC774\uCEE8");
		rdo베이컨.addItemListener(this);
		panel_3.add(rdo베이컨);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uC0AC\uC774\uC988", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

		스몰 = new JRadioButton("Small");
		스몰.addItemListener(this);
		panel_4.add(스몰);

		미디움 = new JRadioButton("Medium");
		미디움.addItemListener(this);
		panel_4.add(미디움);

		라지 = new JRadioButton("Large");
		라지.addItemListener(this);
		panel_4.add(라지);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		주문 = new JButton("\uC8FC\uBB38");
		주문.addActionListener(this);
		panel_1.add(주문);

		취소 = new JButton("\uCDE8\uC18C");
		취소.addActionListener(this);
		panel_1.add(취소);

		최종금액 = new JLabel("\uAE08\uC561 :");
		panel_1.add(최종금액);
		
		//종류 그룹 설정
		group = new ButtonGroup();
		group.add(콤보);
		group.add(포테이토);
		group.add(불고기);
		
		group2 = new ButtonGroup();
		group2.add(rdo피망);
		group2.add(rdo치즈);
		group2.add(rdo페페로니);
		group2.add(rdo베이컨);
		
		group3 = new ButtonGroup();
		group3.add(스몰);
		group3.add(미디움);
		group3.add(라지);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if (cmd.equals("주문")) {
			
			String orderList = "주문내역\n";
			orderList+="종류 : "+Kind+"\n";
			orderList+="토핑 : "+topping+"\n";
			orderList+="크기 : "+size+"\n";
			orderList+="주문하시겠습니까?";
			
			int result = JOptionPane.showConfirmDialog(getParent(),orderList,"주문완료",
								JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
			
			if (result==0) {
				JOptionPane.showMessageDialog(getParent(), "주문이 완료되었습니다.");
				clear1();
			}else {
				clear1();
			}
			
		}else {
			clear1();
			
		}
	}
	
			private void clear1( ) {
			//라디오 버튼 해제
			group.clearSelection();
			group2.clearSelection();
			group3.clearSelection();
			
			//그룹별 주문금액 변수 초기화
			kindMoney = 0;
			toppigMoney  =0;
			sizeMoney  =0;
			
			//그룹별 주문메세지 변수 초기화
			Kind ="";
			topping="";
			size="";
			
		}
	

	private void clear() {
		//라디오 버튼 해제
		group.clearSelection();
		group2.clearSelection();
		group3.clearSelection();
		
		//그룹별 주문금액 변수 초기화
		kindMoney = 0;
		toppigMoney  =0;
		sizeMoney  =0;
		
		//그룹별 주문메세지 변수 초기화
		Kind ="";
		topping="";
		size="";
		
		최종금액.setText("금액 :");
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton radio = (JRadioButton) e.getItem();
		
		//JRadioButton, JCheckBox 상태의 변화가 선택,해제가 존재
		//선택되는 시점의 이벤트 처리 (하나 선택하면 이전거 안나오고 선택하것만!)
		if (e.getStateChange()==ItemEvent.SELECTED) {
			if (radio == 콤보) {
				kindMoney = 10000;
				Kind = radio.getText();
			}else if(radio == 포테이토) {
				kindMoney = 12000;
				Kind = radio.getText();
			}else if(radio == 불고기) {
				kindMoney = 13000;
				Kind = radio.getText();
			}else if(radio == rdo피망) {
				toppigMoney = 2000;
				topping = radio.getText();
			}else if(radio == rdo치즈) {
				toppigMoney = 2000;
				topping = radio.getText();
			}else if(radio == rdo페페로니) {
				toppigMoney = 2000;
				topping = radio.getText();
			}else if(radio == rdo베이컨) {
				toppigMoney = 2000;
				topping = radio.getText();
			}else if(radio == 스몰) {
				sizeMoney = 1000;
				size = radio.getText();
			}else if(radio == 미디움) {
				sizeMoney = 2000;
				size = radio.getText();
			}else if(radio == 라지) {
				sizeMoney = 3000;
				size = radio.getText();
			}
			int price = kindMoney+toppigMoney+sizeMoney;
			
			최종금액.setText("금액 : "+price);
			
			System.out.println(radio.getText());
		}
		
	}

}
