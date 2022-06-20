package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing5 extends JFrame {

	private JPanel contentPane;
	private JTextField mid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing5 frame = new swing5();
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
	public swing5() {
		//Frame을 absolute 형태로 layer를 변경합니다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("아이디체크");
		
		btnNewButton.setActionCommand("newbutton");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("돋움체", Font.PLAIN, 12));
		
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setBounds(157, 85, 104, 23);
		contentPane.add(btnNewButton);
		
		mid = new JTextField();
		mid.setBounds(97, 54, 236, 21);
		contentPane.add(mid);
		mid.setColumns(10);
		
		JLabel msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.RED));
		msg.setBounds(59, 130, 317, 23);
		contentPane.add(msg);
		
		//핸들링 class가 오브젝트보다 상위코드(위쪽)에 있으면 해당 오브젝트를 로드하지 못 함.
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			if(mid.getText().equals("")) {
				msg.setText("아이디를 입력해주세요");
			}
			else {
				int lg = mid.getText().length(); //입력 문자 갯수 
				if(lg<5) {
					msg.setText("아이디는 6자 이상 사용 가능합니다");
				}
				else {
					msg.setText("아이디 검토중입니다.");
				}
			}
			}
		});
	}
}
