import java.text.SimpleDateFormat;
import java.util.Date;

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
		 */
		
		int money = 10000;
		int coupon = 20;
		double a = money*(1-(coupon * 0.01));	
		System.out.println(a);	
		
		
		
	}
	

}
