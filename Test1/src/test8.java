import java.util.Scanner;

public class test8 {

	public static void main(String[] args) {
		/*
		 * [응용문제8] {"사과=2000","딸기=1500","키위=2500"} [출력순서]
		 * "해당 상품을 선택해 주세요? [1.사과, 2.딸기, 3.키위]" 2 "해당 상품 갯수를 입력해 주세요? " 5
		 * "구매한 하신 총 가격은 7500원 입니다." abstract 를 무조건 사용합니다.
		 */

		b a = new b();
		a.a1();
	}
}

abstract class a {
	String data[] = { "사과=2000", "딸기=1500", "키위=2500" };

	abstract public void a1();
}

class b extends a {

	String a1[] = new String[2];
	
	@Override
	public void a1() {
	
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("해당 상품을 선택해 주세요? [1.사과, 2.딸기, 3.키위]"); 
		 int a =sc.nextInt(); 
		 System.out.println("해당 상품 갯수를 입력해 주세요? "); 
		 int b =sc.nextInt();
		
		
		for(int f=0; f<data.length;f++) {
			if(f==a-1) {
				this.a1= data[f].split("=");
			}
	
		}
		int c = Integer.parseInt(this.a1[1]);
		System.out.println("구매하신 제품의 총 가격은 "+b*c+"원 입니다.");
		sc.close();
		
	}

}
