
public class If_for2 {

	public static void main(String[] args) {
		// 1~100까지의 숫자 중 80이상의 숫자만 출력
		/*
		int f;
		for(f=1;f<=100;f++) {
			if(f>=80)
			{
				System.out.print(f+" ");
			}
		}*/
		
		//200~300까지의 숫자 중 240이하의 숫자만 출력하시오.
		/*
		int a;
		for(a=200;a<=300;a++) {
			if(a<=240) {
				//System.out.print(a+" ");
			}
		}
		
		final int b = 4;
		int w;
		
		for(w=1;w<11;w++) {
			if(w%b==0) {
			// System.out.printf("%d ",w);
			}
		}
		
		//응용문제 구구단 중 2단을 반복합니다. 단, 2단 결과값 중 10이상 숫자만 출력합니다.
		/*
		int c; //반복문
		final int d=2; //상수 값 
		int e; //결과 값
		
		for(c=1;c<10;c++) {
			e=c*d;
			if(e>=10) {
			System.out.printf("%d ",e);
			}
		}
		
		
		 * 응용문제
		 * 다음 결과값을 보고 해당 값이 출력되도록 코드를 제작하시오.
		 * 18 36 54 72
		 */
		/*
		int a;
		final int b = 18;
		
		for(a=1;a<=100;a++) {
			
			if(a%b==0&&a<=72) {
			System.out.printf("%d ",a);
			}
			
		}
		
*/
		int p;
		int total3;
		
		for(p=1;p<=9;p++){
			total3 = 9 * p;
			
			if(p%2 == 0) {
				System.out.print(total3 + " ");
			}
		}
		
		
/*
		int a;
		
		for(a=1;a<=20;a++) {
			if(a==6||a==14||a==17||a==19) 
			{
				System.out.print(a+" ");
			}
		}
		
		 */
		
		
	}

}
