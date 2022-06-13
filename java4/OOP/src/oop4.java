
public class oop4 {
	//추상 클래스 및 메소드 abstract
	public static void main(String[] args) {
		
		ab_2 ab = new ab_2();
		int a = ab.b();
		//System.out.println(a);
		ab.ab_a();

	}

}

abstract class ab_1{ //추상클래스(외부에서 로드가 절대 안 됨) - 자체실행(X)
	
	
	public void ab_a() { //Free (인수값 없는 추상메소드)
	
	}
	public void ab_a(int a) { //Free (인수값 받는 추상메소드)
	}
	
	public abstract void ab_c(); //Free 구성
	public abstract int b(); //추상메소드 - 자체실행(X)
	
}
class ab_2 extends ab_1{
	@Override
	public void ab_c() {
		
	}
	
	@Override
	public void ab_a(int a) {
		
	}
	
	@Override
	public void ab_a() {
		System.out.println(this.c());
		//System.out.println(this.c());
	}
	
	@Override
	public int b() { //실제 메소드 + 추상 메소드
		return 55;
	}
	
	public int c() { 
		return 99;
	}
	
}


