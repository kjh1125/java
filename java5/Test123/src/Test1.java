import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.sound.sampled.BooleanControl;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Test1 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Test1 frame = new Test1();
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
	public String list[] = { "시간대를 선택하세요", "3시", "6시", "9시" };

	JRadioButton r1 = new JRadioButton("잠실");

	JRadioButton r2 = new JRadioButton("신촌");

	JRadioButton r3 = new JRadioButton("영등포");

	JComboBox comboBox = new JComboBox(list);

	JCheckBox cb1 = new JCheckBox("돈까스");
	JCheckBox cb2 = new JCheckBox("스테이크");
	JCheckBox cb3 = new JCheckBox("스파게티");
	String area = null;
	String menu0 = "";
	String menu1 = "";
	String menu2 = "";
	ArrayList<String> totalmenu = new ArrayList<>();

	public Test1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 400);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(44, 39, 365, 45);
		contentPane.add(panel);
		panel.setBorder(new TitledBorder("장소 선택"));

		panel.add(r1);
		panel.add(r2);
		panel.add(r3);

		ButtonGroup r = new ButtonGroup();
		r.add(r1);
		r.add(r2);
		r.add(r3);

		JButton btn = new JButton("예약하기");
		btn.setBounds(419, 97, 110, 45);
		contentPane.add(btn);

		comboBox.setBounds(419, 39, 110, 33);
		contentPane.add(comboBox);

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(44, 179, 392, 45);
		contentPane.add(panel_1);
		panel_1.setBorder(new TitledBorder("메뉴 선택"));
		panel_1.setLayout(null);
		cb1.setBounds(76, 6, 61, 23);

		cb1.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel_1.add(cb1);
		cb2.setBounds(154, 6, 73, 23);
		cb2.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel_1.add(cb2);
		cb3.setBounds(262, 6, 73, 23);
		cb3.setFont(new Font("돋움체", Font.PLAIN, 12));
		panel_1.add(cb3);

		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(44, 286, 485, 45);
		contentPane.add(msg);

		r1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				area = r1.getText();
			}
		});

		r2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				area = r2.getText();
			}
		});
		r3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				area = r3.getText();
			}
		});

		cb1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					menu0 = cb1.getText();
				} else {
					menu0 = "";
				}

			}
		});
		cb2.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					menu1 = cb2.getText();
				} else {
					menu1 = "";
				}

			}
		});

		cb3.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange() == 1) {
					menu2 = cb3.getText();
				} else {
					menu2 = "";
				}

			}
		});
		
		

		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				msg.setText(area + "에" + comboBox.getSelectedItem() + menu0+menu1+menu2 + "예약되었습니다");

			}
		});
	}
}
