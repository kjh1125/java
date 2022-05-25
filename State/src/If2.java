
public class If2 {

	public static void main(String[] args) {
		
		String mid1 = "hong"; 
		String mid2 = "kim";
		String mpass = "a123456"; // 비밀번호에 특수문자 제약이 있는 이유 - 인식에러, 데이터베이스에서 다른 문자로 잘못 받아들임.
		
		//해당 조건문은 문자로 확인하는 조건형태이며 else if문를 사용하지 않고 else문만을 적용하는 부분.
		
		if(mid1=="hong") {
			System.out.println("환영합니다.");
		}
		else if(mid1=="park") { // 추가로 비교대상이 있을 경우
			System.out.println("환영합니다.");
		}
		else {
			System.out.println("가입되지 않은 사용자입니다.");
		}
		
		//아이디 및 패스워드를 모두 검토하는 더블 조건문
		
		if(mid2=="kim") { // 큰 if문
			
			// 작은 if문
			if(mpass=="a123456") {
				System.out.println("로그인 하셨습니다.");
				
			}
			else {
				System.out.println("패스워드가 틀립니다.");
			}
			
		}
		
		else {
		System.out.println("가입되지 않은 사용자입니다.");	
		}
	}

}
