import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * 2���� ������ �迭�� �ֽ��ϴ�.
		 * �ش� ������ �迭�� ���� ���ó�� ���� ����Ͻÿ�.
		 * 
		 * 1�� ������ : {"���ѹα�","�Ϻ�","�߱�","��Ʈ��","�±�"}
		 * 2�� ������ : {"40","35","70","55","32"}
		 * [���]
		 * ["���ѹα�(40)","�Ϻ�(35)","�߱�(70)","��Ʈ��(55)","�±�(32)"]
		 * ����
		 * String d1 = "���ѹα�";
		   int d2 = 40;
		   String d3 = d1+"("+d2+")";
		 *
	
		
		String data[][]={
			{"���ѹα�","�Ϻ�","�߱�","��Ʈ��","�±�"},
			{"40","35","70","55","32"}
		};
		
		int d1 = data.length;//�迭 ���� 
		int d2 = data[0].length; //�迭 ������ ���� 
		
		String data1[] = new String[d2];
		
			int ww= 0;
				
			while(ww<d2) {
				
				data1[ww] = data[0][ww]+"("+data[1][ww]+")";
				
				ww++;
			}
			
		System.out.println(Arrays.toString(data1));
		
			 */
		/*
		 * ���빮��
		 * �ش� �� ���� �迭 �����Ͱ� �ֽ��ϴ�.
		 * �� �迭 ���� �ε����� ���� ��ȣ�� ���ؼ� ¦���� Ȧ�� �� �� ������ ����� �����ͷ� �缳�� �Ͻʽÿ�. 
		 * 
		 * Adata = 5,17,19,22,33
		 * Bdata = 1,2,3,4,5
		 * Result = [¦��,Ȧ��,¦��,¦��,¦��]
		 * 
		 */
		
		int data[][]= {
				{5,17,19,22,33},
				{1,2,3,4,5}	
		};
		
		int d1 = data[0].length; // �迭 ������ ����
		int d = data.length; // �迭 ����
		String msg;
		int data1[] = new int[d1];
		String result[] = new String[d1];
		
		int w = 0;
		
		while(w<d1) {
			
			data1[w] = data[0][w]+data[1][w];
			
			if(data1[w]%2==0) {
				msg="¦��";
			}
			else {
				msg="Ȧ��";
			}
			result[w]=msg;
			
			w++;
		}
		
		System.out.println(Arrays.toString(result));

	}

}
