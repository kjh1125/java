import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 8��
		 * ����� �н������ a1234
		 * �н����� �Է�. 3ȸ �̻� ���� �� ������ ���� ��� �ǵ��� ��.
		 * "�н����� Ƚ�� �������� ����� ������ �湮�ϼž� ��."
		 * ��, �н����� ���� ��� "�α��� �Ǿ����ϴ�."��� ���
		 * 
		
		
		final String pw = "a1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�н����带 �Է��ϼ���");
		String pw1=sc.next();
		int a = 1; //�ݺ���
		Boolean ok = false;
		
		while(a<=3) {
			if(pw1.equals(pw)) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				ok = true;
				break;
			}
			else if(!pw1.equals(pw)&&a<=2){ 
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�, �ٽ� �Է����ּ���.");
				pw1=sc.next();
			}
			a++;
			}
		if(ok==false) {
			System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� ��.");
			
		}
		 */
		final String pw = "a1234";
		int c = 3;
		Scanner sc = new Scanner(System.in);
		int w = 0;
		String msg = "�н����� �Է�";
		
		while(w<3) {
			System.out.println(msg);
			String user_pw = sc.next();
			
			if(pw.equals(user_pw)) {
			System.out.println("�α��� �Ǿ����ϴ�.");
			break;
			}
			else {
				msg = "�ùٸ� �н����带 �־��ּ���";
				c--;
				if(c==0) {
					System.out.println("�н����� Ƚ�� �������� ����� ������ �湮�ϼž� �մϴ�");
				}
			}
			w++;
		}
sc.close();
	
	
	}

}
