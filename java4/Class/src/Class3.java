
public class Class3 {

	public static void main(String[] args) {
		
		apink m = new apink();
		m.f_method("�̺���");
		
		apink.cafe LA = m. new cafe();
		LA.call();
		
	}

}

abstract class father { //�߻� Ŭ���� (abstract�� ����ؾ� �߻�)
	public String u_name; //���� ���� (�߻� Ŭ���� �ȿ� �ִٰ� �ص� abstract�� �����Ƿ� �߻��� �ƴ�)
	public abstract void f_method(String name); //�߻� �޼ҵ� 
}

class apink extends father{
	
	@Override
	public void f_method(String name) {
		
		this.u_name = name; // �߻�޼ҵ忡 �ִ� ���� ������ ���� �̰���.
		
	}
	
	class cafe{
		//�θ�Ŭ������ �ִ� ���������� �ڽ� Ŭ���� ���������� �̰�
		String msg = apink.this.u_name; 

		public void call() {
			String msg2 = this.msg+"�� ¯!!";
			System.out.println(msg2);
		}
	}
	
}