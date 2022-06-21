import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {
	      /*[���빮��]
	       * data a = { "hong45", "lee90", "kang100", "park70", "kim72" };
	       * �ش� �迭 ������ ���� main2��� �޼ҵ�� ���� �����ϴ�.
	       * �ش� ���� ���� �� ����ó���� ������ �߻� ���Ѿ� �ϸ�,
	       * ���ʰ��� ���� ���� �������� ������ �˴ϴ�.
	       * main2������ �ش� �迭 ���� ���� �� �ش� ������ ��� �ջ� �� ����� ���;��մϴ�
	       * ��, ���� ��ȯ�� ������ �߻��� ��� finally�� üũ �� main2 �޼ҵ�� ȣ���Ͽ� ���������� �����Ͱ� �������� �Ͻʽÿ�.
	       */
		
		String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" };
		
		try {
			main2(data);
			
			
		} catch (Exception z) {
			System.out.println(z);
		}
		finally {
			ArrayList<String> ar = new ArrayList<>();
			String b = null;
			int ww = 0;
			
			while(ww<data.length) {
				b = data[ww].replaceAll("[a-zA-Z]", "");
				ar.add(b);
				ww++;
			}
			String data2[] = new String[ar.size()];
			
			int www=0;
			
			while(www<ar.size()) {
				data2[www] = ar.get(www);
				www++;
			}
			
			
			try {
				main2(data2);
			} catch (Exception e) {
				if(e.getMessage()==null) {
					System.exit(0);
				}
				else {
					
					System.out.println(e);
				}
			}
			
		}

	}

	static public void main2(String a[]) throws Exception{
		
		int w =0;
		int ea = a.length;
		int total = 0;
		
		while(w<ea) {
			
			total+=Integer.valueOf(a[w]);
			w++;
		}
		
		System.out.println(total);
		
	}
	
}
