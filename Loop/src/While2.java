
public class While2 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 4;
		int c;
		
		while(a<=9) {
			c = a*b; // �������
			//System.out.print(c+" ");
			a++;
		}
		
		/*
		 * ���빮��
		 * �ش� ��� ���� Ȯ���Ͽ� �ݺ������� �ڵ带 �ۼ��Ͻÿ�.
		 * 56, 49, 42, 35, 28, 21,
		 */

		int d = 8;
		int e = 7;
		int f;
		
		while(d>=3) {
			f=d*e;
			System.out.print(f+",");
			d--;
			
		}
		
		/*
		 * ���빮�� 2
		 * �ش� ��� ���� Ȯ���Ͽ� �ݺ������� �ڵ带 �ۼ��Ͻÿ�.
		 * 4, 7, 10, 13, 16, 19, 22,
		 */
		
		
	}

}
