import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		/*
		[응용문제]
				사용자가 입력하여 조건에 맞는 메시지를 출력하시오.
				첫 번째 숫자값을 입력하세요.
				두 번째 숫자값을 입력하세요.

				첫 번째 숫자값 * 두 번째 숫자값에 대한 결과를 출력하십시오.

				단, 해당 결과값이 100 이하일 경우 
				"100이하의 결과값입니다."라고 출력

				100 이상일 경우
				"해당 값은 100이상 결과 값입니다."라고 출력
				*/
		
		Scanner a = new Scanner(System.in);
		System.out.println("첫 번째 숫자 값을 입력하세요");
		int a1 = a.nextInt();
		
		Scanner b = new Scanner(System.in);
		System.out.println("두 번째 숫자 값을 입력하세요");
		int b1 = b.nextInt();
		a.close();
		b.close();
		
		int c1 = a1+b1;
		
		if(c1<100) {
			System.out.printf("100미만의 결과 값이고 정확한 값은 %d입니다",c1);
		}
		else {
			System.out.printf("해당 값은 100이상이고 정확한 값은 %d입니다.",c1);
		}

	}

}
