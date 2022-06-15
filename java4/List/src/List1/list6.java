package List1;

import java.util.ArrayList;
import java.util.Scanner;

public class list6 {

	public static void main(String[] args) {
		//문자와 숫자 배열사용
		Scanner sc = new Scanner(System.in);
		
		int w = 0;
		ArrayList list = new ArrayList(); // 자료형이 없는 상태로 선언 // 추후 Object로 추출 가능.
		list.add(10);
		list.add("홍길동");
		list.add(52);
		/*
		while(w<5) {
			System.out.println("데이터 입력:");
			String user = sc.next();
			list.add(user);
			
			w++;
		}
		*/
		System.out.println(list);
		
		//숫자 입력사항만 모두 더함
		int ww=0;
		int total =0;
		do {
			try {
				Object k = list.get(ww); 
				// 배열자료가 숫자+문자 형태로 구성되어 있는 경우 Objcet매개타입으로 설정합니다.
				int numbers = Integer.parseInt(k.toString()); // 해당 매개타입을 문자화하여 parseInt로 다시 재 검증함
				total+=numbers; 
			
			}catch(Exception e){ //  배열 매개타입이 숫자가 아닐 경우 (예외상황 발생)
				
			}
			ww++;
		}while(ww<list.size());
		
		Object a = list.get(1); // 자료형이 정해지지 않은 자료 추출 시 사용 Object
		System.out.println("입력한 모든 배열의 숫자 합은: "+total);
	}

}
