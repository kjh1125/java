import java.util.Scanner;

public class Scan1 {

	public static void main(String[] args) {
		Scanner b = new Scanner(System.in);
		System.out.print("����� ���̴�?");
		b.close();
		int c = b.nextInt();
		System.out.println("�ش� ���̴�"+c+"�Դϴ�");
		
		Scanner d = new Scanner(System.in);
		System.out.println("�Է��Ͻ� �ݾ��� �����ּ���.");
		d.close();
		int e = d.nextInt();
		
		if(e<1000) {
			System.out.println("1000�� �̻� �ݾ��� �Է��ϼž� �մϴ�");
		}
		else {
			System.out.println("�Ա��� ����˴ϴ�");
		}

	}

}
