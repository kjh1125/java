package java_1;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class test1_abstract {

	ArrayList<String> total = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	String c = "";
	String msg = "";
	boolean d = false;

	public void setter() {

		db();
		question();

	};

	public void question() {
		
		System.out.println("�����߰�[1],�������[2],���񸮽�Ʈ Ȯ��[3],���α׷�����[4]");
		int b = sc.nextInt();

		if (b == 1) {
			this.d = false;
			System.out.println("�߰��� ������� �Է��ϼ���");
			c = sc.next();
			for (int f = 0; f < this.total.size(); f++) {

				if (c.equals(this.total.get(f))) {
					this.msg = "��ϵ� �����Դϴ�";
					this.d = true;
				}

			}
		if(this.d==true) {
			System.out.println(msg);
			question();
		}
		else {
			System.out.println("���������� ��ϵǾ����ϴ�.");
			this.total.add(c);
			question();
		} 
			
			
		} 
		else if (b == 2) {
			this.d = false;
			System.out.println("������ ������� �Է��ϼ���");
			c = sc.next();
			for (int f = 0; f < this.total.size(); f++) {

				if (c.equals(this.total.get(f))) {
					this.total.remove(f);
					System.out.println("���������� �����Ǿ����ϴ�");
					this.d=true;
					question();
				} 
			}
			if(this.d==false) {
				System.out.println("�ش� ������� �����ϴ�.");
				question();
			}

		}

		else if(b == 3) {
			System.out.println(this.total);
			question();
		}
		
		else {
			System.out.println("����");
			sc.close();
			System.exit(0);
		}

	}

	public void db() {

		String a[] = { "����", "����", "�ѱ���", "������", "�������" };

		for (int f = 0; f < a.length; f++) {
			this.total.add(a[f]);
		}

	};

}
