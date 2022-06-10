
public class Example3 {

	public static void main(String[] args) {
		
		inherit2 ih2 = new inherit2();
		ih2.it("홍길동","aaa5");
		ih2.print();
		
	}

	
}
class inherit1{
	private String nm; // 같은 클래스(inherit1) 내에서만 사용 가능.
	protected String pw; // 같은 상속 클래스(inherit1~2) 내에서 모두 사용 가능. // 외부클래스에서는 이용불가
	public String aa; // private으로 받은 값을 자식 클래스(inherit2)에서도 사용하기 위함.
	
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