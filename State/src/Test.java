import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		[���빮��]
				����ڰ� �Է��Ͽ� ���ǿ� �´� �޽����� ����Ͻÿ�.
				ù ��° ���ڰ��� �Է��ϼ���.
				�� ��° ���ڰ��� �Է��ϼ���.

				ù ��° ���ڰ� * �� ��° ���ڰ��� ���� ����� ����Ͻʽÿ�.

				��, �ش� ������� 100 ������ ��� 
				"100������ ������Դϴ�."��� ���

				100 �̻��� ���
				"�ش� ���� 100�̻� ��� ���Դϴ�."��� ���
				*/
		
		Scanner a = new Scanner(System.in);
		System.out.println("ù ��° ���� ���� �Է��ϼ���");
		int a1 = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("�� ��° ���� ���� �Է��ϼ���");
		int b1 = b.nextInt();
		a.close();
		b.close();
		
		int c1 = a1+b1;
		
		if(c1<100) {
			System.out.printf("100�̸��� ��� ���̰� ��Ȯ�� ���� %d�Դϴ�",c1);
		}
		else {
			System.out.printf("�ش� ���� 100�̻��̰� ��Ȯ�� ���� %d�Դϴ�.",c1);
		}

	}

}
