
public class Example5 {

	public static void main(String[] args) {
		/*
		 * 2차 배열 + 기본(클래스)메소드 문제
		 * 등록된 고객 중 vip 고객만 출력하시오.
		 * 
		 * user_list:{"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"}
		 * user_level:{"gold","vip","guest","gold","vip","vip","guest"}
		 * 결과 - 이순신, 세종대왕, 김유신
		 * 
		 */
		
		String list[][] ={
		  {"홍길동","이순신","강감찬","유관순","세종대왕","김유신","계백장군"}
		 ,{"gold","vip","guest","gold","vip","vip","guest"}
		 };
		
		Example5 ex = new Example5();
		ex.vip_list(list);
		
		
	}

	public void vip_list(String ls[][]) {
		
		int lsea = ls.length; // 배열 크기 2
		int lsea1 = ls[0].length; // 데이터 크기 7 
		
		
		int w = 0;
		
		
		while(w<lsea) {
			
			int ww=0;
			
			while(ww<lsea1) {
				if(ls[w][ww].equals("vip")) {
					System.out.println(ls[0][ww]);
					
				}
				
				
				
				
			ww++;
			
		}
			w++;
		}
		
		
	}
	
}
