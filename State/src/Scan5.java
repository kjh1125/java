import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {

		/*
		byte a = 33;
		if(a < 10) {
			System.out.println("10�̻� ���ڸ� �Է��ϼ���.");
		}
		else if(a >= 10 && a <= 22) { // ���ǹ��� ������ �����Ͽ� ������.
			System.out.println("��÷�Դϴ�.");
		}
		else {
			System.out.println("���� ���� �����Դϴ�.");
		}
		
		 */
		
		
		/*
		 * 1���� 45���� �����ϳ��� �Է��ϼ���.
		 * error ����
		 * 0 �Է�: ���� �Է��� �߸� �Ǿ����ϴ�.
		 * 45���� ū ���ڸ� �Է� ��: ���ڴ� 1~45������ �Է� �����մϴ�.
		 * 1~45 ���ڸ� �Է��� ���
		 * 7,12,14 �� ��ȣ �Է��� ��� ��÷�Դϴ� ���
		 * 1~45���� �� �� ���� �Է� �� ������ȸ�� �����ϼ����� ���. 
		 */
		
		/*
		Scanner a = new Scanner(System.in);
		System.out.println("1���� 45���� ���� �ϳ��� �Է��ϼ���.");
		short num = a.nextShort();
		
		if(num==0) {
			System.out.println("���� �Է��� �߸��Ǿ����ϴ�.");
		}
		else if(num>=1 && num<=45) {
			if(num==7||num==12||num==14) {
				System.out.println("��÷�Դϴ�.");
			}
			else {
			    System.out.println("������ȸ�� �����ϼ���");
			}
		}
		else{
			System.out.println("���ڴ� 1~45������ �Է� �����մϴ�.");
		}
		*/
		
		Scanner qa = new Scanner(System.in);
		System.out.println("1~45���� ���� �Է�");
		int n = qa.nextInt(); //����ڰ� �Է��ϴ� ��
		qa.close();
		
		if(n==0) {
			System.out.println("�����Է��� �߸��Ǿ����ϴ�.");
		}
		else if(n>45)
		{
			System.out.println("1~45������ �Է��ϼ���");
		}
		// �߰� if ���� ���� ������ else�� �־�� ������ ����.
		else {
			if(n==7||n==12||n==14) {
			System.out.println("20% ���� ��÷");
			}
			else if(n==41) {
				System.out.println("50% ���� ��÷");
			}
			else {
				System.out.println("���� ��ȸ��");
			}
		}
		
	}

}
