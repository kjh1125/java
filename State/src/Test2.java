import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * [���빮��] // ���ǹ� �ڵ�

���� �ڽ��� ���忡�� ��,����� �ϴ� ���μ��� ������ �ؾ� ��.
���� �⺻ �ڻ�ݾ�: 100,000��

"1�� �Է� �� �Ա�, 2�� �Է� �� ����Դϴ�." ��� �޽��� ���� ���� ����Ǿ�� ��.

1���� �Է� �� "�ش� �ݾ��� �Է��ϼ���"
����ڰ� �Է��� �ݾ� + �⺻ �ڻ�ݾ��� ���� �� �ڻ�ݾ��� ����ϸ� ��.

2���� �Է� �� "����� �ݾ��� �Է��ϼ���"
����ڰ� �Է��� �ݾ� - �⺻ �ڻ�ݾ��� ����Ͽ� �� �ڻ�ݾ��� ����ϸ� ��.
		 */

		int a = 100000;
		System.out.println("1�� �Է� �� �Ա�, 2�� �Է� �� ����Դϴ�.");
		Scanner b = new Scanner(System.in);
		int c = b.nextInt();
		int e;
		
		if (c==1) {	
			System.out.println("�ش� �ݾ��� �Է��ϼ���");
			e = b.nextInt();
			System.out.printf("�� �ݾ��� %d�Դϴ�",a+e);
		}
		else if(c==2) {
			System.out.println("����� �ݾ��� �Է��ϼ���");
			e = b.nextInt();
			System.out.printf("�� �ݾ��� %d�Դϴ�",a-e);
		}
		b.close();
		
	}

}
