
public class For2 {

	public static void main(String[] args) {
		int a; //for문 초기 값
		int b=11; //연산에 사용할 변수 
		int c; //연산한 결과 값으로 사용.
		
		for(a=1;a<=9;a++) { 
			//c = b*a; //산술연산 작업
			// System.out.print(c+","); //연산된 결과 값을 출력함.
			// System.out.print(b*a+",");
		}

		/*
		 * 응용문제
		 * 다음 결과 값을 보고 코드를 작성하시오.
		 * [결과값]
		 * 45,40,35,30,25,20,
		 * 
		 * */ 
		
		for(a=9;a>=4;a--) {
			c=a*b;
			//System.out.print(c+",");
		}
		
		/*
		 * 응용문제
		 * 다음 결과 값을 보고 코드를 작성하시오.
		 * [결과값]
		 * 11,22,33,44,55,66,77,88,99
		 * 
		 * 
		for(a=1;a<=9;a++) {
			c=a*b;
			System.out.print(c+",");
		}
		*/ 
		
		for(a=1;a<=9;a++) {
			c=(10*a)+a;
			// c = 11*a;
			System.out.print(c+",");
		}
	}

}
