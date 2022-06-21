
public class Exception6 {

	public static void main(String[] args) {
		/*
		 * 응용문제 45*3+16+5+22*8의 최종값을 외부 클래스로 전송.
		 * 외부 클래스에서는 해당 값이 짝 수일 경우 예외오류를 발생하고
		 * 홀 수일경우 홀수값 입니다라고 회신되도록 합니다.
		 * 짝 수일 경우 예외처리 발생으로 재 확인이 필요합니다. 
		 */
		/*
		 * 응용문제
		 * 데이터 파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88} // Object 사용
		 * 해당 데이터 값 중 문자값만 출력되도록 재 배열하시오.
		 * 단 메인에서는 해당 배열을 외부 클래스로(setter) 전송만 합니다.
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다.
		 * 그 후 getter에서 해당 배열을 return으로 보내도록 하고
		 * 외부클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 */
		
		
		try {
			cal c = new cal();
			int d = 45*3+16+5+22*8;
			String result1 = c.result(d);
			System.out.println(result1);
			
		} catch (Exception e) {
			
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
			
		}
		
		
		
	}

}

class cal{
	
	public String result(int a) throws Exception {
		
		if(a%2==0) {
			throw new Exception("예외처리 발생으로 재 확인이 필요합니다.");
		}
		else {
			
			String msg = "홀수입니다";
			return msg;
		}
		
		
	}
	
}