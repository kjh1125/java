
public class Exception2 {

	public static void main(String[] args) {
		try {
			// test(); //메소드 호출 자체에서 발생하는 error기 때문에 exception으로 확인 불가.
			Exception2 ex = new Exception2();
			String a = "홍길동2";
			ex.test(a);
			
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void test(String b) throws Exception,NumberFormatException{ 
		// throws는 main메소드에서 예외처리 없이 메소드를 호출할 경우를 막기 위해
		int k = Integer.valueOf(b);
		System.out.println(k);
		Exception c= new Exception(); 
		throw c; // 코드 맨 하단에 사용하며 throw = return과 비슷한 역할을 지니고 있음.
		//예외처리 결과에 대한 값을 메인메소드로 다시 return시킴
		
	}
	
}
