
public class For2 {

	public static void main(String[] args) {
		int a; //for�� �ʱ� ��
		int b=11; //���꿡 ����� ���� 
		int c; //������ ��� ������ ���.
		
		for(a=1;a<=9;a++) { 
			//c = b*a; //������� �۾�
			// System.out.print(c+","); //����� ��� ���� �����.
			// System.out.print(b*a+",");
		}

		/*
		 * ���빮��
		 * ���� ��� ���� ���� �ڵ带 �ۼ��Ͻÿ�.
		 * [�����]
		 * 45,40,35,30,25,20,
		 * 
		 * */ 
		
		for(a=9;a>=4;a--) {
			c=a*b;
			//System.out.print(c+",");
		}
		
		/*
		 * ���빮��
		 * ���� ��� ���� ���� �ڵ带 �ۼ��Ͻÿ�.
		 * [�����]
		 * 11,22,33,44,55,66,77,88,99
		 * 
		 * 
		for(a=1;a<=9;a++) {
			c=a*b;
			System.out.print(c+",");
		}
		*/ 
		
		for(a=1;a<=9;a++) {
			c=(10*a)+a;
			// c = 11*a;
			System.out.print(c+",");
		}
	}

}
