import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * 응용문제 8번
		 * 사용자 패스워드는 a1234
		 * 패스워드 입력. 3회 이상 실패 시 다음과 같이 출력 되도록 함.
		 * "패스워드 횟수 제한으로 가까운 지점에 방문하셔야 함."
		 * 단, 패스워드 맞을 경우 "로그인 되었습니다."라고 출력
		 * 
		
		
		final String pw = "a1234";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요");
		String pw1=sc.next();
		int a = 1; //반복문
		Boolean ok = false;
		
		while(a<=3) {
			if(pw1.equals(pw)) {
				System.out.println("로그인 되었습니다.");
				ok = true;
				break;
			}
			else if(!pw1.equals(pw)&&a<=2){ 
				System.out.println("비밀번호가 틀렸습니다, 다시 입력해주세요.");
				pw1=sc.next();
			}
			a++;
			}
		if(ok==false) {
			System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 함.");
			
		}
		 */
		final String pw = "a1234";
		int c = 3;
		Scanner sc = new Scanner(System.in);
		int w = 0;
		String msg = "패스워드 입력";
		
		while(w<3) {
			System.out.println(msg);
			String user_pw = sc.next();
			
			if(pw.equals(user_pw)) {
			System.out.println("로그인 되었습니다.");
			break;
			}
			else {
				msg = "올바른 패스워드를 넣어주세요";
				c--;
				if(c==0) {
					System.out.println("패스워드 횟수 제한으로 가까운 지점에 방문하셔야 합니다");
				}
			}
			w++;
		}
sc.close();
	
	
	}

}
