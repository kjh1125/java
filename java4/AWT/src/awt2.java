import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

//외부 클래스로 awt 생성
public class awt2 {

	public static void main(String[] args) {
		login lg = new login();

	}

}

class loginok extends login{ //회원가입버튼을 통해 화면 전환 후 나오는 자식 class
	
	public loginok(){

		this.fr.setTitle("로그인 후 페이지");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);

	}
	
}

class login{ // 연습용 > 원래는 extends 추상(abstract) class를 먼저 로드하여 필드에 적용시켜야 함.
	Frame fr = new Frame();
	Font ft = new Font("돋움체", Font.BOLD, 20); // ("글자체",Font.Bold(굵음),글자크기);
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Button loginbtn = new Button("로그인");
	Button submitbtn = new Button("회원가입");
	Button closebtn = new Button("프로그램 종료");
	Label msg = new Label();
	
	
	
	public login() { 
		this.fr.setTitle("로그인 만들기");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		mid.setFont(ft); // 글자 속성 적용.
		mpw.setFont(ft); 
		mpw.setEchoChar('*'); // EchoChar 명령어는 ' ' 사용해야 됨.
		
		
		
		mid.setBounds(100,60,200,40);
		mpw.setBounds(100,120,200,40);
		loginbtn.setBounds(100,180,200,40);
		loginbtn.setBackground(Color.pink);
		submitbtn.setBounds(100,240,200,40);
		submitbtn.setBackground(Color.BLUE);
		this.closebtn.setBounds(100,300,200,40);
		this.closebtn.setBackground(Color.green);
		this.msg.setBounds(100,100,200,20);
		
	
		
		this.fr.add(mid);
		this.fr.add(mpw);
		this.fr.add(loginbtn);
		this.fr.add(submitbtn);
		this.fr.add(this.closebtn);
		this.fr.add(this.msg);
		
		this.clicks();
	}
	
	public void clicks() { //버튼에 관한 모든 핸들링 메소드 집합소
		this.closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//프로그램 종료 이벤트 핸들링 메소드
				System.exit(0);
				
			}
		});
		
		this.submitbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); // 해당 프레임 종료
				loginok ok = new loginok(); // 다음 프레임 로드
				
			}
		});
		
		this.loginbtn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); //swing API 경고 옵션로드
			@Override
			public void actionPerformed(ActionEvent e) {
				//로그인 버튼 아이디 및 패스워드 검토
				String user_id = mid.getText(); //object명.getText: 사용자가 입력한 값을 가져올 때 사용.
				String user_pw = mpw.getText();
				if(user_id.equals("")) { //null 사용 금지 => null 또한 표현 값이 있는 상태를 말함.
					msg.setText("아이디를 입력하세요");
					//alert.showMessageDialog(null, "아이디를 입력하세요");
				}
				else {
					//msg.setText("");
					if(user_pw.equals("")) {
						msg.setText("패스워드를 입력하세요");
						//alert.showMessageDialog(null, "비밀번호를 입력하세요");
					}
					else {
						//alert.showMessageDialog(null, "로그인 되었습니다");
						msg.setText("로그인을 진행합니다");
					}
				}
			}
		});
	}
	
}


