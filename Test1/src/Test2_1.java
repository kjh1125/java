import java.util.Scanner;

public class Test2_1 {

	public static void main(String[] args) {
		/*
		 * [TEST2] [����1] �� 8���� ����ڰ� ���ڸ� �Է� �մϴ�. �ش� ���ڸ� �Է��ϴ� Scanner�� userinput�̶�� �޼ҵ� ����
		 * ó���� �ؾ� �ϸ� �ش� ��� ���� ���� ���� ����� result���� ���� ��� �ǵ��� �ϴ� ���α׷��� �����Ͻÿ�. ��Ʈ (�ܺ�Ŭ��������
		 * �޼ҵ�2�� ����)
		 * 
		 */
		
		test t = new test();
		t.userinput();
		
		
		
	}

}


class test{
	
	int a;
	int total=0;
	
	public void userinput() {
		Scanner sc = new Scanner(System.in);
		
		int w =1 ;
		
		while(w<9) {
			
			System.out.println(w+"��° ���ڸ� �Է��ϼ���");
			this.a = sc.nextInt();
			this.total += this.a;
			
			w++;
		}
		sc.close();
		result();
		
	}
	
	public void result() {
		
		System.out.println(this.total);
		
	}
	
	
}