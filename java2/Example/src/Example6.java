import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

		/*
		 * [2���迭] user_list:{"ȫ�浿","�̼���","������","������","�������","������","����屺"}
		 * user_point:{"3000","1000","25000","19800","5750","3630","0"}
		 * 
		 * ���α׷� ���۰� ���ÿ� "����Ʈ�� �˻��� ������ �Է��ϼ���" �Է��� ���� ������ class�� �����Ͽ� �ش� �޼ҵ� ������ �Ű�������
		 * �̿��Ͽ�, ���� �� �ش� ������� ����Ͻø� �˴ϴ�.
		 * 
		 */
		System.out.println("����Ʈ�� �˻��� ������ �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		user us = new user();
		us.user1(a);
		us = null;
		sc.close();

	}

}

class user {
	public void user1(String name) {
		String userdata[][] = { { "ȫ�浿", "�̼���", "������", "������", "�������", "������", "����屺" },
			                  	{ "3000", "1000", "25000", "19800", "5750", "3630", "0" } };

		//int usea = userdata.length; // �迭 ���� 2
		int usea1 = userdata[0].length; // ������ ���� 7
		int w = 0;
		String msg = "";
		boolean b = false;
		
		while (w < usea1) {
				if (name.equals(userdata[0][w])) {
					msg = name + "���� ����Ʈ��:" + userdata[1][w] + "���Դϴ�.";
					b = true;
					}
			w++;
		}
		if (b == false) {
			msg = "�������� �ʴ� ȸ���Դϴ�.";
		}
		System.out.println(msg);
	}
}
