import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * ����ڰ� �Է��� ���� ���߾� �������� �۵��Ǹ�, ������ ����Ͽ� ¦������ Ȧ �������� ����Ͻÿ�
		 * "������ ���ڸ� �Է��ϼ���" �޽��� ���
		 * �ش� ���ڿ� ���߾� ��� ����� ���� �� ¦ �� ���� Ȧ �� ������ ���.
		 */
		
		byte a=1; //�ݺ���
		int sum=0;//����
		byte e; // �Է� ���� �� ����
		String msg;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է��ϼ���.");
		e=sc.nextByte();
		do{
			sum+=e*a;
			a++;
		}while(a<=9);
		
		if(sum%2==0) {
			msg ="¦��";
		}
		
		else{
			msg ="Ȧ��";
		}
		
		System.out.printf("������ %d�̰� %s�Դϴ�.",sum,msg);
		
		sc.close();

	}

}
