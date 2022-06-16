import java.awt.*;
import java.awt.event.*;

public class awt4_class {
//awt4.java와 연계
	
	public void view() {
		TextField input = new TextField();
		decorate de1 = new decorate(); //awt4.java 자식 클래스 로드
		Frame f = new Frame();
		TextArea lb = new TextArea();
		f.setBounds(200, 200, 300, 300);
		f.setVisible(true);
		f.setLayout(null);
		Button btn = new Button("계산");
		Button closebtn = new Button("종료");
		lb.setBackground(Color.gray);
		input.setBounds(50, 50, 100, 25);
		btn.setBounds(180, 50, 80, 25);
		closebtn.setBounds(180, 75, 80, 25);
		lb.setBounds(50, 100, 200, 200);
		f.add(lb);
		f.add(input);
		f.add(btn);
		f.add(closebtn);
		
		
		btn.addActionListener(new ActionListener() { // 하나의 클래스 개념으로 안에 this 사용 불가
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
			    int c= Integer.parseInt(input.getText());
				de1.btn_push(c); // 사용자가 입력한 값을 btn_push 메소드로 전달
				lb.setText(de1.calls()); // awt4.java에 있는 getter 메소드 값 받음.
				}
				catch(Exception e1){
					lb.setText("숫자만 입력하세요");
				}
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
