package List1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class list3 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 넘버데이터 1: 3,6,9,12,15
		 * 넘버데이터 2: 2,4
		 * 
		 * 결과 3,6,9,12,15,2,4
		 */
		// Arrays.sort : 배열변수 형태에만 적용됨. // ArrayList에서는 사용 불가.
		
		Integer num1[] = {3,6,9,12,15};
		Integer num2[] = {2,4};
		
		ArrayList<Integer> nu1 = new ArrayList<>(Arrays.asList(num1));  
		ArrayList<Integer> nu2 = new ArrayList<>(Arrays.asList(num2));
		
		
		int ea = nu2.size();
		int ea2 = nu1.size();
		int w = 0;
		int w1 = ea2;
		
		while(w<ea) {
			
			nu1.add(w1,nu2.get(w));
			
			w1++;
			w++;
		}
		
		Collections.sort(nu1); // ArrayList, LinkdList에서 사용하는 오름차순 정렬을 하기 위한 명령어
		System.out.println(nu1);
	}

}
