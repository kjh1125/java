// �θ�Ŭ���� �� �ڽ�(����)Ŭ���� ����

public class Class1 {

	public static void main(String[] args) {
		// �θ�Ŭ������ �ν��Ͻ��� ������ �Ǿ����� ������ �ڽ� class�� ȣ���� �� ����.
		// �ڽ� Ŭ������ �޼ҵ�ó�� �־ ����ϱ� ���鵵�� ���ȿ뵵�� ���.
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); 
		// �θ� class.�ڽ� class �̸����� = �θ�class��.new �ڽ� class
		pc.c_box();
		
		
	}

}


class parents { // �θ� Ŭ����
	String a = "ȫ�浿"; //�θ� �ʵ忡 �ִ� ��������(this ��� �ʿ�)
	String b;
	class child { //�ڽ� Ŭ����
		int a = 20;
		
		public void c_box() { // �ڽ� Method
			double c = 10.5;
			System.out.println(c); // �ڽ� �޼ҵ� ���� ��������
			System.out.println(this.a); //�ڽ� Ŭ���� ���� ��������
			System.out.println(parents.this.a); //�θ�Ŭ���� ���� ��������
			System.out.println(b); // p_box�� ���������� �������� ���� �θ�Ŭ���� �������� b�� ���
		
		}	
	}
	public void p_box() { //�θ� Method
		String a = "�̼���"; // �������� ���� // �ش� �޼ҵ忡�� ��� ����
		this.b = a;
		System.out.println(this.a); // this�� ����ϸ� ���������� �ҷ���.
	}
}