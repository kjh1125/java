import java.util.Arrays;
import java.util.Scanner;

import javax.swing.event.ListSelectionEvent;

public class Class_array1 {

	public static void main(String[] args) {
		// 클래스 + 메소드 + 배열
		String user[] = {"홍길동","이순신","김유신"};
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요");
		String name = sc.next();
		arrays.lists(user,name);
		sc.close();
		/*
		 * 응용문제
		 * 사용자가 자신의 이름을 입력합니다.
		 * 사용자 이름을 해당 class로 보내서 등록된 사용자인지 
		 * 미등록 가입자인지를 확인하는 코드를 작성하시오
		 * 등록된 사용자일 경우 "가입이 되어 있습니다"라고 출력하고
		 * 미등록된 사용자일 경우 "미가입자입니다."라고 출력합니다.
		 */
	}
	

}

class arrays{
		
	
	public static void lists(String a[],String b) {
		//System.out.println(Arrays.toString(a));
		
		int w = 0;
		int ea = a.length;
		boolean ck =false;
		String msg = null; //메소드로 해당 값을 전달할 때는 비어있는 값을 명확하게 적용해야 한다.
		//String "" or null // int = 0으로 표현.
		
		while(w<ea) {
			
			if(b.equals(a[w])) {
				msg ="가입자입니다.";
				ck=true;
			}
			
			w++;
		}
		
		if(ck==false) {
			msg ="미가입자입니다.";
		}
		
		arrays ar12 = new arrays();
		ar12.message(msg);
		
	}

	public void message(String m) {
		System.out.println(m);
	}
}