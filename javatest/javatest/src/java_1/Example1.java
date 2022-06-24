package java_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * 응용문제 사용자가 6개의 숫자를 입력하는 로또 프로그램입니다. 프로세서 시작시 "숫자를 입력해 주세요:" 총 6번의 숫자를 입력합니다
		 * 그리고 lotto.txt 파일을 로드하여 사용자가 입력한 값과 결과를 비교하여 몇 개를 맞췄는지를 검토하는 프로그램 코드를 작성하시오.
		 * 
		 */

		test t = new test();

		System.out.println("총 맞춘 숫자는 " + t.getter() + "개 입니다");

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
	int ct = 0; // 겹치는 숫자가 있는 경우 카운트 ++

	public test() {

		Scanner sc = new Scanner(System.in);
		int w = 0;
		while (w < 6) {
			System.out.println("숫자를 입력해 주세요:");
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
