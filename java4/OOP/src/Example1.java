
public class Example1 {

	public static void main(String[] args) { // 외부클래스에서는 호출만
		// abstract 응용문제
		/*
		 * 1차 배열값이 있습니다, 해당 배열값을 모두 더한 값을 출력합니다. abstract 기본 void 이름은 sender로 합니다. 최종 값
		 * 출력은 sender에서 출력되도록 합니다. 배열은 abstract에서 사용합니다. 배열데이터: 6,13,22,9,12,64,32,47,39
		 * 모두 더한 결과 값을 띄우기
		 */

		data d = new data();

	}

}

abstract class test {
	int a[];
	int total = 0;

	public test() {
		this.a = new int[] { 6, 13, 22, 9, 12, 64, 32, 47, 39 };
	}

	abstract void sender();

	public void call() {
		this.sender();
	}

}

class data extends test {

	public data() {
		int w = 0;
		while (w < this.a.length) {
			this.total += this.a[w];
			w++;
		}
		this.call();
	}

	@Override
	public void sender() {
		System.out.println("배열의 총 합은: " + total);
	}

}
