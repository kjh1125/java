import java.awt.*;
import java.awt.event.*;

//awt6.java�� ����
abstract class awt6_abstract {

	abstract public void rdnumcreate(); // ������ ���� ����

	abstract public void check(int a); // ���� ��

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
		this.sendbtn = new Button("������ȣ�߼�");
		this.confirmbtn = new Button("����Ȯ��");
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

	public void click() { //������ȣ ����
		this.confirmbtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String insertnum = awt6_abstract.this.check.getText();
				if (insertnum.equals("")) {
					msg.setText("��ȣ�� �Է��ϼ���");
				} else {
					try {
						int a = Integer.parseInt(insertnum);
						check(a);
					} catch (Exception e1) {
						msg.setText("���ڸ� �Է��ϼ���");
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
