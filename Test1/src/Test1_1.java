
public class Test1_1 {

	public static void main(String[] args) {
		/*
		 * [TEST1] [����1] ���� Class�� public void test()�� �ϳ� �����մϴ�. main Ŭ�������� �ش� test �޼ҵ尡
		 * ���� �ǵ��� �ϸ� test �޼ҵ�� ������ ���� ó���� �Ǿ�� �մϴ�. 1~10���� �ַܼ� ��� �Ǿ�� ��. ��Ʈ(setter)
		 * 
		 */
		Test1_1 t = new Test1_1();
		t.test();
		
		
	}

	public void test() {
		
		int w = 1;
		
		while(w<11) {
			System.out.println(w);
			
			w++;
		}
		
	}
	
}
