import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		int money =100000;
		Scanner sc = new Scanner(System.in);
		System.out.println("1번 선택 시 입금, 2번 선택 시 출금");
		int work = sc.nextInt();
		
		Scanner cal = new Scanner(System.in);
		int total;
		
		if(work==1) {
			System.out.println("입금 금액을 입력하세요");
			total = cal.nextInt();
			money+=total;
		}
		
		else if(work==2) {
			System.out.println("출금 금액을 입력하세요");
			total = cal.nextInt();
			money-=total;
		}
		else {
			System.out.println("정상적인 코드가 아닙니다.");
			sc.close();
			cal.close();
		}
		
		System.out.println("처리된 내용은 다음과 같습니다."+money+"원");
		sc.close();
		cal.close();
		

	}

}
