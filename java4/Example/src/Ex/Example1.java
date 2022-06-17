package Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Example1 {

	public static void main(String[] args) {
		// 외부클래스를 사용하여 다음 프로세서를 작성하시오.
		/*
		 * 다음 2개의 배열 데이터가 있습니다. 2개의 배열을 하나의 배열로 합한 후 중복된 값은 하나만 나오도록 합니다. 1번 DB :
		 * 11,22,33,44,55 2번 DB : 8,10,11,19,44
		 * 
		 * 결과 : [8,10,11,22,33,44,55] 힌트: Collections 사용 // array나 linked 사용시
		 * 
		 * 순서 1. 중복값 비교하여 2번 데이터 삭제 2. 2번 DB를 1번 DB에 추가 3. 1번 DB를 sort를 이용하여 정렬
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
					this.b1.remove(ww); // 삭제를 하면 인데스 개수가 변경되기 때문에 에러가 발생할 수 있음
					this.b1.add(ww, 0); // 해당 인덱스 번호에 0을 넣는 처리 후 나중에 0을 제거할 수도 있음.
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