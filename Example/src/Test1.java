import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1��° ���ڰ��� �Է��ϼ���");
		int a = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("2��° ���ڰ��� �Է��ϼ���");
		int b = sc1.nextInt();
		
		int c = a*b;
		
		if(c<=100) {
			System.out.println("100������ ������Դϴ�");
		}
		else {
			System.out.println("100�ʰ� ������Դϴ�.");
		}
		sc.close();
		sc1.close();
		
	}

}
