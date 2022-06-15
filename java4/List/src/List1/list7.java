package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list7 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ArrayList �Ǵ� LinkedList �� �߿� ���ϴ� �޼ҵ带 �����Ͻø� �˴ϴ�.
		 * 
		 * 2���迭 ���·� �ۼ� �ش� ������ ���� ��� ���Ͽ� ¦ �� ���� Ȧ �� ���� Ȯ���Ͻÿ� Integer data[][] = {
		 * {10,20,30,40,50,60,70}, {3,6,9,12,15,17,19} }
		 * 
		 * ���: ������ 361�̰� Ȧ���Դϴ�.
		 * 
		 */
		Integer data[][] = { { 10, 20, 30, 40, 50, 60, 70 }, { 3, 6, 9, 12, 15, 17, 19 } };

		ArrayList<Integer> data1 = new ArrayList<>(Arrays.asList(data[0]));
		ArrayList<Integer> data2 = new ArrayList<>(Arrays.asList(data[1]));

		int w = 0;
		int ea = data1.size();
		int total = 0;

		while (w < ea) {

			total += data1.get(w) + data2.get(w);

			w++;
		}

		if (total % 2 == 0) {
			System.out.println("�� ���� " + total + "�̸� ¦���Դϴ�");
		} else {
			System.out.println("�� ���� " + total + "�̸� Ȧ���Դϴ�");
		}

	}

}
