
public class thread2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� Thread�� �̿��Ͽ� ������ �迭�� ���� ������������ ��� ���Ͽ� ����� ����ϴ� ���� ���α׷��� �����Ͻÿ�
		 * 
		 * ��Ʈ : 6�̶�� �迭���� �μ������� Thread�� ���� 6+5+4+3+2+1 ����������� print =>21
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

	public test(int b) { // Thread���� ���� �޾ƿ��� ���� ����.

		this.num = b;

	}

	@Override
	public void run() { // thread�� run �޼ҵ�� �μ����� ���� �� ��.

		int total = 0;
		
		while (this.num > 0) {

			total += this.num;

			this.num--;
		}

		System.out.println(total);
	}

}
