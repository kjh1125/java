package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing3 {
	// �ݺ����� �̿��Ͽ� Ű���� �� �迭���� split���� �и�
	public static void main(String[] args) {
		String data[] = {"ȫ�浿","������","�̼���","������"};
		Map<String,String> m = new HashMap<>();
		
		int w = 0;
		do {
			
			m.put(String.valueOf(w),data[w]); // Integer.tostring(w)�� ����. 
			//�ߺ����� ���� Ű�� ���� + �ش� �迭�� �ִ� index��ȣ
			
			w++;
		}while(w<data.length);
		
		System.out.println(m);
		
		Map<String,String> m2 = new HashMap<>();
		
		for(String names:data) {
			m2.put(names, names+1); //foreach�� Ű�� ���� �����ϵ��� �����Ű�� ���
		}
		System.out.println(m2);
		
		String alldata[] = {"email=test@gmail.com","age=25","names=ȫ�浿"};
		Map<String,String> m3 = new HashMap<>();
		
		for(int f = 0; f<alldata.length; f++) {
			
			String key[]= alldata[f].split("=");
			m3.put(key[0], key[1]);
			
			
		}
			System.out.println(m3);
		
	}

}
