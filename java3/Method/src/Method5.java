
public class Method5 {

	public static void main(String[] args) {
		
		cdb c = new cdb();
		/*
		c.d1 = "ȫ�浿";
		
		c.data2();

		c.d3 = "�̼���";
		c.data1();
		
		c.d1= "������";
		System.out.println(c.data3());
	    */
		
		//c.d2 = "������"; // private���� ������ ��ü�̹Ƿ� main class(������ class �� ��� class)���� �ε� �� ��.
		c.data2("������");
		
		String result = c.data3();
		System.out.println(result);
	}
	
}


class cdb {
	
	String d1 = null; // void, �ڷ��� �޼ҵ忡�� �ε� ����.
	private String d2=null; // 
	public static String d3; // ��� �ڷ������� �� ��밡��.
	
	public static void data1() { //static �ڷ��� �ܿ��� �ε尡 �Ұ��� ��. // static���� this ��ɾ ������� �� ��.
		//System.out.println(this.d2); 
	}
	public void data2(String user) {
		this.d2 =user;
		System.out.println(d2);
	}
	
	public String data3() {
		String a = this.d2;
		return a;
	}
	
}