
public class Exception2 {

	public static void main(String[] args) {
		try {
			// test(); //�޼ҵ� ȣ�� ��ü���� �߻��ϴ� error�� ������ exception���� Ȯ�� �Ұ�.
			Exception2 ex = new Exception2();
			String a = "ȫ�浿2";
			ex.test(a);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void test(String b) throws Exception,NumberFormatException{ 
		// throws�� main�޼ҵ忡�� ����ó�� ���� �޼ҵ带 ȣ���� ��츦 ���� ����
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c= new Exception(); 
		throw c; // �ڵ� �� �ϴܿ� ����ϸ� throw = return�� ����� ������ ���ϰ� ����.
		//����ó�� ����� ���� ���� ���θ޼ҵ�� �ٽ� return��Ŵ
		
	}
	
}
