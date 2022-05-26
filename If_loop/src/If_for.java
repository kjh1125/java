
public class If_for {

	public static void main(String[] args) {
		final int a = 1; // final을 사용 시 변수>상수로 변경 / 상수: 절대 변하지 않는 수
		final String name = "홍길동";
		//System.out.println(name);
		//System.out.println(a);
		/*
		final int ct = 10; //고정값
		int f; //반복문
		boolean ok = false; //조건에 대한 true 또는 false로 구분
		for(f=1;f<11;f++) {
			if(f==ct) { //반복문 값과 고정값이 같은 경우 
				System.out.println("등록된 값이 확인 됩니다.");
				ok = true; //조건에 대한 값을 변경합니다.
			}
		}
		if(ok==false) { //만약에 반복문이 끝났는데도 반복문 안에 해당되는 조건이 없을 경우
			//출력되는 코드입니다.
			System.out.println("확인이 되지 않는 숫자입니다.");
		}
		
		/*
		 * 총 20분의 값을 반복합니다. 그 중 홀수 값만 출력하도록 합니다.
		 */
		
		int ff;
		String odd=""; // odd(홀수) even(짝수)
		
		for(ff=1;ff<=20;ff++) {
			if(ff % 2 != 1) {
				System.out.print(ff+" ");
			}
			else { // 만약에 홀수 값일 경우 ODD 변수에 지속적으로 값을 추가하게 됩니다.
				odd += ff + " "; // int로 하는 경우 합계가 나오기 때문에 숫자를 나열하기 위해 String으로 데이터 형식 설정.
			}
			
		}
		System.out.println(odd);
		
		
	}

}
