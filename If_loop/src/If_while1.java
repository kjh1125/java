
public class If_while1 {

	public static void main(String[] args) {
		
	/*
	 * 응용문제 while문으로 10~30 숫자 중에서
	 * 홀수만 출력하시오
	 * 홀수 값 중 20이상의 홀수 값만 출력합니다.
		
		int a = 10;
		
		while(a<=30) {
			if(a%2==1&&a>=20) {
				System.out.print(a+" ");
			}
			a++;
	 }
		
		int w = 10;
		while(w<31) {
			
			if(w%2==1) {
				if(w>=20) {
				System.out.print(w + " ");
				}
				}
			w++;
		}
	 */

		//카운터 값으로 갯수 파악하기
		
		/*
		 * 1~10까지 숫자 중에 짝 수값이 몇 개인지 갯수를 출력하세요.
		 */
		
		int a=1; // 반복
		int count = 0; //카운터 변수 값
		
		while(a<=10) { 
			if(a%2==0) //짝수일 경우
			{
				count++; // 해당 조건이 맞을 경우 +1씩 증가함.
			}
			
			a++;
		}
		//반복문 종료 시 최종 카운터 값을 출력하게 됨.
		System.out.printf("1부터 10까지 짝수의 개수는: %d",count);

	}

}
