
public class Do2 {

	public static void main(String[] args) {
		int a = 1; //�ʱⰪ
		int b = 9; //��� ������
		int c;
		
		do {
			c=a*b;
			//System.out.print(c+" ");
			a++;
		}while(a<=9);

		/*
		 * ���빮��
		 * ���� ������� ���� do~while������ �ڵ带 �ۼ��Ͻÿ�.
		 * 35 45 55 65 75
		 * 
		 * 
		 */
		/*
		int aa = 1;
		int bb = 10; //��� ������
		int cc;
		
		do {
			cc =25+(aa*bb);
			System.out.print(cc+" ");
			aa++;
			
		}while(aa<=5);
		*/
		
		int a1 = 3;
		int b1;
		do {
			b1 = a1 * 10 + 5;
			System.out.println(b1);
			a1++;
		}while(a1<=7);
		
	}

}
