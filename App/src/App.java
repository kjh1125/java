
public class App {

	public static void main(String[] args) {
		/*
		 * int a = 10; int b = 20; int c; // ��Ģ�����ȣ : +, -, *, /
		 * 
		 * // c = a+b; // c = a-b; // c = a*b; c = b / a;
		 * 
		 * System.out.println(c);
		 * 
		 * String a1 ="ȫ�浿"; String b1 ="ȯ���մϴ�."; String c1;
		 * 
		 * c1 = a1+b1; //+�� ���������� ���� ����Ͽ� ����+���ڿ��� ǥ�� ����. System.out.println(c1);
		 * 
		 * /* ���빮�� ������ ���� ��µǴ� �ڵ带 �ϼ��Ͻÿ�.
		 * 
		 * ȫ�浿�� �������� 50000 �Դϴ�. �� ȫ�浿(�̸�)�� 50000(�ݾ�)�� ������ �����ؾ� ��.
		 * 
		 */

		/*
		 * String a2; int b2;
		 * 
		 * a2 = "ȫ�浿"; b2 = 50000;
		 * 
		 * String c2 = a2+"�� �������� "+ b2 +" �Դϴ�.";
		 * 
		 * System.out.println(c2);
		 */

		/*
		 * String mname = "ȫ�浿"; int mpoint = 50000;
		 * 
		 * System.out.println(mname+"�� ��������"+mpoint+"�Դϴ�.");
		 * 
		 * 
		 * /* ���빮�� �Ƹ��� ����Ʈ���� ��ǰ�� �����Ͽ���. ��ٱ��Ͽ� ���� ��ǰ ������ ��� �� �ؼ� �� ���� �ݾ��� ��µǵ��� �Ͻÿ�. �� ��
		 * $ ȯ���� ��µǾ�� ��. 8.25 4.02 3.71 ��� ���� ������ ���� ����Ͻÿ�. �� �����ݾ� $ �Դϴ�.
		 * 
		 * 
		 * float a = 8.25f; float b = 4.02f; float c = 3.71f;
		 * 
		 * float d = a+b+c;
		 * 
		 * System.out.println("�� �����ݾ� $"+d+"�Դϴ�.");
		 * 
		 * || = ������ ��ȣ (Ű���忡�� + ������ ��ȣ)
		 * 
		 * [��Ŭ����]
		 * java ���� ����Ű: ctrl+f11
		 * java �ڵ� ����: ctrl + shift + f
		 * 
		 * double�� �������Ͽ� �Ҽ��� ������� ����ؾ� �� ���,
		 * ���갪�� (double) �ڷ����� �����ؾ� ��.
		 * 
		 */

		double p1, p2, p3, p4;
		p1 = 8.25;
		p2 = 4.02;
		p3 = 3.71;
		p4 = p1 + p2 + p3;
		System.out.println("�� �����ݾ� $" + p4 + "�Դϴ�.");

		int k = 3;
		int j = 9;
		double aw = (double) k / j; // ���������� �ڷ��� ���� �ִ� �ڵ�
		System.out.println(aw);
	}

}
