
public class Exception6 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 45*3+16+5+22*8�� �������� �ܺ� Ŭ������ ����.
		 * �ܺ� Ŭ���������� �ش� ���� ¦ ���� ��� ���ܿ����� �߻��ϰ�
		 * Ȧ ���ϰ�� Ȧ���� �Դϴٶ�� ȸ�ŵǵ��� �մϴ�.
		 * ¦ ���� ��� ����ó�� �߻����� �� Ȯ���� �ʿ��մϴ�. 
		 */
		/*
		 * ���빮��
		 * ������ ���� {"ȫ�浿",55,"������","������",48,"�̼���","����",34,88} // Object ���
		 * �ش� ������ �� �� ���ڰ��� ��µǵ��� �� �迭�Ͻÿ�.
		 * �� ���ο����� �ش� �迭�� �ܺ� Ŭ������(setter) ���۸� �մϴ�.
		 * �ش� setter���� �迭���� Ȯ���Ͽ� �̸��� ��迭�� �����մϴ�.
		 * �� �� getter���� �ش� �迭�� return���� �������� �ϰ�
		 * �ܺ�Ŭ�������� ���ڸ� �ִ� �迭�� ��� ����ó�� �ǵ��� �մϴ�.
		 */
		
		
		try {
			cal c = new cal();
			int d = 45*3+16+5+22*8;
			String result1 = c.result(d);
			System.out.println(result1);
			
		} catch (Exception e) {
			
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
			
		}
		
		
		
	}

}

class cal{
	
	public String result(int a) throws Exception {
		
		if(a%2==0) {
			throw new Exception("����ó�� �߻����� �� Ȯ���� �ʿ��մϴ�.");
		}
		else {
			
			String msg = "Ȧ���Դϴ�";
			return msg;
		}
		
		
	}
	
}