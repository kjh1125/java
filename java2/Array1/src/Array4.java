import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		String[] names = new String[3]; // 값이 없는 배열 // 공간만 만들어놨음.
		
		String m[] = {"홍길동","이순신","강감찬"}; //배열값에 데이터가 있는 상태
		// System.out.println(names[0]); 
		int ct = 0; //foreach에는 인덱스 번호가 없으므로 인덱스번호를 따로 지정해주기 위한 변수 생성이 필요함.
		for(String a:m) {
			if(a.equals("홍길동")||a.equals("강감찬")) { 
		    //해당 (기존)배열값 중 조건에 맞는 값만 추려서 새로운 배열값에 추가함.
			System.out.println(ct);
			names[ct] = a;
			ct++;//인덱스 번호를 순차적으로 적용하기 위한 증가값.
			}
		}
		// int name_ea=names.length;
		System.out.println(Arrays.toString(names));

		/*사용자가 장바구니에 내용을 결제하게 됩니다.
		 * 단, 해당 금액 리스트를 출력하지 말고 최종 전체 결제 금액만 출력되도록 합니다.
		 * 
		 * 1500,22000,13000,14500,113800,45000
		 */
		
		int[] a = {1500,22000,13000,14500,113800,45000};
		
		int b;
		int c = a.length;
		int total=0;
		for(b=0;b<c;b++) {
			total+=a[b];
			
		}
		System.out.println(total);
	
	}

}
