
public class Example1 {

	public static void main(String[] args) { // �ܺ�Ŭ���������� ȣ�⸸
		// abstract ���빮��
		/*
		 * 1�� �迭���� �ֽ��ϴ�, �ش� �迭���� ��� ���� ���� ����մϴ�. abstract �⺻ void �̸��� sender�� �մϴ�. ���� ��
		 * ����� sender���� ��µǵ��� �մϴ�. �迭�� abstract���� ����մϴ�. �迭������: 6,13,22,9,12,64,32,47,39
		 * ��� ���� ��� ���� ����
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
		System.out.println("�迭�� �� ����: " + total);
	}

}
