import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * ����ڰ� �Է��� ���� ���߾� �������� �۵��Ǹ�, ������ ����Ͽ� ¦������ Ȧ �������� ����Ͻÿ�
		 * "������ ���ڸ� �Է��ϼ���" �޽��� ���
		 * �ش� ���ڿ� ���߾� ��� ����� ���� �� ¦ �� ���� Ȧ �� ������ ���.
		 */
		
		int a=1; //�ݺ���
		int sum=0;//����
		int e; // �Է� ���� �� ����
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է��ϼ���.");
		e=sc.nextInt();
		
		while(a<=9) {
			sum+=e*a;
			a++;
		}
		
		if(sum%2==0) {
			System.out.printf("������ %d�̰� ¦���Դϴ�.",sum);
		}
		
		else{
			System.out.printf("������ %d�̰� Ȧ���Դϴ�.",sum);
		}
		sc.close();

	}

}
