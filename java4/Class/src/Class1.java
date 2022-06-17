// 부모클래스 및 자식(내부)클래스 연동

public class Class1 {

	public static void main(String[] args) {
		// 부모클래스가 인스턴스에 적용이 되어있지 않으면 자식 class를 호출할 수 없음.
		// 자식 클래스를 메소드처럼 넣어서 사용하기 힘들도록 보안용도로 사용.
		parents p = new parents();
		p.p_box();
		parents.child pc = p.new child(); 
		// 부모 class.자식 class 이름생성 = 부모class명.new 자식 class
		pc.c_box();
		
		
	}

}


class parents { // 부모 클래스
	String a = "홍길동"; //부모 필드에 있는 전역변수(this 사용 필요)
	String b;
	class child { //자식 클래스
		int a = 20;
		
		public void c_box() { // 자식 Method
			double c = 10.5;
			System.out.println(c); // 자식 메소드 전용 지역변수
			System.out.println(this.a); //자식 클래스 전용 전역변수
			System.out.println(parents.this.a); //부모클래스 전용 전역변수
			System.out.println(b); // p_box의 지역변수를 가져오기 위해 부모클래스 전역변수 b를 사용
		
		}	
	}
	public void p_box() { //부모 Method
		String a = "이순신"; // 지역변수 선언 // 해당 메소드에만 사용 가능
		this.b = a;
		System.out.println(this.a); // this를 사용하면 전역변수를 불러옴.
	}
}