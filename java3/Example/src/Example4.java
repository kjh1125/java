
public class Example4 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 두 개의 값을 외부 클래스로 보냅니다.
		 * 해당 클래스에서 두 개의 값을 계산하게 됩니다.
		 * 계산 형식은 다음과 같음.
		 * 3,10을 보내게 되면 두 개의 값을 합함.
		 * 나머지 외부 클래스에서 해당 결과 값을 출력하는데,
		 * 두 개의 합 값이 짝수인지 홀수 인지를 출력하는 extends를 구현하시오. 
		 */

		ex4_2 ex = new ex4_2();
		ex.cal(3,10);
		ex.odd();
		String result =ex.c2();
		System.out.println(result);
		
	}

}

class ex4_1{
	
	
	protected int c1;
	
	
	public void cal(int a,int b) {
		
		this.c1 = a+b;
		
	}
	
	
}

class ex4_2 extends ex4_1{
	private String msg;
	
	public void odd() {
		if(c1%2==0)
		{
			this.msg="짝수";
		}
		else {
			this.msg="홀수";
		}
		
	}
	public String c2() {
		return this.msg;
	}
	
	
}