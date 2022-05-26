import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * 사용자가 입력한 수에 맞추어 구구단이 작동되며, 총합을 계산하여 짝수인지 홀 수인지를 출력하시오
		 * "구구단 숫자를 입력하세요" 메시지 출력
		 * 해당 숫자에 맞추어 모든 결과를 더한 후 짝 수 인지 홀 수 인지를 출력.
		 */
		
		int a=1; //반복문
		int sum=0;//총합
		int e; // 입력 받을 값 변수
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 숫자를 입력하세요.");
		e=sc.nextInt();
		
		while(a<=9) {
			sum+=e*a;
			a++;
		}
		
		if(sum%2==0) {
			System.out.printf("총합은 %d이고 짝수입니다.",sum);
		}
		
		else{
			System.out.printf("총합은 %d이고 홀수입니다.",sum);
		}
		sc.close();

	}

}
