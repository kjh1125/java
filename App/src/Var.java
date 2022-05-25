
public class Var {

	public static void main(String[] args) {
		//변수 (지속적으로 변하는 수) [변수 선언방식(2가지)]
		 
		//1. 변수만 선언
		//String은 문자 자료형 // 다음 파일 참조
		String a1; // a1은 변수명을 지정한 것
		a1 = "홍길동 입니다."; // =: 뒤에 있는 값을 앞에 대입. == 두 개 쓰면 같음.
		System.out.println(a1);
		//변수명을 만든 후 값을 지정하여 넘겨주는 형태(선언방식)
		
		//2. 변수+값을 같이 선언하는 방식
		String b1 = "이순신 입니다";
		System.out.println(b1);
		
		// 변수확인 사항
		a1 = "이순신 입니다"; //a1의 기존값(홍길동)이 삭제되고 새로운 값으로 재설정됨.
		System.out.println(a1);
	}

}
