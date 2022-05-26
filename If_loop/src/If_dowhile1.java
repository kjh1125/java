
public class If_dowhile1 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 구구단 6단 중에서 35이상 결과 숫자만 출력하시오.

		int a = 1;
		int b;
		do {
			b = a*6;
			if(b>=35) {
				System.out.println(b+" ");
			}
			a++;
		}while(a<=9);
		 */
	
		/*
		 * 응용문제
		 * 14~27까지 숫자 중 짝수 값만 모두 더 하여 최종 결과 값을 출력하시오.
		 */
		
		int a= 14;
		int sum = 0;
		
		do {
			if(a%2==0) {
				sum+=a;
			}
			a++;
		}while(a<=27);
		System.out.printf("최종값은:%d",sum);
		
	}

}
