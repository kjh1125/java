import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		 /* 응용문제
		 * 데이터 파일 {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88} // Object 사용
		 * 해당 데이터 값 중 문자값만 출력되도록 재 배열하시오.
		 * 단 메인에서는 해당 배열을 외부 클래스로(setter) 전송만 합니다.
		 * 해당 setter에서 배열값을 확인하여 이름만 재배열로 생성합니다.
		 * 그 후 getter에서 해당 배열을 return으로 보내도록 하고
		 * 외부클래스에서 숫자만 있는 배열은 모두 예외처리 되도록 합니다.
		 */
		
		Object o[] = {"홍길동",55,"유관순","강감찬",48,"이순신","세종",34,88};
		a a1 = new a();	
		a1.setter(o);
		
	}

}

class a{
	
	ArrayList<String> a1 = new ArrayList<>();
	
	public void setter(Object a[]) {
		int w = 0;
		
		while(w<a.length) {
			
			try {
				
			} catch (Exception e) {
				
			}
			
			
		}
		
		
	}
	
	public String getter() {
		return null;
	}
	
}