
public class Example2 {

	private int unum; // ����ڰ� �Է��� ��
	private int rnum; // pc���� �Է��� ��
	private String msg;
	
	
	public void ex2(int user,int pc) { // setter �μ��� ����
		this.unum = user;
		this.rnum = pc;
		
		
		if(this.unum>this.rnum) {
			this.msg = "Down";
		}
		else if(this.unum<this.rnum) {
			this.msg = "Up";
		}
		else {
			this.msg = "����";
			
		}
		
	}
	
	public String result() { // getter (�μ���x) return
		return this.msg;
	}
	
}
