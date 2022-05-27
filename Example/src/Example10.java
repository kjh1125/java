import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 * 응용문제 10
		 * 다음 이용약관에 대한 동의 프로그램 제작
		 * 동의 항목은 전체 3가지이며 모두 동의(True)하여야만 다음 프로세서로 진행
		 * "동의항목에 동의하시겠습니다.?" 동의 1, 동의 안 함 2
		 * 
		 * 하나라도 동의하지 않을 경우
		 * "모두 동의하셔야만 진행됩니다" 라고 출력.
		 * 모두 동의하였을 경우
		 * "회원가입이 완료되었습니다."라고 출력.
		Scanner sc = new Scanner(System.in);
		Boolean a,b,c;
		a= false;
		b= false;
		c= false;
		
		byte e = 1;
		
		while(e<4) {
		
			if(e==1) {
				System.out.printf("%d번 항목에 동의하시겠습니까? 동의 1번, 동의 안 함 2번\n", e);
				byte d = sc.nextByte();
				if(d==1) {
					a = true;
				}
			}
			else if(e==2) {
				System.out.printf("%d번 항목에 동의하시겠습니까? 동의 1번, 동의 안 함 2번\n", e);
				byte d = sc.nextByte();
				if(d==1) {
					b = true;
				}
			}
			
			else if(e==3) {
				System.out.printf("%d번 항목에 동의하시겠습니까? 동의 1번, 동의 안 함 2번\n", e);
				byte d = sc.nextByte();
				if(d==1) {
					c = true;
				}
			}
		e++;
		}
		
		if(a==true&&b==true&&c==true){
			System.out.println("회원 가입이 완료되었습니다.");
		}
		else{
			System.out.println("모두 동의하셔야만 진행됩니다");
		}
		
		sc.close();
		 */
		
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int agree;
		boolean all_agree = false;
		
		do {
			System.out.println("동의? 동의 (1번), 동의 안함 (2번)");
			agree = sc.nextInt();
			
			if(agree==1) {
				all_agree = true;
			}
			else {
				all_agree = false;
				break;
			}
			
			w++;
		}while(w<4);
		
		if(all_agree==false) {
			System.out.println("모두 동의하여야만 진행됩니다.");
		}
		else {
			System.out.println("회원가입이 완료되었습니다");
		}
		sc.close();
	}

}
