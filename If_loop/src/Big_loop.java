import java.math.BigInteger;

public class Big_loop {

	public static void main(String[] args) {
/*
		int a;
		long total =0;
		
		for(a=1;a<=100;a++) {
			total += a;
		}
		
		System.out.println(total);
	*/
		
		/*
		 * 1~100까지 곱한 결과값
		 */
		
		int f;
		//Biginteger : java에서 모든 무한의 값을 저장할 수 있는 유일한 자료형.
		BigInteger aa = new BigInteger("1"); 
		//합계에 사용 할 자료형 변수 1을 최초 값으로 설정 단, ""을 무조건 적용해야 함.
		
		for(f=1;f<=10;f++) {
			/*multiply: 사칙연산 중 곱하기를 담당함.
			 *add: 사칙연산 중 더하기 담당.
			 *subtract: 사칙연산 중 빼기 담당.
			 *divide: 사칙연산 중 나누기를 담당.
			*/
		aa = aa.multiply(BigInteger.valueOf(f));
		}
		System.out.println(aa);
	}

}
