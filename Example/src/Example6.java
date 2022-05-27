
public class Example6 {

	public static void main(String[] args) {
		
		/*
		 * 응용문제 6번
		 * 1~10까지 순차적으로 적용하는 반복문이 있습니다.
		 * 단, 1~5까지는 모든 값을 곱하고 6~10까지는 모든 값을 더합니다. 
		 * 해당 두 개의 값을 비교하여 더한 값이 큰 지, 곱한 값이 큰 지를 결과로 출력하시오
		 */
		
		int a = 1;
		int b = 1;
		int c = 0;
		
		
		while(a<=10) {
			
			if(a<=5)
			{
				b*=a;
			}
			else {
				c+=a;
			}
			a++;
		}
		System.out.println("1~5까지 곱한 값: "+b+", 6~10까지 더한 값: "+c);
		if(b>c) {
			System.out.println("곱한 값이 큽니다.");
		}
		else if(c>b){
			System.out.println("더한 값이 큽니다.");
		}
		else {
			System.out.println("두 비교 값이 같습니다.");
		}
		
		
	}
	
}
