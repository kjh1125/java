
public class datatype {

	public static void main(String[] args) {
		String data[] = {"ȫ�浿"};
		
		//intern(): String�� equals�� ������� �ʰ� ==(�ε�ȣ)�� ��밡��.
		String a = "ȫ�浿";
		String b = "ȫ�浿";
		String c = new String("ȫ�浿").intern(); 
		// new ��ɾ�� heap�� ������ ���ڿ��� intern��ɾ�� Spring pool�� ���� ����, 
		// indent(0),indent(1)������ ������ �׷� ���� ����.
		String d = new String("ȫ�浿");
		String e = data[0];
		//Scanner sc = new Scanner(System.in);

		System.out.println(c==a);
		
		/*
		if(c==e) {
			System.out.println("���� �����ϴ�");
			
		}
		*/
		
		// new String : �Ҽ��� ���� �����й��� �ڷ���(����,�迭��)
		
	}

}
