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
	private JRadioButton �޺�,��������,�Ұ��,rdo�Ǹ�,rdoġ��,rdo����δ�,rdo������,����,�̵��,����;
	private JButton �ֹ�,���;
	private JLabel �����ݾ�;
	private ButtonGroup group,group2,group3;
	
	//�׷캰 �ֹ��ݾ� ���� ����
	private int kindMoney,toppigMoney,sizeMoney;
	//�׷캰 ��ǰ���� ���� ����
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

		�޺� = new JRadioButton("\uCF64\uBCF4");
		�޺�.addItemListener(this);
		panel_2.add(�޺�);

	    �������� = new JRadioButton("\uD3EC\uD14C\uC774\uD1A0");
		��������.addItemListener(this);
		panel_2.add(��������);

		�Ұ�� = new JRadioButton("\uBD88\uACE0\uAE30");
		�Ұ��.addItemListener(this);
		panel_2.add(�Ұ��);

		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_3.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uD1A0\uD551", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_3);
		panel_3.setLayout(new GridLayout(0, 1, 0, 0));

		rdo�Ǹ� = new JRadioButton("\uD53C\uB9DD");
		rdo�Ǹ�.addItemListener(this);
		panel_3.add(rdo�Ǹ�);

		rdoġ�� = new JRadioButton("\uCE58\uC988");
		rdoġ��.addItemListener(this);
		panel_3.add(rdoġ��);

		rdo����δ� = new JRadioButton("\uD398\uD398\uB85C\uB2C8");
		rdo����δ�.addItemListener(this);
		panel_3.add(rdo����δ�);

		rdo������ = new JRadioButton("\uBCA0\uC774\uCEE8");
		rdo������.addItemListener(this);
		panel_3.add(rdo������);

		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_4.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0)), "\uC0AC\uC774\uC988", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.add(panel_4);
		panel_4.setLayout(new GridLayout(0, 1, 0, 0));

		���� = new JRadioButton("Small");
		����.addItemListener(this);
		panel_4.add(����);

		�̵�� = new JRadioButton("Medium");
		�̵��.addItemListener(this);
		panel_4.add(�̵��);

		���� = new JRadioButton("Large");
		����.addItemListener(this);
		panel_4.add(����);

		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.SOUTH);

		�ֹ� = new JButton("\uC8FC\uBB38");
		�ֹ�.addActionListener(this);
		panel_1.add(�ֹ�);

		��� = new JButton("\uCDE8\uC18C");
		���.addActionListener(this);
		panel_1.add(���);

		�����ݾ� = new JLabel("\uAE08\uC561 :");
		panel_1.add(�����ݾ�);
		
		//���� �׷� ����
		group = new ButtonGroup();
		group.add(�޺�);
		group.add(��������);
		group.add(�Ұ��);
		
		group2 = new ButtonGroup();
		group2.add(rdo�Ǹ�);
		group2.add(rdoġ��);
		group2.add(rdo����δ�);
		group2.add(rdo������);
		
		group3 = new ButtonGroup();
		group3.add(����);
		group3.add(�̵��);
		group3.add(����);
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		
		if (cmd.equals("�ֹ�")) {
			
			String orderList = "�ֹ�����\n";
			orderList+="���� : "+Kind+"\n";
			orderList+="���� : "+topping+"\n";
			orderList+="ũ�� : "+size+"\n";
			orderList+="�ֹ��Ͻðڽ��ϱ�?";
			
			int result = JOptionPane.showConfirmDialog(getParent(),orderList,"�ֹ��Ϸ�",
								JOptionPane.OK_CANCEL_OPTION,JOptionPane.INFORMATION_MESSAGE);
			
			if (result==0) {
				JOptionPane.showMessageDialog(getParent(), "�ֹ��� �Ϸ�Ǿ����ϴ�.");
				clear1();
			}else {
				clear1();
			}
			
		}else {
			clear1();
			
		}
	}
	
			private void clear1( ) {
			//���� ��ư ����
			group.clearSelection();
			group2.clearSelection();
			group3.clearSelection();
			
			//�׷캰 �ֹ��ݾ� ���� �ʱ�ȭ
			kindMoney = 0;
			toppigMoney  =0;
			sizeMoney  =0;
			
			//�׷캰 �ֹ��޼��� ���� �ʱ�ȭ
			Kind ="";
			topping="";
			size="";
			
		}
	

	private void clear() {
		//���� ��ư ����
		group.clearSelection();
		group2.clearSelection();
		group3.clearSelection();
		
		//�׷캰 �ֹ��ݾ� ���� �ʱ�ȭ
		kindMoney = 0;
		toppigMoney  =0;
		sizeMoney  =0;
		
		//�׷캰 �ֹ��޼��� ���� �ʱ�ȭ
		Kind ="";
		topping="";
		size="";
		
		�����ݾ�.setText("�ݾ� :");
	}
	
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton radio = (JRadioButton) e.getItem();
		
		//JRadioButton, JCheckBox ������ ��ȭ�� ����,������ ����
		//���õǴ� ������ �̺�Ʈ ó�� (�ϳ� �����ϸ� ������ �ȳ����� �����ϰ͸�!)
		if (e.getStateChange()==ItemEvent.SELECTED) {
			if (radio == �޺�) {
				kindMoney = 10000;
				Kind = radio.getText();
			}else if(radio == ��������) {
				kindMoney = 12000;
				Kind = radio.getText();
			}else if(radio == �Ұ��) {
				kindMoney = 13000;
				Kind = radio.getText();
			}else if(radio == rdo�Ǹ�) {
				toppigMoney = 2000;
				topping = radio.getText();
			}else if(radio == rdoġ��) {
				toppigMoney = 2000;
				topping = radio.getText();
			}else if(radio == rdo����δ�) {
				toppigMoney = 2000;
				topping = radio.getText();
			}else if(radio == rdo������) {
				toppigMoney = 2000;
				topping = radio.getText();
			}else if(radio == ����) {
				sizeMoney = 1000;
				size = radio.getText();
			}else if(radio == �̵��) {
				sizeMoney = 2000;
				size = radio.getText();
			}else if(radio == ����) {
				sizeMoney = 3000;
				size = radio.getText();
			}
			int price = kindMoney+toppigMoney+sizeMoney;
			
			�����ݾ�.setText("�ݾ� : "+price);
			
			System.out.println(radio.getText());
		}
		
	}

}
