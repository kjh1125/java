public class Example1 {

	public static void main(String[] args) {
		/*
		 * 배열+메소드 문제.
		 * 1차 배열에 다음과 같이 값이 있습니다.
		 * 배열 리스트 {22,33,44,55,66,77,88,99} 이며
		 * 해당 전체 값을 모두 더한 총 합계 값을 별도의 메소드로
		 * 처리되도록 합니다.
		 * 단, 반복문은 무조건 do~while문으로 작성하시오.
		 */
		
		int a[] = {22,33,44,55,66,77,88,99};
		// void = 객체생성 + 인스턴스(메모리) 등록
		
	    Example1 da = new Example1();
	    da.datas(a);
	    da = null;
		
		
		
	}
	public void datas(int a1[]) {
		int ea = a1.length; // 배열 개수 파악.
		int w = 0 ;
		int total = 0;
		
		do {
			total+=a1[w];
			
			w++;
		}while(w<ea);
		
		System.out.println("총합:"+total);
		
	}
}
	


	


