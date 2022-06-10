import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 숫자를 입력하시오");
		int sc1 = sc.nextInt();
		int total;
		int ww=1;
		
		do {
			if(sc1<0) {
				System.out.println("음수 값은 구구단을 이용할 수 없습니다");
				System.exit(0);
			}
			
			total = sc1*ww;
			System.out.printf("%d*%d=%d\n",sc1,ww,total);
			
			ww++;
		}while(ww<10);
		
		System.gc();
		sc.close();
		
	}

}
