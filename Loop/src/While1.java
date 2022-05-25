
public class While1 {

	public static void main(String[] args) {
		int a = 1; // while 시작 값
		while(a < 11) { // while 범위 값, 종료 값
			
			//System.out.print(a+",");
			
			a++; // 증가 or 감소
		}
		int b = 10;
		
		while(b>=5) {
			//System.out.print(b+",");
			b--;
		}
		
		/*
		 * [응용문제]
		 * 다음 사항을 while문으로 작성하시오.
		 * 22~16까지 숫자를 출력하시오
		 */

		int c = 22;
		
		while(c>=16) {
		//	System.out.print(c+",");
			c--;
		}
		
		int aa = 1; // 초기 값
		int bb = 10; // 종료 값
		
		while(aa<=bb) { // 반복문 범위
			//System.out.printf("%d ",aa);
			aa++; //증가문
		}
		
		/*
		 * [응용문제]
		 * 변수 두 개를 이용하여 범위에 맞게 값을 출력하시오.
		 * 99~47까지 출력
		 */
		
		int cc =99;
		int dd =47;
		
		while(cc>=dd) {
			System.out.printf("%d ",cc);
			cc--;
		}
		
		
		
	}

}
