package java_1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

public class test3 extends JFrame {

	private JPanel contentPane;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tf3;
	JProgressBar progressBar = new JProgressBar();
	JLabel progressmsg = new JLabel("");
	JPanel msgpanel = new JPanel();
	public String rbtnselected = null;
	JButton reservbtn = new JButton("\uC608\uC57D\uD558\uAE30");
	JLabel lastmsg = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					test3 frame = new test3();
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
	public test3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(49, 34, 484, 69);
		contentPane.add(panel);
		panel.setLayout(null);

		JRadioButton r2 = new JRadioButton("\uCDA9\uBD81\uC74C\uC131");
		r2.setBounds(142, 24, 115, 23);
		panel.add(r2);

		JRadioButton r3 = new JRadioButton("\uCD98\uCC9C");
		r3.setBounds(279, 24, 115, 23);
		panel.add(r3);

		JRadioButton r1 = new JRadioButton("\uB0A8\uC591\uC8FC");
		r1.setBounds(25, 24, 115, 23);
		panel.add(r1);
		
		ButtonGroup gp = new ButtonGroup();
		gp.add(r1);
		gp.add(r2);
		gp.add(r3);
		

		JPanel panel_1 = new JPanel();
		panel_1.setBounds(49, 113, 484, 81);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		tf1 = new JTextField();
		tf1.setBounds(87, 27, 96, 21);
		panel_1.add(tf1);
		tf1.setColumns(10);

		tf2 = new JTextField();
		tf2.setColumns(10);
		tf2.setBounds(360, 27, 96, 21);
		panel_1.add(tf2);
		
		JLabel lblNewLabel_1 = new JLabel("\uC131\uC778 :");
		lblNewLabel_1.setBounds(21, 30, 50, 15);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\uCCAD\uC18C\uB144(\uB9CC 10\uC138 \uC774\uD558) :");
		lblNewLabel_1_1.setBounds(215, 30, 124, 15);
		panel_1.add(lblNewLabel_1_1);

		JPanel panel_2 = new JPanel();
		panel_2.setBounds(49, 204, 484, 69);
		contentPane.add(panel_2);
		panel_2.setLayout(null);

		tf3 = new JTextField();
		tf3.setBounds(87, 27, 211, 21);
		tf3.setColumns(10);
		panel_2.add(tf3);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\uCEA0\uD551\uC77C\uC790 :");
		lblNewLabel_1_1_1.setBounds(10, 30, 64, 15);
		panel_2.add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("\uC608\uC2DC) 2022-06-24");
		lblNewLabel_1_1_1_1.setBounds(308, 30, 141, 15);
		panel_2.add(lblNewLabel_1_1_1_1);

		msgpanel.setBounds(49, 353, 484, 69);
		contentPane.add(msgpanel);
		msgpanel.setLayout(null);
		msgpanel.setVisible(false);

		
		lastmsg.setBorder(new LineBorder(Color.RED));
		lastmsg.setBounds(106, 10, 341, 24);
		msgpanel.add(lastmsg);
		
		JLabel lastmsg_1 = new JLabel("");
		lastmsg_1.setBorder(new LineBorder(Color.RED));
		lastmsg_1.setBounds(154, 35, 293, 24);
		msgpanel.add(lastmsg_1);
		
		JLabel lastmsg_2 = new JLabel("\uC77C\uC790 \uBC0F \uC7A5\uC18C :");
		lastmsg_2.setBorder(new LineBorder(Color.RED));
		lastmsg_2.setBounds(10, 10, 86, 24);
		msgpanel.add(lastmsg_2);
		
		JLabel lastmsg_2_1 = new JLabel("\uCD1D \uC785\uAE08\uD558\uC2E4 \uAE08\uC561 :");
		lastmsg_2_1.setBorder(new LineBorder(Color.RED));
		lastmsg_2_1.setBounds(10, 35, 134, 24);
		msgpanel.add(lastmsg_2_1);

		JButton exitbtn = new JButton("\uC885\uB8CC");
		exitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		exitbtn.setBounds(440, 432, 93, 23);
		contentPane.add(exitbtn);

		
		
		reservbtn.setBounds(440, 283, 93, 23);
		contentPane.add(reservbtn);
		progressBar.setStringPainted(true);

		progressBar.setBounds(49, 283, 369, 23);
		contentPane.add(progressBar);

		progressmsg.setBorder(new LineBorder(Color.RED));
		progressmsg.setBounds(49, 316, 369, 27);
		contentPane.add(progressmsg);
		
		JLabel lblNewLabel = new JLabel("\uCEA0\uD551\uC7A5 \uC608\uC57D \uC2DC\uC2A4\uD15C");
		lblNewLabel.setBounds(49, 10, 156, 15);
		contentPane.add(lblNewLabel);

		if(r1.isSelected()==true) {
			
			rbtnselected=r1.getActionCommand();
		}
		else if(r2.isSelected()==true) {
			
			rbtnselected=r2.getActionCommand();
		}
		else if(r3.isSelected()==true) {
			
			rbtnselected=r3.getActionCommand();
		}
		
		reservbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pb();
		
				lastmsg.setText(rbtnselected);
			}
		});
		
	}
	
	public void pb() {
		progressmsg.setText("로딩중입니다");
		int w = 0;
		try {
			while (w <= 100) {
				progressBar.setValue(w);
				Thread.sleep(600);
				w++;
			}
		} catch (Exception e1) {
			System.out.println(e1);
		}
		if (progressBar.getValue() == 100) {
			msgpanel.setVisible(true);
			progressmsg.setText("로딩이 완료되었습니다");
		}
	}
}
