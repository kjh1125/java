import java.util.Scanner;

public class Example9 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 9 A�л��� ���� ������ �Է¹ް� ��������� ������ ���α׷��� �����մϴ�. "������ �Է��ϼ���"��� ������ �� 5���� ������ �Ǹ�
		 * ��� ������ �ջ��� �� 5���� ���������� ��հ��� ��µ˴ϴ�. ��¸޼���: "�ش� ������ ���� : " ��� ��, ���� ������ 40�� ����
		 * �ϰ�� "������Դϴ�."��� ����Ͻÿ�. 
		 * 
		 * [�߰���ȹ] "�Է��Ͻ� ���� ���� �־��ּ��� :"��� ���� ���� ����� �ش� ���� ����ŭ �ݺ�����
		 * ������ �Ǹ�, ���� ����ŭ ��հ��� ����Ǿ�� �մϴ�.
		 *
		 */

		int a; // �ݺ����� ���.
		int sum = 0; // �հ迡 ���.
		String msg = "�Է��Ͻ� ���� ���� �־��ּ���";

		Scanner sc = new Scanner(System.in);
		System.out.println(msg);
		int num = sc.nextInt();
		msg = "��° ������ �Է��ϼ���\n";
		
		
		for (a = 1; a <= num; a++) {
			System.out.printf(a + msg);
			int score = sc.nextInt(); // ���� �Է�
			sum += score;

		}
		double grade = (double)sum / num; // ��հ��
		int average = 40; // �հݼ�

		if (grade > average) {
			msg = "�հ��Դϴ�.";
			System.out.printf("����: %f "+msg,grade);
			
		} else {
			msg = "�����";
			System.out.printf("����: %f "+msg,grade);
				
		}
		sc.close();
		

		

	}

}
