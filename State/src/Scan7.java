import java.util.Scanner;

public class Scan7 {

	public static void main(String[] args) {
		
		/*
		 * [인증번호 발송에 대한 번호 비교 코드]
		 * Q. 인증받은 번호를 입력하세요.
		 * 숫자 220524
		 * 
		 * 사용자가 숫자 220524 외의 숫자를 입력 시
		 * "인증번호가 틀립니다." 라고 출력
		 * 
		 * 동일한 인증번호 입력 시 "인증확인 되셨습니다." 라고 출력.
		 * 
		 * 단 220524는 java실행 시 가장 먼저 실행되는 변수로 처리하세요.
		 */
		
		int sc = 220524; // 사용자가 가지고 있다는 가정을 위해 처음에 변수로 설정.
		
		System.out.println("인증받은 번호를 입력하세요.");
		
		Scanner a = new Scanner(System.in);
		int b = a.nextInt();
		a.close();
		
		if(b==sc) {
			System.out.println("인증확인 되셨습니다.");
		}
		else {
			System.out.println("인증번호가 틀립니다.");
		}
		
	}

}
