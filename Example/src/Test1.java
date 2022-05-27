import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1번째 숫자값을 입력하세요");
		int a = sc.nextInt();
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("2번째 숫자값을 입력하세요");
		int b = sc1.nextInt();
		
		int c = a*b;
		
		if(c<=100) {
			System.out.println("100이하의 결과값입니다");
		}
		else {
			System.out.println("100초과 결과값입니다.");
		}
		sc.close();
		sc1.close();
		
	}

}
