import java.util.Arrays;

public class Array10 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 해당 두 개의 배열 데이터가 있습니다.
		 * 각 배열 별로 인덱스가 값은 번호를 더해서 짝수나 홀수 둘 중 뭐인지 결과를 데이터로 재설정 하십시오. 
		 * 
		 * Adata = 5,17,19,22,33
		 * Bdata = 1,2,3,4,5
		 * 
		 * test = [6,19,22,26,38]
		 * 
		 * Result = [짝수,홀수,짝수,짝수,짝수]
		 * Double loop
		 * 
		 */
		
		int A1[][]= {
				{5,17,19,22,33},
				{1,2,3,4,5}	
		};
		// A1[0][0] + A1[1][0] 
		// A1[0][1] + A1[1][1] // 더블문 반대로 생각해야 됨.
		
		int ea = A1[0].length; // 배열 데이터 개수
		int ea2 = A1.length; // 배열 개수
		int total1=0,total2=0; // 각각의 값을 이관 받는 변수

		int w=0; // 큰 반복문 인덱스
		int newdata[] = new int[ea]; // 새로운 배열 객체생성 
		
		while(w<ea) { //큰 반복문 5바퀴 // 배열에 데이터 추가 시 더 돌아감.
 			
			int ww=0;
			while(ww<ea2) { //작은 반복문 2바퀴 (배열그룹)
				
				if(ww==0) {
					total1=A1[ww][w];
				}
				else {
					total2= A1[ww][w];
				}
				ww++;
			}
			//작은 반복문 밖으로 나와서 첫 번째 배열값 + 두 번째 배열값을 더함.
			newdata[w]= total1+total2; // 더한 값을 새로운 배열 객체에 등록.
			
			w++;
		}
		System.out.println(Arrays.toString(newdata));

	}

}
