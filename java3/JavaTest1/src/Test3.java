import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��Ͻÿ�");
		int sc1 = sc.nextInt();
		String msg;
		
		if(sc1>60) {
			msg = "�ش� ���ڴ� 60������ �Է��� �Ǿ�� �մϴ�";
		}
		else {
			if(sc1%2==0) {
				msg = "¦���Դϴ�";
			}
			else {
				msg = "Ȧ���Դϴ�";
			}
			
		}

		System.out.println(msg);
		sc.close();
		
	}

}
