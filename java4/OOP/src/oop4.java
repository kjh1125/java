
public class oop4 {
	//�߻� Ŭ���� �� �޼ҵ� abstract
	public static void main(String[] args) {
		
		ab_2 ab = new ab_2();
		int a = ab.b();
		//System.out.println(a);
		ab.ab_a();

	}

}

abstract class ab_1{ //�߻�Ŭ����(�ܺο��� �ε尡 ���� �� ��) - ��ü����(X)
	
	
	public void ab_a() { //Free (�μ��� ���� �߻�޼ҵ�)
	
	}
	public void ab_a(int a) { //Free (�μ��� �޴� �߻�޼ҵ�)
	}
	
	public abstract void ab_c(); //Free ����
	public abstract int b(); //�߻�޼ҵ� - ��ü����(X)
	
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
	public int b() { //���� �޼ҵ� + �߻� �޼ҵ�
		return 55;
	}
	
	public int c() { 
		return 99;
	}
	
}


