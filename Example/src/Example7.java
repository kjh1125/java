import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 사용자가 다음 질문을 확인하여 값을 입력 후 해당 결과를 돌출하는 프로세서를 제작합니다.
		 * "첫 번째 입력 값 단(1~10까지) 입니다."
		 * "두 번째 입력 값 단(1~10까지) 입니다."
		 * "세 번째 입력 값 단(1~10까지) 입니다."
		 * 
		 * 마지막 질문입니다.
		 * 해당 세 가지 값에 대한 산술기호를 적으시오: +,-,*,/
		 * 
		 * 해당 산술기호에 맞게 수식을 적용하여 최종값을 출력시키시오
		 * 
		
		int a,b,c;
		String cal;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("첫 번째 값을 입력하세요.(1~10까지)");
		a = sc.nextInt();
		System.out.println("두 번째 값을 입력하세요.(1~10까지)");
		b = sc.nextInt();
		System.out.println("세 번째 값을 입력하세요.(1~10까지)");
		c = sc.nextInt();
		System.out.println("산술기호를 입력하세요.");
		cal = sc.next();
		
		if(cal.equals("+")) {
			sum=a+b+c;
		}
		else if(cal.equals("-")) {
			sum=a-b-c;
		}
		else if(cal.equals("*")) {
			sum=a*b*c;
		}
		else if(cal.equals("/")) {
			sum=a/b/c;
		}
		System.out.printf("최종결과: %d %s %d %s %d = %d",a,cal,b,cal,c,sum);
		sc.close();
		 */
Scanner sc = new Scanner(System.in);
System.out.println("1번");
int no1 = sc.nextInt();
System.out.println("2번");
int no2 = sc.nextInt();
System.out.println("3번");
int no3 = sc.nextInt();

System.out.println("산술기호를 적으시오");
String ms = sc.next();
double a1;

if(ms.equals("+")) {
	System.out.println(no1+no2+no3);
}
else if(ms.equals("-")) {
	System.out.println(no1-no2-no3);
}
else if(ms.equals("*")) {
	System.out.println(no1*no2*no3);
}
else{
	a1 = no1/no2/no3;
	System.out.println(a1);
}

sc.close();

	}

}
