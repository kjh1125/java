import java.util.Scanner;

public class Loop_scan3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 입력");
		int a = sc.nextInt();
		sc.close();
		int b =1;
		int c;
		
		do {
			c = a*b;
			System.out.printf("%d ",c);
			b++;
		}while(b<=9);
		

	}

}
