package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class swing12 extends JFrame {

	private String imgdata[] = {"mandu1.jpg","mandu2.jpg","mandu3.jpg"};
	private JPanel contentPane;
	public int count = 0;
	public String url = "C:\\java5\\Swing\\src\\swing1\\";

	//http://namver.com.1.jpg or C:\java5\Swing\src\swing1 절대경로
	// ./1.jpg or /1.jpg: 상대경로
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing12 frame = new swing12();
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
	public swing12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 700, 700);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lb = new JLabel("");
		lb.setBorder(new LineBorder(Color.RED));
		lb.setBounds(10, 47, 668, 608);
		contentPane.add(lb);
		
		JButton prebtn = new JButton("\uC774\uC804");
		prebtn.setBounds(10, 10, 93, 23);
		contentPane.add(prebtn);
		
		JButton nextbtn = new JButton("\uB2E4\uC74C");
		nextbtn.setBounds(585, 10, 93, 23);
		contentPane.add(nextbtn);
		
		ImageIcon v = new ImageIcon(url+imgdata[0]);
		lb.setIcon(v);
		
		
		prebtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swing12.this.count --;
				if(swing12.this.count < 0) {
					swing12.this.count = 0;
				}
				System.out.println(swing12.this.count);
				
				ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count]);
				lb.setIcon(v);
				
			}
		});
		
		nextbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				swing12.this.count ++;
				if(swing12.this.count > swing12.this.imgdata.length-1) {
					swing12.this.count = swing12.this.imgdata.length-1;
				}
				System.out.println(swing12.this.count);
				
				ImageIcon v = new ImageIcon(url+imgdata[swing12.this.count]);
				lb.setIcon(v);
				
			}
		});
	}

}
