package swing1;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JEditorPane;

public class swing9 extends JFrame {
	//jEditorPane은 게시판 내용 출력 또는 입력 등에 사용이 되며,
	//하이브리드 웹앱에서는 HTMK을 로드하여 출력할 수 있습니다.
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					swing9 frame = new swing9();
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
	public swing9() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 800);
		setTitle("하이브리드 웹 앱");
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JEditorPane webpage = new JEditorPane();
		webpage.setBounds(10, 10, 768, 745);
		contentPane.add(webpage);
		webpage.setContentType("text/html"); // setContentType : 문자와 HTML 코드 함께 사용
		webpage.setText("<h1>123</h1>"
		+ "<img src = https://www.urbanbrush.net/web/wp-content/uploads/edd/2021/06/urbanbrush-20210611102855770634.jpg>"
		+ "<br><font color ='orange'>라이언~</font>"
		+ "<br><input type ='text' id ='name'></input>"
		);
		
		
	}
}
