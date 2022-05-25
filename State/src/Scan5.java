import java.util.Scanner;

public class Scan5 {

	public static void main(String[] args) {

		/*
		byte a = 33;
		if(a < 10) {
			System.out.println("10이상 숫자를 입력하세요.");
		}
		else if(a >= 10 && a <= 22) { // 조건문에 범위를 설정하여 적용함.
			System.out.println("당첨입니다.");
		}
		else {
			System.out.println("범위 밖의 숫자입니다.");
		}
		
		 */
		
		
		/*
		 * 1부터 45까지 숫자하나를 입력하세요.
		 * error 문구
		 * 0 입력: 숫자 입력이 잘못 되었습니다.
		 * 45보다 큰 숫자를 입력 시: 숫자는 1~45까지만 입력 가능합니다.
		 * 1~45 숫자를 입력할 경우
		 * 7,12,14 세 번호 입력할 경우 당첨입니다 출력
		 * 1~45에서 그 외 숫자 입력 시 다음기회에 참여하세요라고 출력. 
		 */
		
		/*
		Scanner a = new Scanner(System.in);
		System.out.println("1부터 45까지 숫자 하나를 입력하세요.");
		short num = a.nextShort();
		
		if(num==0) {
			System.out.println("숫자 입력이 잘못되었습니다.");
		}
		else if(num>=1 && num<=45) {
			if(num==7||num==12||num==14) {
				System.out.println("당첨입니다.");
			}
			else {
			    System.out.println("다음기회에 참여하세요");
			}
		}
		else{
			System.out.println("숫자는 1~45까지만 입력 가능합니다.");
		}
		*/
		
		Scanner qa = new Scanner(System.in);
		System.out.println("1~45까지 숫자 입력");
		int n = qa.nextInt(); //사용자가 입력하는 값
		qa.close();
		
		if(n==0) {
			System.out.println("숫자입력이 잘못되었습니다.");
		}
		else if(n>45)
		{
			System.out.println("1~45까지만 입력하세요");
		}
		// 추가 if 넣을 때는 마지막 else에 넣어야 수정이 편리함.
		else {
			if(n==7||n==12||n==14) {
			System.out.println("20% 쿠폰 당첨");
			}
			else if(n==41) {
				System.out.println("50% 쿠폰 당첨");
			}
			else {
				System.out.println("다음 기회에");
			}
		}
		
	}

}
