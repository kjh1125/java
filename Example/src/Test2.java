import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int money =100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1�� ���� �� �Ա�, 2�� ���� �� ���");
		int work = sc.nextInt();
		
		Scanner cal = new Scanner(System.in);
		int total;
		
		if(work==1) {
			System.out.println("�Ա� �ݾ��� �Է��ϼ���");
			total = cal.nextInt();
			money+=total;
		}
		
		else if(work==2) {
			System.out.println("��� �ݾ��� �Է��ϼ���");
			total = cal.nextInt();
			money-=total;
		}
		else {
			System.out.println("�������� �ڵ尡 �ƴմϴ�.");
			sc.close();
			cal.close();
		}
		
		System.out.println("ó���� ������ ������ �����ϴ�."+money+"��");
		sc.close();
		cal.close();
		

	}

}
