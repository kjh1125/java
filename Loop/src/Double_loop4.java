
public class Double_loop4 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ///���չݺ��� for, do~while
		 * 2*1~3*9
		 */
		/*
		int f;
		
		for(f=2;f<4;f++)
		{
				int dw=1;
				
				do{
				//	System.out.println(f+"*"+dw+"="+(f*dw));
					dw++;
				}while(dw<10);
				
		}

		
		
		 * ���빮�� 7~9�ܱ���
		 * ��, �� ������ ���� ���� 5������ �������� 
		 * ū(do~while) ����(while)
		
		
		int dw1 = 7;
	
		do {
			int w = 1;
			while(w<=5) {
				
				//System.out.println(dw1+"*"+w+"="+(dw1*w));
				w++;
			}
			dw1++;
		}while(dw1<10);
		
		
		 * ���빮��
		 * for��(ū �ݺ���), while��(���� �ݺ���)
		 * 1*1=1
		 * 2*2=2
		 * ..
		 * 9*9=81
		 
		
		int f;
		int total;
		
		for(f=1;f<10;f++) {
			
			int w=f;
			while(w<=f) {
				
					total=f*w;
					System.out.println(f+"*"+w+"="+total);
				
				w++;
			}
			
		}
		/*
		 * ���빮��
		 * ���� �ݺ��� Ȱ��(ū while ���� do~while) // ó�� ���ڰ� �ݺ��Ǵ� Ƚ���� ����.
		 * 1+1=2
		 * 2+1=3
		 * 2+2=4
		 * 
		 * 3+1+4
		 * 3+2=5
		 * 3+3=6
		 * 
		 * 4+1=5
		 * 4+2+6
		 * 4+3=7
		 * 4+4=8
		 */
		
		int w = 1;
		int sum;
		
		while(w<=4) {
			
			int ww = 1;
			
			while(ww<=w) {
				sum = w+ww;
				System.out.println(w+"+"+ww+"="+sum);
				ww++;
			}
			w++; 
		}
		
		
	}

}
