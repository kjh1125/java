
public class Class2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ����Ŭ������ �̿��Ͽ� �ڽ� Ŭ������ ������� ����ϴ� ���μ����� �����Ͻÿ�
		 * Ŭ������ 2���� �ֽ��ϴ�.
		 * �θ�Ŭ���� ��: mother
		 * �ڽ�Ŭ���� ��: child
		 * ���� Ŭ�������� mother Ŭ������ ���� ����.
		 * 30,50 ���ڰ��� ����
		 * child���� �θ�Ŭ������ �ִ� ���� �޾� �� ���� ���ڸ� ���� ��� ���� ����Ͻÿ�.
		 * 
		 */
		mother m = new mother();
		m.m_method(30,50);
		mother.child c = m.new child();
		c.c_box();
		
	}

}

class mother{
	int aa;
	int bb;
	
	public void m_method(int a, int b) {
		this.aa = a;
		this.bb = b;
	}
	
	class child{
		int aa = mother.this.aa;
		int bb = mother.this.bb;
		public void c_box() {
			System.out.println(aa*bb);
		}
	}
	
}