
public class Example4 {

	public static void main(String[] args) {
		/*
		 * 응용문제 4
		 * 
		 * 다음 결과값에 맞춰서 코드가 출력되도록 하시오.
		 * 해당 코드는 for문으로 작성하시오.
		 * 
		 * 45 35 25 15 10
		 * 
		
		int a;
		int b = 5;
		int c;
		
		for(a=9;a>=1;a--) {
			c=a*5;
			if(a%2==1&&c>=15||c==10) {
				System.out.print(c+" ");
			}
			
		}
		
		 */
		int f;
		int v;
		
		for(f=9;f>0;f--) {
			v = 5 * f;
			if(f%2==1 || f==2) {
				if(f!=1) {
					System.out.println(v);
				}
			
		    }
		}
		
		
		

	}

}
