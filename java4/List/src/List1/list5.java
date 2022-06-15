package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*
		 * 응용문제 사용자가 금액을 숫자로 입력합니다.
		 * 해당 숫자 금액 횟수는 총 8번 입니다.
		 * 0~n까지 입력가능하며
		 * 해당 입력이 모두 끝나면 최종 합계 금액을 출력시키시오.
		 * 예시)
		 * 입금할 금액을 적으세요
		 *  
		 */
		
		
		in i = new in();
		System.out.println(i.result());
		
	}

}

class in{
	private String num;
	private int money;
	private int ea;
	private int sum;
	LinkedList<Integer> list = new LinkedList<>(); // 빈배열 생성
	
	
	public in() { 
		 
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			System.out.println("금액을 입력하세요");
			this.num = sc.next();
			try {
			this.money = Integer.parseInt(this.num);
			this.list.add(this.money);
			this.ea = list.size();
			if(ea>=8) {
				break;
			}
			
			} catch(Exception e){
				System.out.println("문자입니다, 숫자를 입력하세요");
			}
		}
		this.out();
	}
	
	public void out() {
		int w = 0;
		
		while(w<this.ea) {
			
			this.sum+= this.list.get(w);
			w++;
		}
		
	}
	
	public String result() {
		return "입력한 금액:"+this.list+"을 합친 총 금액은"+this.sum+"원 입니다";
	}
	
}
