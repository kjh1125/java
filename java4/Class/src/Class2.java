
public class Class2 {

	public static void main(String[] args) {
		/*
		 * 응용문제 더블클래스를 이용하여 자식 클래스에 결과값을 출력하는 프로세서를 제작하시오
		 * 클래스는 2가지 있습니다.
		 * 부모클래스 명: mother
		 * 자식클래스 명: child
		 * 메인 클래스에서 mother 클래스로 값을 전달.
		 * 30,50 숫자값을 적용
		 * child에서 부모클래스에 있는 값을 받아 두 개의 숫자를 곱한 결과 값을 출력하시오.
		 * 
		 */
		mother m = new mother();
		m.m_method(30,50);
		mother.child c = m.new child();
		c.c_box();
		
	}

}

class mother{
	int aa;
	int bb;
	
	public void m_method(int a, int b) {
		this.aa = a;
		this.bb = b;
	}
	
	class child{
		int aa = mother.this.aa;
		int bb = mother.this.bb;
		public void c_box() {
			System.out.println(aa*bb);
		}
	}
	
}