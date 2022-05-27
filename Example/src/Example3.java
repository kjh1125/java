import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * 응용문제 3번
		 * 사용자가 해당 값을 입력합니다.
		 * 단, 사용자가 2개의 숫자를 입력하되 첫 번째 숫자와 두 번째 숫자 범위 안에 있는 
		 * 모든 숫자를 더 해서 결과값이 나오도록 하시오. 
		 * 단, 해당 코드는 do~while문으로 작성할 것.
		 * ex)
		 * 첫 번째 범위 숫자는? 5
		 * 두 번째 범위 숫자는? 10
		 * 범위 숫자 모든 합계는 : 45입니다.
		 * */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 범위 숫자는?");
		int a = sc.nextInt();
		
		System.out.println("두 번째 범위 숫자는?");
		int a1 = sc.nextInt();
		
		int sum = 0;
		
		if(a<=a1) {
		do {
			sum+=a;
			a++;
		}while(a<=a1);
		}
		
		else {
			do {
				sum+=a;
				a--;
			}while(a>=a1);
		}
		
		System.out.printf("범위 숫자 모든 합계는 %d입니다.",sum);
		
		sc.close();
		
	}

}
