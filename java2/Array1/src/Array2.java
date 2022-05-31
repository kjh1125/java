
public class Array2 {

	public static void main(String[] args) {
		/*
		 * 결과 값: 
		 * hong
		 * kim
		 * park
		 * lee
		 * jang
		 * jung
		 */
		
	//	String id[] = {"hong","kim","park","lee","jang","jung"};
	
		/*
		 * 응용문제
		 * 해당 사용자 리스트 배열이 있습니다.
		 * 해당 배열값 중 사용자 아이디 3단어 이상만 출력시키시오.
		 
		int member = id.length; // 전체 회원수를 파악하기 위함
		int w=0;
		int word; // 각각의 배열 데이터의 문자 갯수파악
		
		do {
			word = id[w].length(); //문자 갯수파악
			
			if(word>3) { //세단어 이상(불포함)하는 데이터만 출력 
			System.out.println(id[w]);
			}
			w++;
			
		}while(w<member);
		
		
		
		 * 응용문제 배열데이터는 다음과 같음.
		 * 15 60 11 14 27
		 * 다음 데이터 값을 모두 더 해서 최종 결과값을 출력하시오.
		 */

		int a[] = {15,60,11,14,27};
		int aea = a.length;
		int dw=0;
		int total=0;
		
		do{
			total+=a[dw];
			dw++;
		}while(dw<aea);
		
		System.out.println(total);
		
	}

}
