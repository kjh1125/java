

public class Method8 {

	public static void main(String[] args) {
		/*
		 * 응용문제. 협업 프로그래머가 해당 DB(Database)의 값 중 
		 * 홀수 값에 대한 총 개수를 받고자 합니다.
		 * 해당 개수를 출력될 수 있도록 코드를 작성하시오.
		 */
		odbc bc = new odbc();
		System.out.println(bc.oddsum());
		bc = null;

	}

}

class odbc{
	private int odd[]; // 배열값이 변경되지 않도록 사용.
	private int oddea = 0; // 홀수일 경우 +1씩 증가하게 하기 위한 필드 변수 값. 
	
	public odbc() {
		int odata[] = {15,22,17,14,32,35,19,33};
		this.odd = odata; 
		int oddea1 = odd.length;
		
		int w=0;
		
		
		do{
			if(odd[w]%2==1) {
				this.oddea++; // 홀수일 경우 +1씩 증가.
			}
			
			w++;
		}while(w<oddea1);
		

		oddsum();
		
		
		
	}
	public int oddsum() {
		return this.oddea; // 최종값을 return 시킴.
	}
}