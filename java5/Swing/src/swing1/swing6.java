package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class swing6 extends JFrame {

	private JPanel contentPane;
	private JTextField tel;
	private JLabel msg;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing6 frame = new swing6();
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
	public swing6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 581, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tel = new JTextField();
		
		tel.setFont(new Font("돋움체", Font.PLAIN, 12));
		tel.setBounds(39, 31, 287, 21);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("인증번호 받기");
		btnNewButton_1.setFont(new Font("돋움체", Font.PLAIN, 12));
		btnNewButton_1.setBounds(343, 30, 142, 23);
		contentPane.add(btnNewButton_1);
		
		msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.ORANGE));
		msg.setBackground(Color.WHITE);
		msg.setBounds(39, 62, 446, 31);
		contentPane.add(msg);
		
		tel.addKeyListener(new KeyAdapter() { //키를 누를 경우 적용되는 이벤트 클래스
			@Override
			//keyPressd : 키를 누를 때
			//keyReleased : 키룰 눌렀다가 up이 되었을 때
			//keyTyped : 키가 입력되기 전 상황을 인식.
			//System.out.println(k);
			//System.out.println(k.getKeyChar());
			public void keyTyped(KeyEvent k) {
				//입력값에 대한 자리수 제한
				int i = tel.getText().length();
				if(i>11) {
					k.consume();
				}
				
				int n = Integer.valueOf(k.getKeyChar()); //아스키 코드로 변경됨.
				//System.out.println(n); 
				if(n>=48 && n<=57) { 
					//valueof로 바꾸는 과정에서 아스키코드로 값이 변경되기 때문에 0~9의 값을 직접 확인(48~57) 후 해당 값을 넣어줘야 됨
					msg.setText("");
				}
				else {
					msg.setText("숫자만 입력하세요");
					if(!Character.isDigit(n)) {
						k.consume(); //keyTyped을 이용할 때 consume(전용명령어)을 사용하면 해당 입력을 null로 간주함.
						return;
					}
				}
			}
		});
		
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
	}

}
