
public class Method2 {

	public static void main(String[] args) {
		// default package�� ��� �� �ش� class ���� ȣ���ϸ� ��.
		// �� package�� �������� ��쿡�� ���� ��ܿ� package�� �����ؾ� ��.
		/*
		 tests ts = new tests();
		 ts.a2++;
		 System.out.println(ts.a2);
        */
		
		info i = new info();
		/* �Ʒ��� ���� ����� ��� ���� �߻���.
		System.out.println(i.data1(20));
		System.out.println(i.data2(20));
		*/
		System.out.println(i.data3(20));
		String result = i.data4("ȫ�浿");
		//data4 �޼ҵ� return���� result ������ �޾Ƽ� ó��
		System.out.println(result);
		
	}

}

class info{
	/*
	 * Static �Ǵ� void �޼ҵ忡���� return�̶�� ��ɾ ������� �� ��.
	 */
	public static void data1(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		//return z;
		
	}
	public void data2(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		//return z;
	}
	// �ڷ��� �޼ҵ�(int, String)��� ���ϸ�, ������ return�� ����ؾ� ��.
	// ��, sysout ��ɾ ������� �� ��.f
	public int data3(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		return z;
	}
	// return���� sysout�� ���� �� ���� ������ sysout�� ����� ����
	public String data4(String abc) { 
		String z = abc + "�� ȯ���մϴ�.";
		return z;
	
	}
}