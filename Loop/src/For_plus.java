
public class For_plus {

	public static void main(String[] args) {
		/*
		 * 1~10���� ��� ���ڸ� ���� ������� ����Ͻÿ�.
		

		int f;
		int total=0;
		
		for(f=1;f<11;f++) { //total ���� ���� �ݺ� ���� ���������� ������Ŵ.
			// total = total+f; 
			total += f;
		}
		*/
		// System.out.println("���հ�:"+total);
		// +=(���ϱ��Ҵ�) -=(�����Ҵ�) *=(���ϱ��Ҵ�) /=(�������Ҵ�)
		// b = b-f; -> b -= f;
		
		/*
		 * ���빮��
		 * ��ü ���� 500�� �ֽ��ϴ�. �� 8ȸ ���� �ݺ��Ǹ鼭
		 * �� �� �ݺ��� �� ���� 12�� �����ϵ��� �Ͽ� ���� ���� ����Ͻÿ�
		 * 
		 */
		
		int a;
		int b = 12;
		int total1=500;
		
		for(a=1;a<=8;a++) {
			total1 -= b;
		}
		System.out.println("������:"+total1);
		
		/*
		 * ���빮��
		 * ������ 2�� 2*1 ~ 2*9������ �� �հ踦 ����Ͻÿ�
		 */
		
	}

}
