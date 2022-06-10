import java.util.Scanner;

public class Example6 {

	public static void main(String[] args) {
		/*
		 * 응용문제 상품가격은 42000원입니다. 사용자가 해당 상품을 갯수를 입력하게 됩니다. 해당 상품 가격에 맞는 갯수만큼 곱하여 최종 결제
		 * 금액을 출력시키는 extends를 제작 단, 42000은 절대 숫자가 바뀌면 안 됨. 사용자가 최대로 구매할 수 있는 개수는 5개까지임.
		 * 최종 결과값은 main method에서 출력합니다.
		 */

		Scanner sc = new Scanner(System.in);
		System.out.println("구매할 상품의 개수를 선택하세요.");
		int sc1 = sc.nextInt();
		ex6_2 e = new ex6_2();
		if (sc1 > 5) {
			System.out.println("구매할 수 있는 범위를 벗어남");
			System.exit(0);
		} 
		else {
			e.ex1(sc1);
			int b = e.ex();
			System.out.printf("합계 금액은 %d 입니다", b);
		}
		sc.close();

	}

}

class ex6_1 {
	private final int price = 42000;
	protected int sum;

	public void ex1(int a) {

		this.sum = a * this.price;

	}
}

class ex6_2 extends ex6_1 {

	public int ex() {
		return this.sum;
	}

}
