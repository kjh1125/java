
public class Method1 {

	public static void main(String[] args) {
		
		tests t1 = new tests();
		t1.a1++;
		t1.a2++;
		t1.name1();
		t1.b1 += " ������";
		t1.b2 += " ������";
		t1.name2();
		
		tests t2 = new tests();
		t2.a1++;
		t2.a2++;
		t2.name1();
		t2.b1 += " ������";
		t2.b2 += " ������";
		t2.name2();
	}

}

class tests{
	
	int a1 = 1; // ���ο� ��ü ���� �� Ŭ������ ȣ�� �� ���� ���� �������� ������(1)�� �ٽ� �ҷ���. (��������)
	public static int a2 = 1; // ���ο� ��ü ���� �� Ŭ������ ȣ���ϴ��� ������(1)�� �ƴ� ������ ���� ���� ������ ����. (��������)
	
	String b1 ="�̼���";
	public static String b2 ="ȫ�浿";
	
	
	public void name1() {
		//System.out.println(a1);
		//System.out.println(a2);
	}
    public void name2() {
    	System.out.println(b1);
		System.out.println(b2);
	}
	
}