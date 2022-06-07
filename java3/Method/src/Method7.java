import java.util.Arrays;

public class Method7 {

	
	public static void main(String[] args) {
		
		apink ap = new apink("홍길동",25,"test@test.com",-1000);
		//ap.names();
		System.out.println(ap.data());
		
	}

}

class apink{
	//private 선언은 class 필드에서 생성해야 합니다.
	//String nm2;
	private String nm;
	private int age;
	private String email;
	private String email_cp;
	private int point;
	
	public void names() {
		if(this.nm.equals("홍길동")) {
			this.nm = "hong";
			String e[] = this.email.split("@"); 
			// 이메일 중에 이메일 도메인만 가져오기 위해 배열로 나누는 작업.
			this.email_cp=e[1];
			
			//this.email_cp = 
		}
		
	}
	public apink(String nm1,int age2, String email3, int point4) { 
    // private는 안에서 사용하지 못 함.
		//setter 형태
		this.nm = nm1;
		this.email = email3;
		if(point4<0) {
			this.point=0;
		}
		else {
			this.point = point4;
		}
		names();
	}
	public String data() {
		return this.email_cp;
		//return this.nm; // return문은 항상 마지막에만 작성, return문 아래 코드는 무조건 error 발생함.
	}
	public int data2() {
		//getter 형태
		return this.point; 
	}
	
}