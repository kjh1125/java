import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Double_loop1 {

	public static void main(String[] args) {
		
		/*
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yy��MM��dd�� / hh:mm:ss");
		SimpleDateFormat time = new SimpleDateFormat("H:m:ss");

		System.out.println(time.format(today));
		//format: �԰�ȭ�� ���·� ���� ǥ���� �� ����ϰ� �˴ϴ�.
		
		// ctrl+shift+o = ��� �� �ϴ� util �� ���� ����

		// f++ = f=f+1 1�� ���� // f=f+2 2�� ����.
		
		 * ���빮��
		 * 3���� ��ǰ
		 * "��ǰ �ݾ��� �Է½����ּ���"
		 * "���� %�� �Է��� �ּ���:"��� ������ �Բ�
		 * �ش� ���� ���ڸ� �Է��ϸ� �����ݾ��� ��µǵ��� �մϴ�.
		 * 
		 
		
		int money = 0;
		int coupon;
			
		int c = 1; // �ݺ��� ���
		
		
		Scanner sc = new Scanner(System.in);
	
		while(c<4) {
			System.out.println("��ǰ �ݾ��� �Է����ּ���");
			int b = sc.nextInt();	
			money+=b;
			c++;
		}
		System.out.println("����%�� �Է����ּ���");
		coupon = sc.nextInt();
		double a = 1-(coupon * 0.01);
		System.out.println(money*a);
		
		sc.close();
		
		*/
		
		int f,ff;
		int total;
		
		for(f=1;f<4;f++) {
			//System.out.println(f);
			for(ff=1;ff<5;ff++) {
				total = f+ff;
				System.out.println(f +"+"+ ff);
			}
		}
		
		
		
		
	}
	

}