import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		 /* ���빮��
		 * ������ ���� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88} // Object ���
		 * �ش� ������ �� �� ���ڰ��� ��µǵ��� �� �迭�Ͻÿ�.
		 * �� ���ο����� �ش� �迭�� �ܺ� Ŭ������(setter) ���۸� �մϴ�.
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�.
		 * �� �� getter���� �ش� �迭�� return���� �������� �ϰ�
		 * �ܺ�Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */
		
		Object o[] = {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88};
		a a1 = new a();	
		a1.setter(o);
		
	}

}

class a{
	
	ArrayList<String> a1 = new ArrayList<>();
	
	public void setter(Object a[]) {
		int w = 0;
		
		while(w<a.length) {
			
			try {
				
			} catch (Exception e) {
				
			}
			
			
		}
		
		
	}
	
	public String getter() {
		return null;
	}
	
}