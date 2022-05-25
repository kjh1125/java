import java.util.Scanner; 
//import: java에 있는 파일을 로드할 때 사용하는 언어
//export: java에 있는 파일을 내보낼 때 사용하는 언어
//java.util 패키지 안에 Scanner 클래스 부분을 로드하게 됩니다.
//java.util 패키지는 그냥 사용하지 못하며 new를 할당항여 구분자를 사용하여야 함.
//단, 해당 코드 위치가 작성코드보다 아래에 있으면 안 됩니다. // ex)import로 가져온 코드가 작성코드 위에 있어야 함.

public class If4 {

	public static void main(String[] args) {
		
		//new : 객체를 선언하는 말
		Scanner a = new Scanner(System.in);
		//System.in(입력) != System.out(출력)
		System.out.println("아이디를 입력하세요");
		a.close();
		String mid = a.next();
		//next(): 사용자가 입력하는 형태를 말함 (숫자, 문자를 입력받는 형태)
	    System.out.println(mid);
	
	}			
}
