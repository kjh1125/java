
public class Over {

	public static void main(String[] args) {
		
		//pt p = new pt();
		//p.display();
		cd c = new cd();
		c.display("���� ���� �� ���"); // �����ε�
		c.display(); //�������̵�
		
	}

}
/*
 * �����ε�(overloading) : ��ӹ��� Ŭ�������� �θ�Ŭ�������� ���� ���ο� �޼ҵ带 �����ϴ� ���� ����.
 * �������̵�(override) : �θ� Ŭ�������� ��ӹ��� ���� �޼ҵ带 ����ϴ� ���� ����.
 * 
 */

class pt{
	
	public void display() {
		System.out.println("�ܺ� ���� ��");
		
	}
	
	
	
}

class cd extends pt{
	/* aaaa() �޼ҵ�� �������̼��� ������� �� ��, �θ� Ŭ������ �������� �ʾ���.
	@Override
	public void aaaa() {
		System.out.println("�ڽĿ� ������� �޼ҵ�");
	}
	*/
	
	@Override   ///�ֳ����̼�(ǥ��) ���� �߻� �� Ȯ�� (�������̵忡�� ����)
	public void display() { //�������̵�
		System.out.println("�ڽ� Ŭ���� ������ ����");
		super.display(); //�θ� Ŭ���� ���� �Ӽ� �޼ҵ� ���� ������ ������.
	}
		public void display(String msg) { //�����ε�
		System.out.println(msg);
	}
	
	
}