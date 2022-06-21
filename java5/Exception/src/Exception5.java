
public class Exception5 {

	//역할: 값 주고 출력만 함
	public static void main(String[] args) { 
		
		try {
			words wd = new words();
			String result = wd.files("");
			System.out.println(result);
			
		} catch (Exception e) {
			
			
			if(e.getMessage()!=null) {
			System.out.println(e);
			}
			}
		finally {
			try {
				words wd1 = new words();
				String result1 = wd1.files("홍길동");
				System.out.println(result1);
				
			} catch (Exception e2) {
				System.exit(0);
			}
		}
		
	}
}


class words{
	//역할: 값을 받고 연산 후 return
	public String files(String aa) throws Exception {
		
		if(aa==null || aa.equals("")) {
			
			throw new Exception("값이비어있음");
		}
		else {
			String msg = aa+"님 환영합니다";
			return msg;
		}
	}
}