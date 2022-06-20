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
		
		tel.setFont(new Font("����ü", Font.PLAIN, 12));
		tel.setBounds(39, 31, 287, 21);
		contentPane.add(tel);
		tel.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("������ȣ �ޱ�");
		btnNewButton_1.setFont(new Font("����ü", Font.PLAIN, 12));
		btnNewButton_1.setBounds(343, 30, 142, 23);
		contentPane.add(btnNewButton_1);
		
		msg = new JLabel("");
		msg.setBorder(new LineBorder(Color.ORANGE));
		msg.setBackground(Color.WHITE);
		msg.setBounds(39, 62, 446, 31);
		contentPane.add(msg);
		
		tel.addKeyListener(new KeyAdapter() { //Ű�� ���� ��� ����Ǵ� �̺�Ʈ Ŭ����
			@Override
			//keyPressd : Ű�� ���� ��
			//keyReleased : Ű�� �����ٰ� up�� �Ǿ��� ��
			//keyTyped : Ű�� �ԷµǱ� �� ��Ȳ�� �ν�.
			//System.out.println(k);
			//System.out.println(k.getKeyChar());
			public void keyTyped(KeyEvent k) {
				//�Է°��� ���� �ڸ��� ����
				int i = tel.getText().length();
				if(i>11) {
					k.consume();
				}
				
				int n = Integer.valueOf(k.getKeyChar()); //�ƽ�Ű �ڵ�� �����.
				//System.out.println(n); 
				if(n>=48 && n<=57) { 
					//valueof�� �ٲٴ� �������� �ƽ�Ű�ڵ�� ���� ����Ǳ� ������ 0~9�� ���� ���� Ȯ��(48~57) �� �ش� ���� �־���� ��
					msg.setText("");
				}
				else {
					msg.setText("���ڸ� �Է��ϼ���");
					if(!Character.isDigit(n)) {
						k.consume(); //keyTyped�� �̿��� �� consume(�����ɾ�)�� ����ϸ� �ش� �Է��� null�� ������.
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
