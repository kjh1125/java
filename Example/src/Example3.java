import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 3��
		 * ����ڰ� �ش� ���� �Է��մϴ�.
		 * ��, ����ڰ� 2���� ���ڸ� �Է��ϵ� ù ��° ���ڿ� �� ��° ���� ���� �ȿ� �ִ� 
		 * ��� ���ڸ� �� �ؼ� ������� �������� �Ͻÿ�. 
		 * ��, �ش� �ڵ�� do~while������ �ۼ��� ��.
		 * ex)
		 * ù ��° ���� ���ڴ�? 5
		 * �� ��° ���� ���ڴ�? 10
		 * ���� ���� ��� �հ�� : 45�Դϴ�.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� ���ڴ�?");
		int a = sc.nextInt();
		
		System.out.println("�� ��° ���� ���ڴ�?");
		int a1 = sc.nextInt();
		
		int sum = 0;
		
		if(a<=a1) {
		do {
			sum+=a;
			a++;
		}while(a<=a1);
		}
		
		else {
			do {
				sum+=a;
				a--;
			}while(a>=a1);
		}
		
		System.out.printf("���� ���� ��� �հ�� %d�Դϴ�.",sum);
		
		sc.close();
		
	}

}
