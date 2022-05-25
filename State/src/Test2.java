import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * [응용문제] // 조건문 코드

고객이 자신의 통장에서 입,출금을 하는 프로세서 제작을 해야 함.
고객의 기본 자산금액: 100,000원

"1번 입력 시 입금, 2번 입력 시 출금입니다." 라는 메시지 제일 먼저 실행되어야 함.

1번을 입력 시 "해당 금액을 입력하세요"
사용자가 입력한 금액 + 기본 자산금액을 합한 총 자산금액을 출력하면 됨.

2번을 입력 시 "출금할 금액을 입력하세요"
사용자가 입력한 금액 - 기본 자산금액을 계산하여 총 자산금액을 출력하면 됨.
		 */

		int a = 100000;
		System.out.println("1번 입력 시 입금, 2번 입력 시 출금입니다.");
		Scanner b = new Scanner(System.in);
		int c = b.nextInt();
		int e;
		
		if (c==1) {	
			System.out.println("해당 금액을 입력하세요");
			e = b.nextInt();
			System.out.printf("총 금액은 %d입니다",a+e);
		}
		else if(c==2) {
			System.out.println("출금할 금액을 입력하세요");
			e = b.nextInt();
			System.out.printf("총 금액은 %d입니다",a-e);
		}
		b.close();
		
	}

}
