package java_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ����ڰ� 6���� ���ڸ� �Է��ϴ� �ζ� ���α׷��Դϴ�. ���μ��� ���۽� "���ڸ� �Է��� �ּ���:" �� 6���� ���ڸ� �Է��մϴ�
		 * �׸��� lotto.txt ������ �ε��Ͽ� ����ڰ� �Է��� ���� ����� ���Ͽ� �� ���� ��������� �����ϴ� ���α׷� �ڵ带 �ۼ��Ͻÿ�.
		 * 
		 */

		test t = new test();

		System.out.println("�� ���� ���ڴ� " + t.getter() + "�� �Դϴ�");

	}

}

abstract class test_1 {

	abstract int getter();

	abstract public void setter() throws IOException;

	abstract public void db() throws IOException;

}

class test extends test_1 {

	int usernum[] = new int[6];
	LinkedList<Integer> lottonum = null;
	int ct = 0; // ��ġ�� ���ڰ� �ִ� ��� ī��Ʈ ++

	public test() {

		Scanner sc = new Scanner(System.in);
		int w = 0;
		while (w < 6) {
			System.out.println("���ڸ� �Է��� �ּ���:");
			usernum[w] = sc.nextInt();
			w++;
		}
		sc.close();
		this.setter();

	}

	@Override
	public void setter() {
		try {
			this.db();
			int w = 0;
			int ea = usernum.length;

			while (w < ea) {
				int ww = 0;
				while(ww<ea) {
					
					if (this.usernum[w] == this.lottonum.get(ww)) {
						this.ct++;
					}
					ww++;
				}
				w++;
			} 
			
		}
			
			catch (Exception e1) {
			System.out.println(e1);
		}

	}

	@Override
	int getter() {

		return this.ct;
	}

	@Override
	public void db() throws IOException {
		try {

			FileReader fr = new FileReader("C:\\javatest\\javatest\\src\\java_1\\lotto.txt");
			BufferedReader br = new BufferedReader(fr);
			// System.out.println(br.readLine());
			this.lottonum = new LinkedList<>();
			String num = "";
			while ((num = br.readLine()) != null) {
				this.lottonum.add(Integer.parseInt(num));
			}
			br.close();

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}
