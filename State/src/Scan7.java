import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		
		/*
		 * [������ȣ �߼ۿ� ���� ��ȣ �� �ڵ�]
		 * Q. �������� ��ȣ�� �Է��ϼ���.
		 * ���� 220524
		 * 
		 * ����ڰ� ���� 220524 ���� ���ڸ� �Է� ��
		 * "������ȣ�� Ʋ���ϴ�." ��� ���
		 * 
		 * ������ ������ȣ �Է� �� "����Ȯ�� �Ǽ̽��ϴ�." ��� ���.
		 * 
		 * �� 220524�� java���� �� ���� ���� ����Ǵ� ������ ó���ϼ���.
		 */
		
		int sc = 220524; // ����ڰ� ������ �ִٴ� ������ ���� ó���� ������ ����.
		
		System.out.println("�������� ��ȣ�� �Է��ϼ���.");
		
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		a.close();
		
		if(b==sc) {
			System.out.println("����Ȯ�� �Ǽ̽��ϴ�.");
		}
		else {
			System.out.println("������ȣ�� Ʋ���ϴ�.");
		}
		
	}

}
