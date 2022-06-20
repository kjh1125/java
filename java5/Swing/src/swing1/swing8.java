package swing1;


import java.awt.EventQueue;

import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import java.awt.Color;

public class swing8 extends JFrame {
//progress바 사용법
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing8 frame = new swing8();
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

	private JProgressBar progress = null;
	private JLabel msg = null;

	public swing8() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 501, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		this.progress = new JProgressBar();
		this.progress.setStringPainted(true);
		this.progress.setBounds(34, 20, 422, 37);
		contentPane.add(progress);

		this.msg = new JLabel("");
		this.msg.setBounds(82, 86, 335, 15);
		contentPane.add(this.msg);

		// swing 프로그램이 작동 후 해당 메소드로 1초 후 실행되도록 적용함
		Timer t = new Timer();
		TimerTask task = new TimerTask() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				pstart();
			}
		};
		t.schedule(task, 1000);

	}

	public void pstart() {
		int w = 0;
		try {
			while (w <= 100) {

				this.progress.setValue(w);
				Thread.sleep(100);

				w++;
			}

		} catch (Exception e) {
			System.out.println("오류발생");
		}
		if (this.progress.getValue() == 100) {
			this.msg.setText("다운이 완료되었습니다");
		}
	}
}
