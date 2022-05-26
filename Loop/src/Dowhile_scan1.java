import java.util.Scanner;

public class Dowhile_scan1 {

	public static void main(String[] args) {
		/*
		 * 응용문제 (do~while)
		 * 사용자가 총 3번의 숫자를 입력합니다.
		 * 3개의 숫자를 모두 곱하여 총 합계 수를 출력하시오.
		 */
		
		Scanner sc = new Scanner(System.in);
		byte a = 1;
		int score;
		long total=1; // long을 입력 시 최종결과에서 음수(-)가 나오는 경우가 발생함. 
		
		do {
			System.out.println(a+"번째 숫자를 입력하세요");
			score=sc.nextInt();
			total*=score;
			a++;
		}while(a<=3);

		System.out.printf("%d수의 곱은: %d입니다.",a-1,total);
		sc.close();

	}

}
