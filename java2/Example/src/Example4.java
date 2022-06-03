import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * 배열생성+기본(클래스)메소드 문제 :
		 * 사용자가 다음 질문에 값을 입력하게 됩니다.
		 * "학급 학생 이름을 입력해주세요"
		 * 무조건 총 배열데이터는 5개가 생성되어집니다.
		 * 별도의 메소드에서 해당 사용자가 입력한 값을 배열로 구성하여
		 * 출력하시오
		 * ex) 사용자가 입력한 형태: hong kim park lee jang
		 * 결과 - [hong,kim,park,lee,jang]
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int f;
		Example4 ex = new Example4();
		String list = "";
		
		for(f=0;f<5;f++) {
			System.out.println("학급 학생 이름을 입력해주세요");
			String name = sc.next();
			list += name+" ";
			
		}
		ex.input(list);
		ex = null;
		sc.close();
	}

	public void input(String a) {
		String userin[] = a.split(" ");
		//split: 문자열 또는 숫자열을 특정문자 기준으로 배열을 만들 수 있는 명령어입니다.
		System.out.println(Arrays.toString(userin));
		
	}
	
}
