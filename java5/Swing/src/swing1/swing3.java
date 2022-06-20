package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing3 {
	// 반복문을 이용하여 키생성 및 배열값을 split으로 분리
	public static void main(String[] args) {
		String data[] = {"홍길동","강감찬","이순신","유관순"};
		Map<String,String> m = new HashMap<>();
		
		int w = 0;
		do {
			
			m.put(String.valueOf(w),data[w]); // Integer.tostring(w)도 가능. 
			//중복되지 않은 키값 생성 + 해당 배열에 있는 index번호
			
			w++;
		}while(w<data.length);
		
		System.out.println(m);
		
		Map<String,String> m2 = new HashMap<>();
		
		for(String names:data) {
			m2.put(names, names+1); //foreach로 키와 값이 동일하도록 적용시키는 방식
		}
		System.out.println(m2);
		
		String alldata[] = {"email=test@gmail.com","age=25","names=홍길동"};
		Map<String,String> m3 = new HashMap<>();
		
		for(int f = 0; f<alldata.length; f++) {
			
			String key[]= alldata[f].split("=");
			m3.put(key[0], key[1]);
			
			
		}
			System.out.println(m3);
		
	}

}
