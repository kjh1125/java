import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ���ڸ� �Է��Ͻÿ�");
		int sc1 = sc.nextInt();
		int total;
		int ww=1;
		
		do {
			if(sc1<0) {
				System.out.println("���� ���� �������� �̿��� �� �����ϴ�");
				System.exit(0);
			}
			
			total = sc1*ww;
			System.out.printf("%d*%d=%d\n",sc1,ww,total);
			
			ww++;
		}while(ww<10);
		
		System.gc();
		sc.close();
		
	}

}
