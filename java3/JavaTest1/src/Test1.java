import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("on,off �� �ϳ��� �Է��Ͻÿ�");
		String sc1 = sc.next();
		String msg;
		
		if (sc1.equals("on")) {
			msg = "true";
		} 
		else {
			msg = "false";
		}

		System.out.println("���: " + msg);

		sc.close();

	}

}
