package java_1;

import java.util.Scanner;

public class test2 implements test2_interface {

	public static void main(String[] args) {
		
		test2_1 t = new test2_1();
		
	}

}

class test2_1 extends test2{

	int money =0;
	
	public test2_1() {
		Scanner sc = new Scanner(System.in);
		
		int w = 0;
	
		while(w<user.length) {
			System.out.println(user[w]+"�Կ��� ��ü�Ͻ� �ݾ��� �Է����ּ���");
			int a = sc.nextInt();
			money += a;
			
			w++;
		}
		
		int b= total -money;
		System.out.println("�� ��ü�� �ݾ���"+money+"���̸�, �� �ܰ�ݾ���"+b+"�Դϴ�");
		sc.close();
		
	}
	
}
