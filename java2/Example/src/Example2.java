import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * Product:{"����","����","���","��","����","Ű��","�ٳ���","����"} �� ����, ��, Ű���� �����Ͽ����ϴ�.
		 * �ش� Ű���带 ���� �� �迭�� �ٽ� �� ����Ʈ �ϴ� �ڵ带 �ۼ��Ͻÿ�.
		 * ��, �ش� ó�������� ��� ������ �޼ҵ忡�� ó���� �Ǿ�� �ϸ�
		 * �ݺ����� Free�Դϴ�.	 
		 * 
		 * ��� - [����, ���, ����, �ٳ���, ����]
		 */
		
		String fr[] = {"����","����","���","��","����","Ű��","�ٳ���","����"};
		
		Example2 ba = new Example2();
		ba.basket(fr);

	}

	public void basket(String a[]) {
		
		int ct=0;
		String fr2[] = new String[5];
		
		for(String p : a) {
			
			if(!p.equals("����") && !p.equals("��")&&!p.equals("Ű��")) {
				fr2[ct] = p;
				ct++;
			
			}
			
		}
		
		System.out.println(Arrays.toString(fr2));
		
	}
	
}
