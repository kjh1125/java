
public class Method3 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 인수값 2개의 숫자를 적용하여 계산되도록 합니다.
		 * 최종 계산값을 받아서 결과를 출력하시오.
		 * 157,45
		 * 157*45
		 * 최종 결과값 출력:
		 */
		
		cal ca = new cal();
		int total = ca.num(157, 45);
		//System.out.printf("최종결과값 출력: %d\n",total);
		ca.num2();
		ca.num();
		/*
		 * 응용문제 다음 숫자 하나를 해당 메소드로 전달하게 됩니다.
		 * 해당 메소드에서는 다음과 같이 처리합니다.
		 * 숫자 3을 전달하면 3*1~3*9까지의 모든 결과값을 더하여 
		 * sysout으로 출력되도록 하십시오.
		 */
		int total2 = ca.num2(3);
		System.out.println(total2);
		
		String ck = ca.mb("hong1");
		System.out.println(ck);
	}

}
class cal{
	
	public int num(int a,int b)
	{
		int total1 = a*b;
		return total1;
		
	}
	public void num() {
	//	System.out.println("test");
	}
	
	public void num2() {
		int z = num(100,200);
		//System.out.println(z);
	}
	//반복문 안에 return 함수 사용 불가.
	public int num2(int a) {
		int f;
		int sum= 0;
		
		for(f=1;f<10;f++) {
			sum += a*f;
		}
		return sum;
		// 조건문이라고 해도 중복으로 return 사용 불가.
	}
	public String mb(String mid) {
		String msg;
		String msg2 = "홍길동";
		if(mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		}
		return msg+msg2; 
		//해당 메소드에 변수를 생성 후 조건에 맞는 값을 적용하여 최종적인 값을 return 시킴.
	}
	
}
