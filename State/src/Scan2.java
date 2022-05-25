import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("아이디를 입력하세요");
		String mid = a.next();
		//System.out.println(mid); //중간 테스트
		a.close();
		if(mid.equals("kim")||mid.equals("hong")) {
			// 문자열 형태는 scanner 이용 시 equals라는 함수를 추가로 사용해야함.
			System.out.println("회원이 확인되었습니다.");
		}
		else {
			System.out.println("회원이 확인되지 않습니다.");
		}
	}

}
