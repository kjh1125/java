
public class Example4 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * �� ���� ���� �ܺ� Ŭ������ �����ϴ�.
		 * �ش� Ŭ�������� �� ���� ���� ����ϰ� �˴ϴ�.
		 * ��� ������ ������ ����.
		 * 3,10�� ������ �Ǹ� �� ���� ���� ����.
		 * ������ �ܺ� Ŭ�������� �ش� ��� ���� ����ϴµ�,
		 * �� ���� �� ���� ¦������ Ȧ�� ������ ����ϴ� extends�� �����Ͻÿ�. 
		 */

		ex4_2 ex = new ex4_2();
		ex.cal(3,10);
		ex.odd();
		String result =ex.c2();
		System.out.println(result);
		
	}

}

class ex4_1{
	
	
	protected int c1;
	
	
	public void cal(int a,int b) {
		
		this.c1 = a+b;
		
	}
	
	
}

class ex4_2 extends ex4_1{
	private String msg;
	
	public void odd() {
		if(c1%2==0)
		{
			this.msg="¦��";
		}
		else {
			this.msg="Ȧ��";
		}
		
	}
	public String c2() {
		return this.msg;
	}
	
	
}