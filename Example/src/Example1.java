import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * while������ �ڵ带 �ۼ��Ͽ��� �ϸ�, ���μ����� ������ �����ϴ�.
		 * ����ڰ� ��ǰ�� ��ü �����Ͽ����ϴ�.
		 * ������ 
		 * "7000 �����Ͻðڽ��ϱ�?" ��� ��µǸ�, ���� 1�̶�� �Է��ϸ� �������� �ݾ׿� �߰��Ǿ����ϴ�.
		 * �� 2��� �Է� �� �������� �ݾ׿� �߰��Ǹ� �� �˴ϴ�. 

		 *�� ���� Ƚ���� 4���Դϴ�.
		 *�������� ���� ���� �ݾ��� �������� �ڵ带 �ۼ��Ͻÿ�.
		 */
		
		int a=1;
		int sum = 0; //�� �ݾ�
		Scanner sc = new Scanner(System.in);
		int se; // �Էº���
		int count=0; 
		
		while(a<=4) {
			System.out.println("7000���� �����Ϸ��� 1���� �����ּ���");
			se = sc.nextInt();
			if(se==1) {
				sum+=7000;
				count++;
			}
			a++;
		}
		System.out.printf("�� %d�� �� %d���� ���� �ݾ��� %d���Դϴ�",a-1,count,sum);
		sc.close();
		
	}

}
