import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

//�ܺ� Ŭ������ awt ����
public class awt2 {

	public static void main(String[] args) {
		login lg = new login();

	}

}

class loginok extends login{ //ȸ�����Թ�ư�� ���� ȭ�� ��ȯ �� ������ �ڽ� class
	
	public loginok(){

		this.fr.setTitle("�α��� �� ������");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);

	}
	
}

class login{ // ������ > ������ extends �߻�(abstract) class�� ���� �ε��Ͽ� �ʵ忡 ������Ѿ� ��.
	Frame fr = new Frame();
	Font ft = new Font("����ü", Font.BOLD, 20); // ("����ü",Font.Bold(����),����ũ��);
	TextField mid = new TextField();
	TextField mpw = new TextField();
	Button loginbtn = new Button("�α���");
	Button submitbtn = new Button("ȸ������");
	Button closebtn = new Button("���α׷� ����");
	Label msg = new Label();
	
	
	
	public login() { 
		this.fr.setTitle("�α��� �����");
		this.fr.setBounds(0,0,400,400);
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		
		mid.setFont(ft); // ���� �Ӽ� ����.
		mpw.setFont(ft); 
		mpw.setEchoChar('*'); // EchoChar ��ɾ�� ' ' ����ؾ� ��.
		
		
		
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
	
	public void clicks() { //��ư�� ���� ��� �ڵ鸵 �޼ҵ� ���ռ�
		this.closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//���α׷� ���� �̺�Ʈ �ڵ鸵 �޼ҵ�
				System.exit(0);
				
			}
		});
		
		this.submitbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				fr.setVisible(false); // �ش� ������ ����
				loginok ok = new loginok(); // ���� ������ �ε�
				
			}
		});
		
		this.loginbtn.addActionListener(new ActionListener() {
			JOptionPane alert = new JOptionPane(); //swing API ��� �ɼǷε�
			@Override
			public void actionPerformed(ActionEvent e) {
				//�α��� ��ư ���̵� �� �н����� ����
				String user_id = mid.getText(); //object��.getText: ����ڰ� �Է��� ���� ������ �� ���.
				String user_pw = mpw.getText();
				if(user_id.equals("")) { //null ��� ���� => null ���� ǥ�� ���� �ִ� ���¸� ����.
					msg.setText("���̵� �Է��ϼ���");
					//alert.showMessageDialog(null, "���̵� �Է��ϼ���");
				}
				else {
					//msg.setText("");
					if(user_pw.equals("")) {
						msg.setText("�н����带 �Է��ϼ���");
						//alert.showMessageDialog(null, "��й�ȣ�� �Է��ϼ���");
					}
					else {
						//alert.showMessageDialog(null, "�α��� �Ǿ����ϴ�");
						msg.setText("�α����� �����մϴ�");
					}
				}
			}
		});
	}
	
}


