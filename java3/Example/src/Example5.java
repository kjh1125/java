
public class Example5 {

	public static void main(String[] args) {
		/*
		 * extends�� ����Ͽ� ���� ����� ���� �ڵ带 �ۼ��Ͻÿ�
		 * ���� �� ���� �Է��մϴ�.
		 * �� ���� ���ڸ� Ȯ���Ͽ� ������ ���� üũ�մϴ�.
		 * ù ��° ���ڰ� �� ��° ���ں��� ���� ��� 
		 * - �� ���� ���� ��ģ ����� ���
		 *  
		 * ù ��° ���ڰ� �� ��° ���ں��� Ŭ ���
		 * - �ش� ���� ��ŭ ���ڸ� ��� ���� ��� ���� ���
		 * 
		 * ù ��° ���ڿ� �� ��° ���ڰ� ���� ���
		 * - "�ش� ���� �����ϴ�." �޽��� ���
		 * 
		 */
		int a = 10;
		int b = 12;
		
		ex5_2 e = new ex5_2();
		e.a1_1(a, b);
		e.a1_2();
		
		e=null;
		System.exit(0);

	}

}

class ex5_1{
	private int a_1;
	private int b_1;
	protected int c = 0;
	protected String msg;
	protected boolean a123 = false;
	
	public void a1_1(int a1, int b1) {
		this.a_1 = a1;
		this.b_1 = b1;
		
		if(a1>b1) {
			this.c = a1+b1;  
			a123 =true;
			
		}
		else if(a1<b1) {
			this.a_1=a1;
			
			
			while(this.a_1<=this.b_1) 
			{
				this.c+=this.a_1;
				a_1++;
			}
			
		}
		else {
			msg = "�� ���� �����ϴ�.";
		}
	}
	
}

class ex5_2 extends ex5_1{
	
	public void a1_2() {
		
		if(this.c==0) {
			System.out.println(msg);
		}
		else if(a123==true){
			System.out.println("�ش� ���� ���� ���� "+this.c+" �Դϴ�.");
		}
		else{
			System.out.println("�ش� ���� ������ ��� ��ģ���� "+this.c+" �Դϴ�");
		}
			
	}
	
	public int a1_3() {
		
		return this.c;
	}
	
	
}
