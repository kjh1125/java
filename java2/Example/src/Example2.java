import java.util.Arrays;

public class Example2 {

	public static void main(String[] args) {
		/*
		 * 배열 + 기본(클래스)메소드 문제
		 * Product:{"수박","참외","사과","배","딸기","키위","바나나","망고"} 중 참외, 배, 키위를 삭제하였습니다.
		 * 해당 키워드를 삭제 후 배열을 다시 재 리스트 하는 코드를 작성하시오.
		 * 단, 해당 처리사항은 모두 별도의 메소드에서 처리가 되어야 하며
		 * 반복문은 Free입니다.	 
		 * 
		 * 결과 - [수박, 사과, 딸기, 바나나, 말고]
		 */
		
		String fr[] = {"수박","참외","사과","배","딸기","키위","바나나","망고"};
		
		Example2 ba = new Example2();
		ba.basket(fr);

	}

	public void basket(String a[]) {
		
		int ct=0;
		String fr2[] = new String[5];
		
		for(String p : a) {
			
			if(!p.equals("참외") && !p.equals("배")&&!p.equals("키위")) {
				fr2[ct] = p;
				ct++;
			
			}
			
		}
		
		System.out.println(Arrays.toString(fr2));
		
	}
	
}
