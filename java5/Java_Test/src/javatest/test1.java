package javatest;

import java.util.ArrayList;
import java.util.LinkedList;

public class test1 {

	public static void main(String[] args) {
		// 해당 데이터중 가장 점수가 높은 사람만 출력
		/*
		 * 출력 예 1등 : Daniel(98) { {
		 * "Elena","Suzie","John","Emily","Neda","Kate","Alex","Daniel","Hamilton"},
		 * {"65","74","23","75","68","96","88","98","54"} }
		 * 
		 */
		// 출력 ex) 1등: Daniel(98); // abstract 사용

		a_1 aa = new a_1();
		aa.setter();

		System.out.println(aa.getter());

	}

}

abstract class a {
	abstract public void setter();

	abstract String getter();

	abstract public void db();
}

class a_1 extends a {

	private ArrayList<Integer> num = new ArrayList<>();
	private LinkedList<String> name = new LinkedList<>();
	private String result = "";

	@Override
	public void setter() {

		db();

		int max = 0;

		int w1 = 0;

		while (w1 < num.size()) {

			if (num.get(w1) > max) {
				max = num.get(w1);
			}

			w1++;
		}

		int w2 = 0;
		String name2="";
		
		while (w2 < this.name.size()) {

			if (this.num.get(w2) == max) {
				name2+= this.name.get(w2)+",";
				this.result = "1등: " + name2 + "(" + max + ")";
			}

			w2++;
		}

	}

	@Override
	String getter() {

		return this.result;
	}

	@Override
	public void db() {

		String a[][] = { { "Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton" },
				{ "65", "74", "23", "75", "68", "96", "88", "98", "54" } };

		int ea = a[0].length;

		int w = 0;

		while (w < ea) {

			this.name.add(a[0][w]);
			
			this.num.add(Integer.valueOf(a[1][w]));

			w++;
		}

	}

}