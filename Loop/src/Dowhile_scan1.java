import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*
		 * ���빮�� (do~while)
		 * ����ڰ� �� 3���� ���ڸ� �Է��մϴ�.
		 * 3���� ���ڸ� ��� ���Ͽ� �� �հ� ���� ����Ͻÿ�.
		 */
		
		Scanner sc = new Scanner(System.in);
		byte a = 1;
		int score;
		long total=1; // long�� �Է� �� ����������� ����(-)�� ������ ��찡 �߻���. 
		
		do {
			System.out.println(a+"��° ���ڸ� �Է��ϼ���");
			score=sc.nextInt();
			total*=score;
			a++;
		}while(a<=3);

		System.out.printf("%d���� ����: %d�Դϴ�.",a-1,total);
		sc.close();

	}

}
