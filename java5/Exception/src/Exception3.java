import java.lang.reflect.Array;
import java.util.ArrayList;

public class Exception3 {

	public static void main(String[] args) {
	      /*[응용문제]
	       * data a = { "hong45", "lee90", "kang100", "park70", "kim72" };
	       * 해당 배열 데이터 값을 main2라는 메소드로 값을 던집니다.
	       * 해당 값을 던질 때 예외처리를 무조건 발생 시켜야 하며,
	       * 최초값을 던질 때는 가공없이 던지게 됩니다.
	       * main2에서는 해당 배열 값을 받은 후 해당 점수를 모두 합산 한 결과가 나와야합니다
	       * 단, 숫자 변환시 문제가 발생할 경우 finally로 체크 후 main2 메소드로 호출하여 정상적으로 데이터가 나오도록 하십시오.
	       */
		
		String data[] = { "hong45", "lee90", "kang100", "park70", "kim72" };
		
		try {
			main2(data);
			
			
		} catch (Exception z) {
			System.out.println(z);
		}
		finally {
			ArrayList<String> ar = new ArrayList<>();
			String b = null;
			int ww = 0;
			
			while(ww<data.length) {
				b = data[ww].replaceAll("[a-zA-Z]", "");
				ar.add(b);
				ww++;
			}
			String data2[] = new String[ar.size()];
			
			int www=0;
			
			while(www<ar.size()) {
				data2[www] = ar.get(www);
				www++;
			}
			
			
			try {
				main2(data2);
			} catch (Exception e) {
				if(e.getMessage()==null) {
					System.exit(0);
				}
				else {
					
					System.out.println(e);
				}
			}
			
		}

	}

	static public void main2(String a[]) throws Exception{
		
		int w =0;
		int ea = a.length;
		int total = 0;
		
		while(w<ea) {
			
			total+=Integer.valueOf(a[w]);
			w++;
		}
		
		System.out.println(total);
		
	}
	
}
