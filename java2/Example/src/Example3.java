import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * /*
		 * �迭 + �⺻(Ŭ����)�޼ҵ� ����
		 * Product:{"����","����","���","��","����","Ű��","�ٳ���","����"} 
		 * moneys:{35000,8000,4000,5500,3800,4400,11000,18900}
		 * ��ٱ��Ͽ� ����� �ٳ����� �����ϰ� �� ���� �ݾ��� ����Ͻÿ�. 
		 */
		String product[] = {"����","����","���","��","����","Ű��","�ٳ���","����"} ;
		int money[] = {35000,8000,4000,5500,3800,4400,11000,18900};
		
		Example3 ex = new Example3();
		ex.list(product, money);
		ex = null;

	}

	public void list(String p[],int m[]) {
		int pea = p.length;
		int w = 0;
		int total = 0;
		
		while(w<pea) {
			
			if(!p[w].equals("���")&&!p[w].equals("�ٳ���"))
			{
				total+=m[w];
			}
			
			w++;
		}
		System.out.println("�� �ݾ���:"+total);
	}
	
	
	
}
