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
		//Frame�� absolute ���·� layer�� �����մϴ�.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("���̵�üũ");
		
		btnNewButton.setActionCommand("newbutton");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("����ü", Font.PLAIN, 12));
		
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
		
		//�ڵ鸵 class�� ������Ʈ���� �����ڵ�(����)�� ������ �ش� ������Ʈ�� �ε����� �� ��.
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			if(mid.getText().equals("")) {
				msg.setText("���̵� �Է����ּ���");
			}
			else {
				int lg = mid.getText().length(); //�Է� ���� ���� 
				if(lg<5) {
					msg.setText("���̵�� 6�� �̻� ��� �����մϴ�");
				}
				else {
					msg.setText("���̵� �������Դϴ�.");
				}
			}
			}
		});
	}
}
