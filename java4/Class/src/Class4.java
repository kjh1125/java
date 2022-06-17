import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * 배열데이터: 홍길동, 이순신, 유관순 세개의 데이터 존재.
		 * 메인 class에서 문자를 하나 전송합니다.
		 * 단, 문자가 null이나 배열 데이터와 관계없는 "강감찬"등으로 올 수도 있음.
		 * 외부 클래스명: data_list
		 * 추상 클래스명: v_constuct
		 * 외부 클래스 -> 내부 클래스명: check
		 * 
		 * [결과형태]
		 * 메인 클래스에서 강감찬을 적용할 경우 
		 * 내부 클래스에서 "해당 사용자는 가입자가 아닙니다" 라고 출력
		 * 메인 클래스에서 이순신을 적용할 경우
		 * 내부 클래스에서 "해당 사용자가 있습니다" 라고 출력
		 * 단, ArrayList로 배열을 로드하시오.
		 */
		
		data_list d = new data_list();
		d.userinput("이순신");

	}

}

abstract class v_constuct{
	
	String user_name;
	public abstract void userinput(String a);
}

class data_list extends v_constuct{
	
	@Override
	public void userinput(String a) {
		if(a==null) {
			System.out.println("사용자 이름을 입력하셔야 합니다.");
		}
		else {
			this.user_name = a;
			check ck = new check(); // 호출을 필요할 때만 하는 형태
			ck.db();	
		}
	}
	
	class check{
		String user_name = data_list.this.user_name; //부모클래스에서 받은 값을 자식클래스로 이관
		String data_list[]; //필드에 배열을 받는 객체 생성
		ArrayList<String> ar = null; // ArrayList util을 필드에 객체 생성
		
		public void db() {
			//해당 필드에 있는 ArrayList를 인스턴스로 적용
			this.data_list = new String[] {"홍길동","이순신","유관순"};
			this.ar = new ArrayList<>(Arrays.asList(this.data_list)); // this로 처리
			this.compare(); //db와 사용자 정보를 비교하는 메소드 실행.
		}
		
		public void compare() {
			int ea = this.ar.size();
			int w = 0;
			String msg ="";
			boolean bl = false; //결과 확인 작업
			
			do{
				
				if(this.ar.get(w).equals(this.user_name)) {
					msg = "해당 사용자가 있습니다" ;
					bl = true;
					break;
				}
				
				w++;
			}while(w<ea);
			
			if (bl==false) {
				msg = "해당 사용자는 가입자가 아닙니다";
			}
			
			System.out.println(msg);
			
		}
		
	}
	
}


