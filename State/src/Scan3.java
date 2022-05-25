import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		/* Q. 사용자가 원하는 숫자를 입력하세요
		 * 응답상태 : 짝수, 홀수 값입니다. 라고 출력
        */
		
		
		Scanner a = new Scanner(System.in); //보조도구 ctrl+space로 불러오기, 함수 대소문자 구분 필수.
		System.out.println("원하는 숫자를 입력하세요");
		int b = a.nextInt();
		int c = b%2;
		a.close();
		// %는 값을 나누면서 나머지 값을 확인하는 수식구
		if(c==0) {
			System.out.println("짝수값입니다.");
		}
		else{
			System.out.println("홀수값입니다.");
		}
	}

}
