import java.util.Scanner;

public class Scan6 {
    // Alt + ����Ű�� �ش� �� ���� ����.
	public static void main(String[] args) {
		Scanner mid = new Scanner(System.in);
		System.out.println("������ ���̵� �Է��ϼ���.");
		String m = mid.next(); // ����ڰ� ���̵� �Է�
		mid.close();
		Scanner mpass = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���.");
		String p = mpass.next(); // ����ڰ� �н����� �Է�
		mpass.close();
      //System.out.printf("���̵�:%s, �н�����:%s",m,p);

		/*
		 * [�α��� ���α׷�]
		 * ȸ������ ���̵�� jung, su
		 * �н�����
		 * jung: j1234
		 * su: ssh
		 * 
		 * �ش� id�ܿ� �������� "���Ե��� ���� ������Դϴ�." ��� ���
		 * ���� �н����尡 Ʋ�� ��� "ȸ�������� �ٽ� Ȯ���ϼ���" ��� ���
		 * ���̵� �� �н����尡 ��� ���� ��� "�α��� �Ǽ̽��ϴ�." ��� ���
		*/
		// scan ��� �� equals ��� // ���� �Է� Ȯ�� �� == ��� �Ұ�
		
		if(m.equals("jung") || m.equals("su")) {
			if(m.equals("jung")&&p.equals("j1234")) {
				System.out.println("�α��� �Ǽ̽��ϴ�.");
			}

			else if (m.equals("su")&&p.equals("ssh")) {
				System.out.println("�α��� �Ǽ̽��ϴ�.");
			}
			else {
				System.out.println("ȸ�������� �ٽ� Ȯ���ϼ���");
			}

	}
		else {
		System.out.println("���Ե��� ���� ����� �Դϴ�.");
		}
		
		
}
}