
public class App {

	public static void main(String[] args) {
		/*
		 * int a = 10; int b = 20; int c; // 사칙연산기호 : +, -, *, /
		 * 
		 * // c = a+b; // c = a-b; // c = a*b; c = b / a;
		 * 
		 * System.out.println(c);
		 * 
		 * String a1 ="홍길동"; String b1 ="환영합니다."; String c1;
		 * 
		 * c1 = a1+b1; //+는 문자형태일 때도 사용하여 문자+문자열로 표현 가능. System.out.println(c1);
		 * 
		 * /* 응용문제 다음과 같이 출력되는 코드를 완성하시오.
		 * 
		 * 홍길동님 적립금은 50000 입니다. 단 홍길동(이름)과 50000(금액)은 변수로 지정해야 함.
		 * 
		 */

		/*
		 * String a2; int b2;
		 * 
		 * a2 = "홍길동"; b2 = 50000;
		 * 
		 * String c2 = a2+"님 적립금은 "+ b2 +" 입니다.";
		 * 
		 * System.out.println(c2);
		 */

		/*
		 * String mname = "홍길동"; int mpoint = 50000;
		 * 
		 * System.out.println(mname+"님 적립금은"+mpoint+"입니다.");
		 * 
		 * 
		 * /* 응용문제 아마존 사이트에서 상품을 구매하였음. 장바구니에 담은 상품 가격을 모두 더 해서 총 결제 금액이 출력되도록 하시오. 단 단
		 * $ 환율로 출력되어야 함. 8.25 4.02 3.71 결과 값을 다음과 같이 출력하시오. 총 결제금액 $ 입니다.
		 * 
		 * 
		 * float a = 8.25f; float b = 4.02f; float c = 3.71f;
		 * 
		 * float d = a+b+c;
		 * 
		 * System.out.println("총 결제금액 $"+d+"입니다.");
		 * 
		 * || = 파이프 기호 (키보드에서 + 오른쪽 기호)
		 * 
		 * [이클립스]
		 * java 구동 단축키: ctrl+f11
		 * java 코드 정렬: ctrl + shift + f
		 * 
		 * double로 나누기하여 소수점 결과값을 출력해야 할 경우,
		 * 연산값에 (double) 자료형을 기입해야 함.
		 * 
		 */

		double p1, p2, p3, p4;
		p1 = 8.25;
		p2 = 4.02;
		p3 = 3.71;
		p4 = p1 + p2 + p3;
		System.out.println("총 결제금액 $" + p4 + "입니다.");

		int k = 3;
		int j = 9;
		double aw = (double) k / j; // 연산형태의 자료형 또한 있는 코드
		System.out.println(aw);
	}

}
