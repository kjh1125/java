
public class Test1_2 {

	public static void main(String[] args) {
		/*
		 * [����2] ���� Class�� return �޼ҵ带 �ϳ� �����մϴ�. ��, return �޼ҵ�� ����(����)�� ó���ϴ� �޼ҵ� �Դϴ�.
		 * main �޼ҵ忡�� �ش� return �޼ҵ�� ���� 5�� ���ڰ����� �����ϴ�. return �޼ҵ忡���� �ش� ���ڸ� ���� �� ���ϱ� 7��
		 * �Ͽ� ��� ���� main �޼ҵ�� ������ main���� ������� ��� �ǵ��� �մϴ�. ��Ʈ(getter)
		 */
		
		Test1_2 t = new Test1_2();
		System.out.println(t.a(5));
		
		
	}

	
	public int a(int b) {
		
		return b*7;
	}
	
}
