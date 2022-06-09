
public class Over {

	public static void main(String[] args) {
		
		//pt p = new pt();
		//p.display();
		cd c = new cd();
		c.display("메인 내용 값 출력"); // 오버로딩
		c.display(); //오버라이드
		
	}

}
/*
 * 오버로딩(overloading) : 상속받은 클래스에서 부모클래스에는 없는 새로운 메소드를 정의하는 것을 말함.
 * 오버라이드(override) : 부모 클래스에서 상속받은 기존 메소드를 사용하는 것을 말함.
 * 
 */

class pt{
	
	public void display() {
		System.out.println("외부 내용 값");
		
	}
	
	
	
}

class cd extends pt{
	/* aaaa() 메소드는 에노테이션을 사용하지 못 함, 부모 클래스에 선언하지 않았음.
	@Override
	public void aaaa() {
		System.out.println("자식에 만들어진 메소드");
	}
	*/
	
	@Override   ///애노테이션(표시) 문제 발생 시 확인 (오버라이드에만 적용)
	public void display() { //오버라이드
		System.out.println("자식 클래스 값으로 변경");
		super.display(); //부모 클래스 고유 속성 메소드 값을 강제로 가져옴.
	}
		public void display(String msg) { //오버로딩
		System.out.println(msg);
	}
	
	
}