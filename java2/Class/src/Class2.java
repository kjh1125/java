
public class Class2 {
	// package�� ������� �� �� (default��)
	public static void main(String[] args) {
//		//������ Ŭ���� ���� �� �Լ��� �̿��Ͽ� ���� ���޹ޱ�
		
	//inject a = new inject();
	
	inject.oksign(); // ���� �⺻�� �Ǵ� �Լ���, static void�� ��� ��
	inject.test();
	members.user("�̼���"); // ��ȣ �ȿ� �ִ� ������(���ڰ�)
	members.cal(5,10);
	}

}

class inject{
	//public static void : ���� �⺻�� �Ǵ� �Ϲ� �Լ��� ���մϴ�.
	public static void oksign(){
		String user = "ȫ�浿";
		System.out.println(user);
	}
	public static void test(){
		int a = 1;
		int b = 3;
		int c = a+b;
		System.out.println(c);
	}
	
}

class members{
	
	public static void user(String names) {
		String msg = names + "�� ȯ���մϴ�.";
		System.out.println(msg);
	}
	public static void cal(int a, int b) {
		int c = a*b;
		System.out.println(c);
	}

}

