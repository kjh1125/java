import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class awt1 {

	
	public awt1() {
	
	}
	
	public static void main(String[] args) {
		//Frame > Bound > Object
		Frame fr = new Frame(); // 창
		
		fr.setTitle("AWT 기초 화면");
		fr.setVisible(true);
		fr.setLayout(null); //패널 사용 안 함. 
		fr.setBounds(150,150,500,500); //(화면 x축, 화면 y축, 가로크기, 세로크기)
		
		Button btn = new Button("클릭");
		Button closebtn = new Button("닫기");
		Label msg = new Label("");
		// msg.setBackground(Color.red); 
		
		btn.setBounds(40, 40, 100, 30);
		closebtn.setBounds(160, 40, 100, 30);
		msg.setBounds(40, 100, 300, 30);
		
		fr.add(msg);
		fr.add(btn);
		fr.add(closebtn);
		
		//addActionListener : 이벤트 메소드 단, this 사용 절대 안 됨.
		btn.addActionListener(new ActionListener() { 
			// new ActionListener () : Override 메소드 자동생성
			String a = "홍길동"; //  new ActionListener: 이벤트 메소드 필드에 String을 생성.
			@Override
			public void actionPerformed(ActionEvent e) {
				msg.setText(this.a);//this를 이용하여 핸들링 가능함.
				
			}
		});
		
		closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
	
}
