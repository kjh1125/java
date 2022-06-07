
public class Method5 {

	public static void main(String[] args) {
		
		cdb c = new cdb();
		/*
		c.d1 = "홍길동";
		
		c.data2();

		c.d3 = "이순신";
		c.data1();
		
		c.d1= "유관순";
		System.out.println(c.data3());
	    */
		
		//c.d2 = "강감찬"; // private으로 선언한 객체이므로 main class(선언한 class 외 모든 class)에서 로드 못 함.
		c.data2("강감찬");
		
		String result = c.data3();
		System.out.println(result);
	}
	
}


class cdb {
	
	String d1 = null; // void, 자료형 메소드에서 로드 가능.
	private String d2=null; // 
	public static String d3; // 모든 자료형에서 다 사용가능.
	
	public static void data1() { //static 자료형 외에는 로드가 불가능 함. // static에는 this 명령어를 사용하지 못 함.
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