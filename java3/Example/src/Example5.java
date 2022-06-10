
public class Example5 {

	public static void main(String[] args) {
		/*
		 * extends를 사용하여 다음 결과에 대한 코드를 작성하시오
		 * 숫자 두 개를 입력합니다.
		 * 두 개의 숫자를 확인하여 다음과 같이 체크합니다.
		 * 첫 번째 숫자가 두 번째 숫자보다 작을 경우 
		 * - 두 개의 값을 합친 결과값 출력
		 *  
		 * 첫 번째 숫자가 두 번째 숫자보다 클 경우
		 * - 해당 범위 만큼 숫자를 모두 더한 결과 값을 출력
		 * 
		 * 첫 번째 숫자와 두 번째 숫자가 같을 경우
		 * - "해당 값이 같습니다." 메시지 출력
		 * 
		 */
		int a = 10;
		int b = 12;
		
		ex5_2 e = new ex5_2();
		e.a1_1(a, b);
		e.a1_2();
		
		e=null;
		System.exit(0);

	}

}

class ex5_1{
	private int a_1;
	private int b_1;
	protected int c = 0;
	protected String msg;
	protected boolean a123 = false;
	
	public void a1_1(int a1, int b1) {
		this.a_1 = a1;
		this.b_1 = b1;
		
		if(a1>b1) {
			this.c = a1+b1;  
			a123 =true;
			
		}
		else if(a1<b1) {
			this.a_1=a1;
			
			
			while(this.a_1<=this.b_1) 
			{
				this.c+=this.a_1;
				a_1++;
			}
			
		}
		else {
			msg = "두 값이 같습니다.";
		}
	}
	
}

class ex5_2 extends ex5_1{
	
	public void a1_2() {
		
		if(this.c==0) {
			System.out.println(msg);
		}
		else if(a123==true){
			System.out.println("해당 값을 더한 값은 "+this.c+" 입니다.");
		}
		else{
			System.out.println("해당 값의 범위를 모두 합친값은 "+this.c+" 입니다");
		}
			
	}
	
	public int a1_3() {
		
		return this.c;
	}
	
	
}
