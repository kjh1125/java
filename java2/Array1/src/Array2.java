
public class Array2 {

	public static void main(String[] args) {
		/*
		 * ��� ��: 
		 * hong
		 * kim
		 * park
		 * lee
		 * jang
		 * jung
		 */
		
	//	String id[] = {"hong","kim","park","lee","jang","jung"};
	
		/*
		 * ���빮��
		 * �ش� ����� ����Ʈ �迭�� �ֽ��ϴ�.
		 * �ش� �迭�� �� ����� ���̵� 3�ܾ� �̻� ��½�Ű�ÿ�.
		 
		int member = id.length; // ��ü ȸ������ �ľ��ϱ� ����
		int w=0;
		int word; // ������ �迭 �������� ���� �����ľ�
		
		do {
			word = id[w].length(); //���� �����ľ�
			
			if(word>3) { //���ܾ� �̻�(������)�ϴ� �����͸� ��� 
			System.out.println(id[w]);
			}
			w++;
			
		}while(w<member);
		
		
		
		 * ���빮�� �迭�����ʹ� ������ ����.
		 * 15 60 11 14 27
		 * ���� ������ ���� ��� �� �ؼ� ���� ������� ����Ͻÿ�.
		 */

		int a[] = {15,60,11,14,27};
		int aea = a.length;
		int dw=0;
		int total=0;
		
		do{
			total+=a[dw];
			dw++;
		}while(dw<aea);
		
		System.out.println(total);
		
	}

}
