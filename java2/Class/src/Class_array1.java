import java.util.Arrays;
import java.util.Scanner;

import javax.swing.event.ListSelectionEvent;

public class Class_array1 {

	public static void main(String[] args) {
		// Ŭ���� + �޼ҵ� + �迭
		String user[] = {"ȫ�浿","�̼���","������"};
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸��� �Է��ϼ���");
		String name = sc.next();
		arrays.lists(user,name);
		sc.close();
		/*
		 * ���빮��
		 * ����ڰ� �ڽ��� �̸��� �Է��մϴ�.
		 * ����� �̸��� �ش� class�� ������ ��ϵ� ��������� 
		 * �̵�� ������������ Ȯ���ϴ� �ڵ带 �ۼ��Ͻÿ�
		 * ��ϵ� ������� ��� "������ �Ǿ� �ֽ��ϴ�"��� ����ϰ�
		 * �̵�ϵ� ������� ��� "�̰������Դϴ�."��� ����մϴ�.
		 */
	}
	

}

class arrays{
		
	
	public static void lists(String a[],String b) {
		//System.out.println(Arrays.toString(a));
		
		int w = 0;
		int ea = a.length;
		boolean ck =false;
		String msg = null; //�޼ҵ�� �ش� ���� ������ ���� ����ִ� ���� ��Ȯ�ϰ� �����ؾ� �Ѵ�.
		//String "" or null // int = 0���� ǥ��.
		
		while(w<ea) {
			
			if(b.equals(a[w])) {
				msg ="�������Դϴ�.";
				ck=true;
			}
			
			w++;
		}
		
		if(ck==false) {
			msg ="�̰������Դϴ�.";
		}
		
		arrays ar12 = new arrays();
		ar12.message(msg);
		
	}

	public void message(String m) {
		System.out.println(m);
	}
}