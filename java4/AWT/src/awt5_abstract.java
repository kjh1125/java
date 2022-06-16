import java.awt.*;
import java.awt.event.*;


//AWT 환경설정

public abstract class awt5_abstract {
	
	public abstract String signok(); //getter
	public abstract void idcheck(String id); //setter
	public abstract void dataload(); //DB
	
	Frame fr = new Frame();
	Button btn = null;
	Button closebtn = null;
	TextField mid =null;
	Label msg = new Label();
	
	public void design() {
		this.fr.setBounds(200,200,300,450);
		this.fr.setLayout(null);
		this.fr.setVisible(true);
		this.btn = new Button("중복체크");
		this.closebtn = new Button("종료");
		this.mid = new TextField();
		this.msg.setBackground(Color.LIGHT_GRAY);
		this.msg.setBounds(25, 200, 250, 25);
		this.mid.setBounds(25, 160, 150, 25);
		this.btn.setBounds(195, 160, 80, 25);
		this.closebtn.setBounds(195, 400, 80, 25);
		
		this.fr.add(msg);
		this.fr.add(mid);
		this.fr.add(btn);
		this.fr.add(closebtn);
		this.click(); //awt 디자인 완료 후 핸들링 메소드로 이동.
	}
	
	public void click() {
		//중복확인 버튼
		this.btn.addActionListener(new ActionListener() {
			
			@Override
			//setText(출력), getTest(입력값 가져오기);
			public void actionPerformed(ActionEvent e) {
				String userid = awt5_abstract.this.mid.getText();
				if(userid.equals("")) {
					msg.setText("아이디를 입력하세요");
				}
				else {
					idcheck(userid);
					String result = signok();
					if(result==null) {
						msg.setText("사용가능한 아이디입니다");
					}
					else {
						msg.setText("다른 아이디를 입력해 주십시오");
						
					}
				}
				
			}
		});
		//종료버튼
        this.closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
	
	
}
