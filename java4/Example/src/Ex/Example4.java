package Ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * 응용문제: 사용자가 직접 숫자를 입력받습니다. //Scanner
		 * 단, 사용자가 문자를 입력할 경우 예외처리가 진행되어야 합니다.
		 * 총 숫자 입력은 7번이며, 사용자가 입력한 숫자를 오름차순으로 정렬합니다.
		 * 
		 * "숫자를 하나 입력해주시길 바랍니다" // 7번
		 * 
		 * [낮은 숫자부터 높은숫자로]
		 * 
		 * 추가옵션 - 짝수와 홀수값을 별도로 배열관리
		 * 
		 */
		
		
		b b = new b();
		
		
	}

}

class b{
	LinkedList<Integer> data = new LinkedList<>();
	LinkedList<Integer> data1 = new LinkedList<>();

	public b() {
	Scanner sc = new Scanner(System.in);
	int w = 0;
	do {
		System.out.println("숫자를 하나 입력해주시길 바랍니다.");1
		try {
			Integer ck = Integer.valueOf(sc.next());
			if(ck%2==0) {
				data.add(ck);
			}
			else {
				data1.add(ck);
			}
		}catch (Exception e123) {
			System.out.println("숫자를 입력하셔야 합니다");
		}
		
		w++;
	}while(w<7);
	Collections.sort(data);
	Collections.sort(data1);
	System.out.println(data);
	System.out.println(data1);
	
}
}
	


	
