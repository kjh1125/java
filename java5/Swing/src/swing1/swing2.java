package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {
	
	public static void main(String[] args) {
		//ArrayList, LinkedList(�迭��) - add,remove,get,size
		//Map (�迭Ű, �迭��) - put,remove,get,size
		//Map�� �迭Ű ����̱� ������ Ű�� ���ؼ� �����͸� Ȯ���մϴ�. // index��ȣ ������� ����.(�ӵ� �ֻ�)
		//���� Ű�� ��� �� �������� ����� ������ ���ŵ�.
		//*ȣ���ϴ� Ű���� ���� �ߺ��Ǹ� �� ��.
		
		Map<String,String> m = new HashMap<>();
		//ex) hong -> Hash function(HashMap) -> 0x21949CB (�ߺ����� �߻����� ����)
		m.put("hong", "ȫ�浿");
		m.put("kang", "������");
		System.out.println(m.get("hong")); 
		// �տ� �ִ� ���� ȣ���ϸ� �ڿ� ���� ȣ���. ex)hong�� ȣ�� �� ȫ�浿�� ȣ���.
		m.put("","�����ż�"); 
		// ����ִ� Ű�� ����� ���� ������, Map�� ����ϴ� �����δ� ��︮�� ����.
		m.put("park","");
		//Ű�� ������ ���� ����ִ� ���� �����.
		if(m.get("park").equals("")) {
			m.put("","��");
			
		}
		System.out.println(m);
		m.remove("hong");
		System.out.println(m);
		
		//Map �������� �ڷ��� ��� ����.
		Map<String,Integer> m2 = new HashMap<>(); 
		
		m2.put("age", 32);
		m2.put("level", 5);
		
		System.out.println(m2);
		
		System.out.println(m2.keySet()); //Ű�� ���
		System.out.println(m2.values()); //���� ���
		System.out.println(m2.containsKey("age"));
		//�ش� Ű�� �ִ��� Ȯ�� (False: ����, true: ����)
		
		
	}
}
