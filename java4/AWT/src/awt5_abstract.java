import java.awt.*;
import java.awt.event.*;


//AWT ȯ�漳��

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
		this.btn = new Button("�ߺ�üũ");
		this.closebtn = new Button("����");
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
		this.click(); //awt ������ �Ϸ� �� �ڵ鸵 �޼ҵ�� �̵�.
	}
	
	public void click() {
		//�ߺ�Ȯ�� ��ư
		this.btn.addActionListener(new ActionListener() {
			
			@Override
			//setText(���), getTest(�Է°� ��������);
			public void actionPerformed(ActionEvent e) {
				String userid = awt5_abstract.this.mid.getText();
				if(userid.equals("")) {
					msg.setText("���̵� �Է��ϼ���");
				}
				else {
					idcheck(userid);
					String result = signok();
					if(result==null) {
						msg.setText("��밡���� ���̵��Դϴ�");
					}
					else {
						msg.setText("�ٸ� ���̵� �Է��� �ֽʽÿ�");
						
					}
				}
				
			}
		});
		//�����ư
        this.closebtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
	
	
}
