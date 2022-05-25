
public class While2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c;
		
		while(a<=9) {
			c = a*b; // 산술연산
			//System.out.print(c+" ");
			a++;
		}
		
		/*
		 * 응용문제
		 * 해당 결과 값을 확인하여 반복문으로 코드를 작성하시오.
		 * 56, 49, 42, 35, 28, 21,
		 */

		int d = 8;
		int e = 7;
		int f;
		
		while(d>=3) {
			f=d*e;
			System.out.print(f+",");
			d--;
			
		}
		
		/*
		 * 응용문제 2
		 * 해당 결과 값을 확인하여 반복문으로 코드를 작성하시오.
		 * 4, 7, 10, 13, 16, 19, 22,
		 */
		
		
	}

}
