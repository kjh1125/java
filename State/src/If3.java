
public class If3 {

	public static void main(String[] args) {
		
		//boolean : true와 false로 둘중 하나로 구분되는 명령어
		
		boolean ck = true; 
		
		if(ck==true) {
			System.out.println("회원가입이 진행됩니다.");
		}
		else {
			System.out.println("이용약관에 동의하셔야만 진행됩니다.");
		}
		
		
		String name, pass; 
		name= "park";
		pass = "a1234";
		
		//&& : and 기호 한 가지 조건 이상 모두 만족할 때 
		//|| : or 파이프 기호 한 가지 조건 이상에서 한 개라도 맞을 경우
		
		if(name=="park" && pass=="a1234") {
			System.out.println("로그인 하셨습니다.");
			
		}
		else {
			System.out.println("아이디 및 패스워드를 확인하세요");
		}
		
		
		if(name=="park" || name=="kim")
			// if(name=="park" || pass=="a1234") // 두 가지 조건 중에 한 가지라도 맞을 경우 발생하게 됨, 잘못 된 기호 사용.
			
		{
			System.out.println("회원으로 확인되었습니다.");
		}
		
		else {
			System.out.println("확인된 회원이 없습니다.");
		}
		
		
		
		
	}

}
