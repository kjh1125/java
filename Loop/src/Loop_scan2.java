import java.util.Scanner;

public class Loop_scan2 {

	public static void main(String[] args) {

		/*
		 * Scanner�� �Բ� while������ ����ڰ� �Է��ϴ� ������ ������ ����� ��µǴ� ���α׷��� �����Ͻÿ�.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("���ϴ� ������ ���ڸ� �Է��ϼ���");
		int c = sc.nextInt();
		int a = 1;
		int b;

		while (a <= 9) {
			b = c * a;
			System.out.printf("%d ", b);
			a++;
		}
		sc.close();

	}

}
