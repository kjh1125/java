import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 사용자가 다음과 같은 질문을 받습니다.
		 * "1~5"까지 숫자를 하나 입력해주세요."
		 * 
		 * 결과
		 * 1:5%할인쿠폰
		 * 2:10%할인쿠폰
		 * 3~4:택배비 무료
		 * 5:다음기회에
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1~5까지 숫자를 입력해주세요");
		 int n = sc.nextInt();
		 String msg;
		/*
		 switch(n) {
		 case 1:
			 msg ="5% 할인쿠폰";
	     break;
		 case 2:
			 msg ="10% 할인쿠폰";
	     break;
		 case 3:
		 case 4:
			 msg ="택배비무료";
	     break;
		 default:
			 msg ="다음 기회에";
	     break;
		 }
		 
		 */
		 //switch version 14 이후 형태 
		 
		 switch(n) {
		 case 1 -> {
			 msg ="5% 할인쿠폰";
		 }
		 case 2 ->{
			 msg ="10% 할인";
		 }
		 case 3,4->{
			 msg ="택배비무료";
		 }
		 default ->{
			 msg ="다음기회에";
		 }
		 }
		 
		 System.out.println(msg);
		 sc.close();
	}

}
