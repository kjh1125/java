import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*
		 * ��� �� ����ϱ�
		 * ���� ��ٱ��Ͽ� ���� ���� ��ǰ�� ����� �ֽ��ϴ�.
		 * �� �� �ù�� ������ �����Ǵ� �ݾ׸� �����Ͻÿ�.
		 * �ù��� 30000�� �̻��̸� ���Ե� �̴ϴ�.
		 * 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700 
		 * 
		 * [��� ��]
		 * [48000, 67000, 118200, 49800]
		 * 
		 */
		int a[] = {15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700};
		int b[] = new int[5];
		int a_ea = a.length;
		int b_ea = b.length;
		
		int dw=0;
		int ct=0;
		do {
			if(a[dw]>=30000&&ct<b_ea) {
			    b[ct] = a[dw];
				ct++;
			}
			
			dw++;
		}while(dw<a_ea);

		System.out.println(Arrays.toString(b));
		
	}

}
