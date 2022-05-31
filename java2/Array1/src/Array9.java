import java.util.Arrays;

public class Array9 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 2개의 데이터 배열이 있습니다.
		 * 해당 데이터 배열을 다음 결과처럼 값을 출력하시오.
		 * 
		 * 1번 데이터 : {"대한민국","일본","중국","베트남","태국"}
		 * 2번 데이터 : {"40","35","70","55","32"}
		 * [결과]
		 * ["대한민국(40)","일본(35)","중국(70)","베트남(55)","태국(32)"]
		 * 예시
		 * String d1 = "대한민국";
		   int d2 = 40;
		   String d3 = d1+"("+d2+")";
		 *
	
		
		String data[][]={
			{"대한민국","일본","중국","베트남","태국"},
			{"40","35","70","55","32"}
		};
		
		int d1 = data.length;//배열 개수 
		int d2 = data[0].length; //배열 데이터 개수 
		
		String data1[] = new String[d2];
		
			int ww= 0;
				
			while(ww<d2) {
				
				data1[ww] = data[0][ww]+"("+data[1][ww]+")";
				
				ww++;
			}
			
		System.out.println(Arrays.toString(data1));
		
			 */
		/*
		 * 응용문제
		 * 해당 두 개의 배열 데이터가 있습니다.
		 * 각 배열 별로 인덱스가 값은 번호를 더해서 짝수나 홀수 둘 중 뭐인지 결과를 데이터로 재설정 하십시오. 
		 * 
		 * Adata = 5,17,19,22,33
		 * Bdata = 1,2,3,4,5
		 * Result = [짝수,홀수,짝수,짝수,짝수]
		 * 
		 */
		
		int data[][]= {
				{5,17,19,22,33},
				{1,2,3,4,5}	
		};
		
		int d1 = data[0].length; // 배열 데이터 개수
		int d = data.length; // 배열 개수
		String msg;
		int data1[] = new int[d1];
		String result[] = new String[d1];
		
		int w = 0;
		
		while(w<d1) {
			
			data1[w] = data[0][w]+data[1][w];
			
			if(data1[w]%2==0) {
				msg="짝수";
			}
			else {
				msg="홀수";
			}
			result[w]=msg;
			
			w++;
		}
		
		System.out.println(Arrays.toString(result));

	}

}
