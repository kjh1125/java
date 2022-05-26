import java.util.Scanner;

public class While_scan1 {

	public static void main(String[] args) {
		
		/*
		 * 응용문제 총 2번의 질문을 하게 됩니다.
		 * 사용자가 숫자를 입력하여 두 수의 합을 구하는 scanner를 제작하시오. 
		 */
		
		Scanner sc = new Scanner(System.in);
		int a = 1;
		int score;
		int total=0;
		
		while(a<=2) {
			System.out.println(a+"번째 숫자를 입력하세요");
			score = sc.nextInt();
			total += score;
			a++;
		}
		System.out.printf(a-1+"수의 합:%d",total);
		sc.close();

	}

}
