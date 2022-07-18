import java.util.Scanner;

public class Test2_2 {

	public static void main(String[] args) {
		/*
		 * [문제2] 검색할 사용자 이름을 검색하게 됩니다. (메인 메소드에서 실행)
		 * 
		 * 사용자 리스트는 다음과 같습니다. (외부 클래스 및 외부 메소드에서 제작) 강보경, 권용환, 금새록, 김동주, 김민재, 성유리, 손진호,
		 * 안희성
		 * 
		 * 해당 리스트 정보는 별도의 메소드 에서 생성해야 합니다. 사용자가 입력된 이름이 있을 경우 "해당 사용자가 있습니다." 라고 출력하고 없을
		 * 경우 "해당 사용자는 가입 되지 않았습니다." 라고 출력합니다.
		 * 
		 * 힌트 : 메인메소드에서 Scanner 작동 하며, 데이터 검색은 외부 Class 및 외부 메소드에서 처리
		 * 
		 * 
		 */

		test1 t = new test1();
		Scanner sc = new Scanner(System.in);
		System.out.println("검색할 사람을 입력하세요");
		String name = sc.next();
		t.setter(name);
		sc.close();
		
	}

}

class test1{
	
	String userdb[] = {"강보경","권용환", "금새록", "김동주", "김민재", "성유리", "손진호","안희성"};
	String msg="해당 사용자는 가입 되지 않았습니다.";
	
	public void setter(String a) {
		
		int w = 0;
		
		
		while(w<this.userdb.length) {
			
			if(a.equals(userdb[w])) {
				this.msg = "해당 사용자가 있습니다.";
				break;
			}
			
			w++;
		}
		System.out.println(msg);
	}
	
	
	
}
