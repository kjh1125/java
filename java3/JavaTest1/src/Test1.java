import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("on,off 중 하나를 입력하시오");
		String sc1 = sc.next();
		String msg;
		
		if (sc1.equals("on")) {
			msg = "true";
		} 
		else {
			msg = "false";
		}

		System.out.println("결과: " + msg);

		sc.close();

	}

}
