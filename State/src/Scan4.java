import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
	   
		Scanner a = new Scanner(System.in);
		System.out.println("�Է��� ������ �����ּ���!");
		//String memo = a.next(); //next(): �����̽��� �Է� �������� �����. 
		String memo = a.nextLine(); //nextLine(): �����̽��� ���� ��� �Է� ����
		System.out.println(memo);

		a.close(); // scanner�� ����. // close���� ������ memory ��� �Ҹ�Ǳ� ������ Scanner ��� �� �׻� close ������ִ°� ����.
		
		String mid = "park"; //String = %s
		byte age = 25; //int�� byte�� ���ڴ� %d
		/* 
		
		[�߿����] 
		%s: String(���ڿ�) + ����
		%d: int,byte,long �� ����
		%f: float, double. �Ǽ�
		%t: date, time �ð�
		%b: boolean(true,false)(��,����)
		
		*/
		// System.out.println(mid+"���� ���̴�"+age+"�Դϴ�.");
		
		System.out.printf("%s���� ���̴� %d �Դϴ�",mid,age); //���ڿ� format ��� printf: format�� ����. 
	}

}
