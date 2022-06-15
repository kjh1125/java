package List1;

import java.util.ArrayList;
import java.util.Arrays;

public class list7 {

	public static void main(String[] args) {
		/*
		 * 응용문제 ArrayList 또는 LinkedList 둘 중에 원하는 메소드를 구현하시면 됩니다.
		 * 
		 * 2차배열 형태로 작성 해당 데이터 값을 모두 더하여 짝 수 인지 홀 수 인지 확인하시오 Integer data[][] = {
		 * {10,20,30,40,50,60,70}, {3,6,9,12,15,17,19} }
		 * 
		 * 결과: 총합은 361이고 홀수입니다.
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
			System.out.println("총 값은 " + total + "이며 짝수입니다");
		} else {
			System.out.println("총 값은 " + total + "이며 홀수입니다");
		}

	}

}
