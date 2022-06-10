import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int sc1 = sc.nextInt();
		String msg;
		
		if(sc1>60) {
			msg = "해당 숫자는 60까지만 입력이 되어야 합니다";
		}
		else {
			if(sc1%2==0) {
				msg = "짝수입니다";
			}
			else {
				msg = "홀수입니다";
			}
			
		}

		System.out.println(msg);
		sc.close();
		
	}

}
