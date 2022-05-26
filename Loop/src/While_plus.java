
public class While_plus {

	public static void main(String[] args) {
		/*
		 * 5~10까지 더한 합계를 출력
		 

		int a =5; //초기 값
		int total = 0; // 합계치를 누적시키기 위한 변수 값
		
		while(a<=10) {
			total+=a;
			a++;
		}
		System.out.println("합계:"+total);
		*/
		/*
		 * 3~8까지 곱한 총 합계 수를 출력하시오
		 */
		
		int a1= 3;
		int total1 = 1; // 곱하기 합계를 설정 시 1을 기본값으로 설정하여야 함. // 추가할당 
		
		while(a1<=8) {
			total1*=a1;
			a1++;
		}
		System.out.println(total1);
		
	}

}
