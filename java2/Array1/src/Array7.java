import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * �ش� ����� ���� ������ �� �� ������ �����͵� �Բ� �����˴ϴ�.
		 * �� �� ���������� ���� 3�̸��� ���� Ȯ���Ͽ� �迭 �����͸� �簡���մϴ�.
		 * 
		 *  "ȫ�浿","�̼���","������","�������","������","������"
		 *  4,3,1,1,2,2
		 * [���]
		 * ["������","�������","������","������"]
		 * 
		 */
		
		String member[]= {"ȫ�浿","�̼���","������","�������","������","������"};
		int lv[]= {4,3,1,1,2,2}; // �迭 2���� ������ ���ƾ� ��.
		int lv_ea=lv.length;
		
		String b[] = new String[6];
		int b_ea=b.length;
		
		int w = 0;
		int ct = 0;
		
		while(w<lv_ea) {
			
			if(lv[w]<3&&ct<b_ea)
			{
				
				b[ct]=member[w];
				ct++;
			}
			w++;
		}
		System.out.println(Arrays.toString(b));
		// Arrays.toString : ����, ����, �Ҽ� �� []���� �������� ���� �迭 �������� ����ϴ� �Լ��Դϴ�.

	}

}
