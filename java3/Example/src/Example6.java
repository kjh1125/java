import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ��ǰ������ 42000���Դϴ�. ����ڰ� �ش� ��ǰ�� ������ �Է��ϰ� �˴ϴ�. �ش� ��ǰ ���ݿ� �´� ������ŭ ���Ͽ� ���� ����
		 * �ݾ��� ��½�Ű�� extends�� ���� ��, 42000�� ���� ���ڰ� �ٲ�� �� ��. ����ڰ� �ִ�� ������ �� �ִ� ������ 5��������.
		 * ���� ������� main method���� ����մϴ�.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("������ ��ǰ�� ������ �����ϼ���.");
		int sc1 = sc.nextInt();
		ex6_2 e = new ex6_2();
		if (sc1 > 5) {
			System.out.println("������ �� �ִ� ������ ���");
			System.exit(0);
		} 
		else {
			e.ex1(sc1);
			int b = e.ex();
			System.out.printf("�հ� �ݾ��� %d �Դϴ�", b);
		}
		sc.close();

	}

}

class ex6_1 {
	private final int price = 42000;
	protected int sum;

	public void ex1(int a) {

		this.sum = a * this.price;

	}
}

class ex6_2 extends ex6_1 {

	public int ex() {
		return this.sum;
	}

}
