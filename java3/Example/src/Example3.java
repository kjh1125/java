
public class Example3 {

	public static void main(String[] args) {
		
		inherit2 ih2 = new inherit2();
		ih2.it("ȫ�浿","aaa5");
		ih2.print();
		
	}

	
}
class inherit1{
	private String nm; // ���� Ŭ����(inherit1) �������� ��� ����.
	protected String pw; // ���� ��� Ŭ����(inherit1~2) ������ ��� ��� ����. // �ܺ�Ŭ���������� �̿�Ұ�
	public String aa; // private���� ���� ���� �ڽ� Ŭ����(inherit2)������ ����ϱ� ����.
	
	public void it(String d1, String d2) {
		this.nm = d1;
		this.pw = d2;
        this.aa = this.nm;		
	}
	
}
class inherit2 extends inherit1{
	public void print(){
		System.out.println(this.aa+" "+this.pw);
	}
	
	
}