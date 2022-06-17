
public class Class3 {

	public static void main(String[] args) {
		
		apink m = new apink();
		m.f_method("이보미");
		
		apink.cafe LA = m. new cafe();
		LA.call();
		
	}

}

abstract class father { //추상 클래스 (abstract를 사용해야 추상)
	public String u_name; //전역 변수 (추상 클래스 안에 있다고 해도 abstract이 없으므로 추상이 아님)
	public abstract void f_method(String name); //추상 메소드 
}

class apink extends father{
	
	@Override
	public void f_method(String name) {
		
		this.u_name = name; // 추상메소드에 있는 전역 변수로 값을 이관함.
		
	}
	
	class cafe{
		//부모클래스에 있는 전역변수를 자식 클래스 전역변수로 이관
		String msg = apink.this.u_name; 

		public void call() {
			String msg2 = this.msg+"님 짱!!";
			System.out.println(msg2);
		}
	}
	
}