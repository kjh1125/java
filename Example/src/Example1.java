import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * while문으로 코드를 작성하여야 하며, 프로세스는 다음과 같습니다.
		 * 사용자가 상품을 전체 선택하였습니다.
		 * 질문은 
		 * "7000 결제하시겠습니까?" 라고 출력되며, 숫자 1이라고 입력하면 최종결제 금액에 추가되어집니다.
		 * 단 2라고 입력 시 최종결제 금액에 추가되면 안 됩니다. 

		 *총 질문 횟수는 4번입니다.
		 *마지막에 최종 결제 금액이 나오도록 코드를 작성하시오.
		 */
		
		int a=1;
		int sum = 0; //총 금액
		Scanner sc = new Scanner(System.in);
		int se; // 입력변수
		int count=0; 
		
		while(a<=4) {
			System.out.println("7000원을 결제하려면 1번을 눌러주세요");
			se = sc.nextInt();
			if(se==1) {
				sum+=7000;
				count++;
			}
			a++;
		}
		System.out.printf("총 %d건 중 %d건의 결제 금액은 %d원입니다",a-1,count,sum);
		sc.close();
		
	}

}
