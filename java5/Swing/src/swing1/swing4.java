package swing1;

import java.util.HashMap;

public class swing4 {

	public static void main(String[] args) {
		
		String[][] data = {
				{"d1","123456"},
				{"d1","456789"},
				{"d2","홍길동"},
				{"d2","이순신"},
				{"d3","hong@naver.com"},
		};
		HashMap m = new HashMap<>(); // 데이터 자료형 나중에 선언
		//Map<String,String> m = new HashMap // 데이터 자료형 미리 선언
		//Map<> m = new HashMap // 데이터 자료형 나중에 선언
		System.out.println(data[0][0]); // 키값
		System.out.println(data[0][1]); // data
		
		for(int a = 0; a<data.length; a++) {
			
			if(!m.containsKey(data[a][0])) {
				
				m.put(data[a][0],data[a][1]); //Integer.parseInt 명령어 사용 가능. 
			}
			else {
				m.put(data[a][0]+a,data[a][1]);
			}
			
		}
		System.out.println(m);
	}

}
