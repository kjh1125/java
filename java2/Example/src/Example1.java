public class Example1 {

	public static void main(String[] args) {
		/*
		 * �迭+�޼ҵ� ����.
		 * 1�� �迭�� ������ ���� ���� �ֽ��ϴ�.
		 * �迭 ����Ʈ {22,33,44,55,66,77,88,99} �̸�
		 * �ش� ��ü ���� ��� ���� �� �հ� ���� ������ �޼ҵ��
		 * ó���ǵ��� �մϴ�.
		 * ��, �ݺ����� ������ do~while������ �ۼ��Ͻÿ�.
		 */
		
		int a[] = {22,33,44,55,66,77,88,99};
		// void = ��ü���� + �ν��Ͻ�(�޸�) ���
		
	    Example1 da = new Example1();
	    da.datas(a);
	    da = null;
		
		
		
	}
	public void datas(int a1[]) {
		int ea = a1.length; // �迭 ���� �ľ�.
		int w = 0 ;
		int total = 0;
		
		do {
			total+=a1[w];
			
			w++;
		}while(w<ea);
		
		System.out.println("����:"+total);
		
	}
}
	


	


