
public class Example2 {

	private int unum; // 사용자가 입력한 값
	private int rnum; // pc에서 입력한 값
	private String msg;
	
	
	public void ex2(int user,int pc) { // setter 인수값 받음
		this.unum = user;
		this.rnum = pc;
		
		
		if(this.unum>this.rnum) {
			this.msg = "Down";
		}
		else if(this.unum<this.rnum) {
			this.msg = "Up";
		}
		else {
			this.msg = "정답";
			
		}
		
	}
	
	public String result() { // getter (인수값x) return
		return this.msg;
	}
	
}
