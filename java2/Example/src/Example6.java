import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {

		/*
		 * [2차배열] user_list:{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"}
		 * user_point:{"3000","1000","25000","19800","5750","3630","0"}
		 * 
		 * 프로그램 시작과 동시에 "포인트를 검색할 고객명을 입력하세요" 입력한 값은 별도의 class를 제작하여 해당 메소드 값으로 매개변수를
		 * 이용하여, 전달 후 해당 결과값을 출력하시면 됩니다.
		 * 
		 */
		System.out.println("포인트를 검색할 고객명을 입력하세요");
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		user us = new user();
		us.user1(a);
		us = null;
		sc.close();

	}

}

class user {
	public void user1(String name) {
		String userdata[][] = { { "홍길동", "이순신", "강감찬", "유관순", "세종대왕", "김유신", "계백장군" },
			                  	{ "3000", "1000", "25000", "19800", "5750", "3630", "0" } };

		//int usea = userdata.length; // 배열 개수 2
		int usea1 = userdata[0].length; // 데이터 개수 7
		int w = 0;
		String msg = "";
		boolean b = false;
		
		while (w < usea1) {
				if (name.equals(userdata[0][w])) {
					msg = name + "님의 포인트는:" + userdata[1][w] + "점입니다.";
					b = true;
					}
			w++;
		}
		if (b == false) {
			msg = "존재하지 않는 회원입니다.";
		}
		System.out.println(msg);
	}
}
