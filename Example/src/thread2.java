
public class thread2 {

	public static void main(String[] args) {
		/*
		 * 응용문제 Thread를 이용하여 각각의 배열의 값을 내림차순으로 모두 더하여 결과를 출력하는 응용 프로그램을 제작하시오
		 * 
		 * 힌트 : 6이라는 배열값이 인수값으로 Thread로 전달 6+5+4+3+2+1 최종결과값만 print =>21
		 * 
		 */

		int data[] = { 6, 9, 10, 15, 3, 17 };

		test t = null;

		int a;
		int w = 0;

		while (w < data.length) {
			a = data[w];

			t = new test(a);

			t.start();
			w++;
		}

	}

}

class test extends Thread {

	
	int num = 0;

	public test(int b) { // Thread에서 값을 받아오기 위한 역할.

		this.num = b;

	}

	@Override
	public void run() { // thread의 run 메소드는 인수값을 받지 못 함.

		int total = 0;
		
		while (this.num > 0) {

			total += this.num;

			this.num--;
		}

		System.out.println(total);
	}

}
