import java.util.Arrays;

public class Array7 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 해당 사용자 정보 데이터 및 각 레벨별 데이터도 함께 제공됩니다.
		 * 그 중 레벨데이터 값에 3미만의 값만 확인하여 배열 데이터를 재가공합니다.
		 * 
		 *  "홍길동","이순신","강감찬","세종대왕","유관순","김유신"
		 *  4,3,1,1,2,2
		 * [결과]
		 * ["강감찬","세종대왕","유관순","김유신"]
		 * 
		 */
		
		String member[]= {"홍길동","이순신","강감찬","세종대왕","유관순","김유신"};
		int lv[]= {4,3,1,1,2,2}; // 배열 2개의 갯수는 같아야 됨.
		int lv_ea=lv.length;
		
		String b[] = new String[6];
		int b_ea=b.length;
		
		int w = 0;
		int ct = 0;
		
		while(w<lv_ea) {
			
			if(lv[w]<3&&ct<b_ea)
			{
				
				b[ct]=member[w];
				ct++;
			}
			w++;
		}
		System.out.println(Arrays.toString(b));
		// Arrays.toString : 숫자, 문자, 소수 등 []같은 형식으로 현재 배열 변수값을 출력하는 함수입니다.

	}

}
