
public class Example5 {

	public static void main(String[] args) {
		/*
		 * 2�� �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * ��ϵ� �� �� vip ���� ����Ͻÿ�.
		 * 
		 * user_list:{"ȫ�浿","�̼���","������","������","�������","������","����屺"}
		 * user_level:{"gold","vip","guest","gold","vip","vip","guest"}
		 * ��� - �̼���, �������, ������
		 * 
		 */
		
		String list[][] ={
		  {"ȫ�浿","�̼���","������","������","�������","������","����屺"}
		 ,{"gold","vip","guest","gold","vip","vip","guest"}
		 };
		
		Example5 ex = new Example5();
		ex.vip_list(list);
		
		
	}

	public void vip_list(String ls[][]) {
		
		int lsea = ls.length; // �迭 ũ�� 2
		int lsea1 = ls[0].length; // ������ ũ�� 7 
		
		
		int w = 0;
		
		
		while(w<lsea) {
			
			int ww=0;
			
			while(ww<lsea1) {
				if(ls[w][ww].equals("vip")) {
					System.out.println(ls[0][ww]);
					
				}
				
				
				
				
			ww++;
			
		}
			w++;
		}
		
		
	}
	
}
