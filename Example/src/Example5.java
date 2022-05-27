
public class Example5 {

	public static void main(String[] args) {
		
		/*
		 * 응용문제 5 다음 코드를 보고 while문으로 변환하시오.
		 * 
		 */
		
		int i = 1;
		int sum=0;
		
		while(i<=12) {
			
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		
		System.out.println("1~12까지의 짝수 합:"+sum);
		
		
	}

}
