import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * A��Ʈ: PC���� ���� ����, ��ĳ�� �̿� 5����
		 * B��Ʈ: PC���� ���� ���ڿ� ����ڰ� ���� ���ڸ� �� �� ��� ó��.
		 * 
		 * up&down ����
		 * 1.PC�� ���ڸ� �ϳ� ���� (random �Լ�) // 1~10
		 * 2. �� ��ȸ�� �� 5�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 * 3. ���࿡ PC�� ���� 7�� ������ ���ؿ��� ����� ���ڿ� ���� ���
		 * PC:7 �����: 2 => ��� : UP
		 * 4.  �� ��ȸ�� �� 4�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 * 5. PC:7 �����: 4 => ��� : UP
		 * 6.  �� ��ȸ�� �� 4�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է�
		 * PC:7 �����: 7 => ��� : �����Դϴ�. ��� ���μ����� ���� system.exit(0);
		 */
		
		
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		Example2 ex = new Example2();
		int r1 = r.nextInt(10)+1;
		int f;
		String msg; 
		
		for(f=5;f>0;f--) {
			msg = "�� ��ȸ�� "+f+"�� ���ҽ��ϴ�. 1~10���� ��ȣ �� �ϳ��� ��ȣ�� �Է��ϼ���";
			
			if(ex.b==false&&f>0) {
			System.out.println(msg);
			int sc1 = sc.nextInt();
			ex.ex2(sc1,r1);
			}
			
			else{
				System.exit(0);
			}
			
			
		}
		if(ex.b==false&&f==0){
			msg = "����";
			System.out.println(msg);
		}
		r = null;
		sc.close();
		System.gc();
		
	}

}
