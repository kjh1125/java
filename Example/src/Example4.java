
public class Example4 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 4
		 * 
		 * ���� ������� ���缭 �ڵ尡 ��µǵ��� �Ͻÿ�.
		 * �ش� �ڵ�� for������ �ۼ��Ͻÿ�.
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
