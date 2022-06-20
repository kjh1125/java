package swing1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class swing11 extends JFrame {
	
	//ImageIcon : 이미지 파일을 로드할 때 사용합니다
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing11 frame = new swing11();
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
	public swing11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn = new JButton("\uC774\uBBF8\uC9C0 \uB85C\uB4DC");
		btn.setFont(new Font("돋움체", Font.PLAIN, 12));
		btn.setBounds(34, 37, 110, 23);
		contentPane.add(btn);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(Color.RED));
		lb.setBounds(34, 77, 730, 400);
		contentPane.add(lb);
		
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ImageIcon img = new ImageIcon("C:\\java5\\Swing\\src\\swing1\\mandu3.jpg");
				Image reimg = img.getImage(); //이미지 파일 경로를 로드
				//getScaledInstance(가로, 세로, 변환방법)
				//SCALE_SMOOTH : 부드럽게 , 
				//SCALE_FAST: 빠르게(pixel이 깨지는 경우 발생)
				//SCALE_DEFAULT: 기존 이미지가 가진 해상도에 맞춰 적용
				//SCALE_AREA_AVERAGING: 모니터 해상도 평균값으로 적용
				Image resize = reimg.getScaledInstance(730, 400, Image.SCALE_AREA_AVERAGING);
				ImageIcon rimg = new ImageIcon(resize);
				
				lb.setIcon(rimg);
				
			}
		});
	}

}
