
public class Test1_1 {

	public static void main(String[] args) {
		/*
		 * [TEST1] [문제1] 메인 Class에 public void test()를 하나 생성합니다. main 클래스에서 해당 test 메소드가
		 * 실행 되도록 하며 test 메소드는 다음과 같이 처리가 되어야 합니다. 1~10까지 콘솔로 출력 되어야 함. 힌트(setter)
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
