
public class Exception4 {

	public static void main(String[] args) {
		
		ex e = new ex();
		
		try {
			
	    e.loader("ok");
			
			//�ڱ� �ڽ��� �ٷ� ���ܻ�Ȳ���� ����
		//Exception aaa = new Exception();
		//throw aaa; //throw : �ڽ��� ȣ���Ͽ� ���ܰ� �߻��ϸ� �ڽ��� ȣ���� �� 
			
		} catch (Exception e2) {
			if(e2.getMessage()!=null) {
			System.out.println(e2);
			}
		}
		
		
	}

}

class ex{
	Exception e3=null;
	
	public void loader(String a) throws Exception { // try~catch�� �ޱ� ���� Ŭ���� �ε�
		// �߸��� �������� (�ڽ��� ������ ���� main Ŭ������ ��� �����ϴ� ��Ȳ��
		/*
		if(a=="ok") {
			//���������� loader Ŭ�������� ������ �߻�
			int b = Integer.valueOf(a); 
			
		}
		else {
			//�ش� ������ �ڽ��� ���� ���׿� ���� ����ó���� �߸��� ���
			this.e3 = new Exception();
			throw this.e3;
			
		}
		*/
		//�� �� ����
		try {
			if(a=="ok") {
				//���������� loader Ŭ�������� ������ �߻�
				int b = Integer.valueOf(a); 
			}
			else {
				System.out.println("test");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			this.e3 = new Exception(); //�ڽ��� ���� ������ ���Ϲ޾Ƽ� Ȯ����
			throw this.e3;
			
		}
		
		
		
	}
	
}