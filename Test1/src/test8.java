import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		/*
		 * [���빮��8] {"���=2000","����=1500","Ű��=2500"} [��¼���]
		 * "�ش� ��ǰ�� ������ �ּ���? [1.���, 2.����, 3.Ű��]" 2 "�ش� ��ǰ ������ �Է��� �ּ���? " 5
		 * "������ �Ͻ� �� ������ 7500�� �Դϴ�." abstract �� ������ ����մϴ�.
		 */

		b a = new b();
		a.a1();
	}
}

abstract class a {
	String data[] = { "���=2000", "����=1500", "Ű��=2500" };

	abstract public void a1();
}

class b extends a {

	String a1[] = new String[2];
	
	@Override
	public void a1() {
	
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("�ش� ��ǰ�� ������ �ּ���? [1.���, 2.����, 3.Ű��]"); 
		 int a =sc.nextInt(); 
		 System.out.println("�ش� ��ǰ ������ �Է��� �ּ���? "); 
		 int b =sc.nextInt();
		
		
		for(int f=0; f<data.length;f++) {
			if(f==a-1) {
				this.a1= data[f].split("=");
			}
	
		}
		int c = Integer.parseInt(this.a1[1]);
		System.out.println("�����Ͻ� ��ǰ�� �� ������ "+b*c+"�� �Դϴ�.");
		sc.close();
		
	}

}
