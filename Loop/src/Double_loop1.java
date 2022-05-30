import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Double_loop1 {

	public static void main(String[] args) {
		
		/*
		Date today = new Date();
		System.out.println(today);
		
		SimpleDateFormat date = new SimpleDateFormat("yy년MM월dd일 / hh:mm:ss");
		SimpleDateFormat time = new SimpleDateFormat("H:m:ss");

		System.out.println(time.format(today));
		//format: 규격화된 형태로 값을 표현할 때 사용하게 됩니다.
		
		// ctrl+shift+o = 사용 안 하는 util 한 번에 삭제

		// f++ = f=f+1 1씩 증가 // f=f+2 2씩 증가.
		
		 * 응용문제
		 * 3개의 상품
		 * "상품 금액을 입력시켜주세요"
		 * "할인 %를 입력해 주세요:"라는 문구와 함께
		 * 해당 할인 숫자를 입력하면 최종금액이 출력되도록 합니다.
		 * 
		 
		
		int money = 0;
		int coupon;
			
		int c = 1; // 반복문 사용
		
		
		Scanner sc = new Scanner(System.in);
	
		while(c<4) {
			System.out.println("상품 금액을 입력해주세요");
			int b = sc.nextInt();	
			money+=b;
			c++;
		}
		System.out.println("할인%를 입력해주세요");
		coupon = sc.nextInt();
		double a = 1-(coupon * 0.01);
		System.out.println(money*a);
		
		sc.close();
		
		*/
		
		int f,ff;
		int total;
		
		for(f=1;f<4;f++) {
			//System.out.println(f);
			for(ff=1;ff<5;ff++) {
				total = f+ff;
				System.out.println(f +"+"+ ff);
			}
		}
		
		
		
		
	}
	

}
