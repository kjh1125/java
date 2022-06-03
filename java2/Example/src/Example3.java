import java.util.Arrays;

public class Example3 {

	public static void main(String[] args) {
		/*
		 * /*
		 * 배열 + 기본(클래스)메소드 문제
		 * Product:{"수박","참외","사과","배","딸기","키위","바나나","망고"} 
		 * moneys:{35000,8000,4000,5500,3800,4400,11000,18900}
		 * 장바구니에 사과와 바나나는 제외하고 총 결제 금액을 출력하시오. 
		 */
		String product[] = {"수박","참외","사과","배","딸기","키위","바나나","망고"} ;
		int money[] = {35000,8000,4000,5500,3800,4400,11000,18900};
		
		Example3 ex = new Example3();
		ex.list(product, money);
		ex = null;

	}

	public void list(String p[],int m[]) {
		int pea = p.length;
		int w = 0;
		int total = 0;
		
		while(w<pea) {
			
			if(!p[w].equals("사과")&&!p[w].equals("바나나"))
			{
				total+=m[w];
			}
			
			w++;
		}
		System.out.println("총 금액은:"+total);
	}
	
	
	
}
