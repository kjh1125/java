
public class If_dowhile1 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ������ 6�� �߿��� 35�̻� ��� ���ڸ� ����Ͻÿ�.

		int a = 1;
		int b;
		do {
			b = a*6;
			if(b>=35) {
				System.out.println(b+" ");
			}
			a++;
		}while(a<=9);
		 */
	
		/*
		 * ���빮��
		 * 14~27���� ���� �� ¦�� ���� ��� �� �Ͽ� ���� ��� ���� ����Ͻÿ�.
		 */
		
		int a= 14;
		int sum = 0;
		
		do {
			if(a%2==0) {
				sum+=a;
			}
			a++;
		}while(a<=27);
		System.out.printf("��������:%d",sum);
		
	}

}
