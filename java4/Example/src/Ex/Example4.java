package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * ���빮��: ����ڰ� ���� ���ڸ� �Է¹޽��ϴ�. //Scanner
		 * ��, ����ڰ� ���ڸ� �Է��� ��� ����ó���� ����Ǿ�� �մϴ�.
		 * �� ���� �Է��� 7���̸�, ����ڰ� �Է��� ���ڸ� ������������ �����մϴ�.
		 * 
		 * "���ڸ� �ϳ� �Է����ֽñ� �ٶ��ϴ�" // 7��
		 * 
		 * [���� ���ں��� �������ڷ�]
		 * 
		 * �߰��ɼ� - ¦���� Ȧ������ ������ �迭����
		 * 
		 */
		
		
		b b = new b();
		
		
	}

}

class b{
	LinkedList<Integer> data = new LinkedList<>();
	LinkedList<Integer> data1 = new LinkedList<>();

	public b() {
	Scanner sc = new Scanner(System.in);
	int w = 0;
	do {
		System.out.println("���ڸ� �ϳ� �Է����ֽñ� �ٶ��ϴ�.");1
		try {
			Integer ck = Integer.valueOf(sc.next());
			if(ck%2==0) {
				data.add(ck);
			}
			else {
				data1.add(ck);
			}
		}catch (Exception e123) {
			System.out.println("���ڸ� �Է��ϼž� �մϴ�");
		}
		
		w++;
	}while(w<7);
	Collections.sort(data);
	Collections.sort(data1);
	System.out.println(data);
	System.out.println(data1);
	
}
}
	


	
