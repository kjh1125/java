package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		// �ܺ�Ŭ������ ����Ͽ� ���� ���μ����� �ۼ��Ͻÿ�.
		/*
		 * ���� 2���� �迭 �����Ͱ� �ֽ��ϴ�. 2���� �迭�� �ϳ��� �迭�� ���� �� �ߺ��� ���� �ϳ��� �������� �մϴ�. 1�� DB :
		 * 11,22,33,44,55 2�� DB : 8,10,11,19,44
		 * 
		 * ��� : [8,10,11,22,33,44,55] ��Ʈ: Collections ��� // array�� linked ����
		 * 
		 * ���� 1. �ߺ��� ���Ͽ� 2�� ������ ���� 2. 2�� DB�� 1�� DB�� �߰� 3. 1�� DB�� sort�� �̿��Ͽ� ����
		 */

		outclass ot = new outclass();
		ot.filter();

	}

}

class outclass {

	ArrayList<Integer> a1 = null;
	ArrayList<Integer> b1 = null;

	public void filter() {
		Integer a[] = { 11, 22, 33, 44, 55 };
		Integer b[] = { 8, 10, 11, 19, 44 };

		this.a1 = new ArrayList<Integer>(Arrays.asList(a));
		this.b1 = new ArrayList<Integer>(Arrays.asList(b));

		int w = 0;
		
		while (w < this.a1.size()) {
			int ww = 0;
			int b1ea = this.b1.size(); // 5
			
			while (ww < b1ea) {
				if (this.a1.get(w) == this.b1.get(ww)) {
					this.b1.remove(ww); // ������ �ϸ� �ε��� ������ ����Ǳ� ������ ������ �߻��� �� ����
					this.b1.add(ww, 0); // �ش� �ε��� ��ȣ�� 0�� �ִ� ó�� �� ���߿� 0�� ������ ���� ����.
				}
				ww++;
			}
			w++;
		}
		
		int t = 0;
		while(t<this.b1.size()) {
			if(this.b1.get(t)!=0) {
				this.a1.add(this.b1.get(t));
			}

			t++;
		}
		
		Collections.sort(this.a1);
		
		System.out.println(this.a1);
		
		

	}

}