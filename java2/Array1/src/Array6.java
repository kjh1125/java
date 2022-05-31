import java.util.Arrays;

public class Array6 {

	public static void main(String[] args) {
		/*
		 * 결과 값 출력하기
		 * 다음 장바구니에 여러 개의 상품이 담겨져 있습니다.
		 * 그 중 택배비가 별도로 측정되는 금액만 추출하시오.
		 * 택배비는 30000원 이상이면 포함된 겁니다.
		 * 15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700 
		 * 
		 * [결과 값]
		 * [48000, 67000, 118200, 49800]
		 * 
		 */
		int a[] = {15000, 48000, 67000, 8000, 118200, 49800, 6000, 18700};
		int b[] = new int[5];
		int a_ea = a.length;
		int b_ea = b.length;
		
		int dw=0;
		int ct=0;
		do {
			if(a[dw]>=30000&&ct<b_ea) {
			    b[ct] = a[dw];
				ct++;
			}
			
			dw++;
		}while(dw<a_ea);

		System.out.println(Arrays.toString(b));
		
	}

}
