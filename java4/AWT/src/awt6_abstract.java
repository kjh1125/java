import java.awt.*;
import java.awt.event.*;

//awt6.java와 연계
abstract class awt6_abstract {

	abstract public void rdnumcreate(); // 랜덤한 숫자 생성

	abstract public void check(int a); // 숫자 비교

	Frame fr = new Frame();
	Button confirmbtn = null;
	Button sendbtn = null;
	Button closebtn = null;
	TextField check = null;
	Label msg = new Label();

	public void design() {
		this.fr = new Frame();
		this.fr.setVisible(true);
		this.fr.setLayout(null);
		this.fr.setBounds(200, 200, 350, 180);
		this.sendbtn = new Button("인증번호발송");
		this.confirmbtn = new Button("인증확인");
		this.closebtn = new Button("X");
		this.check = new TextField("");
		this.confirmbtn.setBounds(225, 100, 100, 25);
		this.sendbtn.setBounds(75, 70, 100, 25);
		this.closebtn.setBounds(295, 70, 30, 25);
		this.check.setBounds(75, 100, 140, 25);
		this.msg.setBounds(75, 130, 250, 25);
		this.msg.setBackground(Color.lightGray);

		this.fr.add(confirmbtn);
		this.fr.add(sendbtn);
		this.fr.add(closebtn);
		this.fr.add(check);
		this.fr.add(msg);

		this.click();

	}

	public void click() { //인증번호 전송
		this.confirmbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String insertnum = awt6_abstract.this.check.getText();
				if (insertnum.equals("")) {
					msg.setText("번호를 입력하세요");
				} else {
					try {
						int a = Integer.parseInt(insertnum);
						check(a);
					} catch (Exception e1) {
						msg.setText("숫자를 입력하세요");
					}
				}
			}
		});
		this.sendbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				rdnumcreate();
			}
		});
		this.closebtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}

		});

	}

}
