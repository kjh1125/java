package swing1;

import java.util.HashMap;
import java.util.Map;

public class swing2 {
	
	public static void main(String[] args) {
		//ArrayList, LinkedList(배열값) - add,remove,get,size
		//Map (배열키, 배열값) - put,remove,get,size
		//Map은 배열키 기반이기 때문에 키를 통해서 데이터를 확인합니다. // index번호 사용하지 않음.(속도 최상)
		//같은 키를 사용 시 마지막에 적용된 값으로 갱신됨.
		//*호출하는 키값이 절대 중복되면 안 됨.
		
		Map<String,String> m = new HashMap<>();
		//ex) hong -> Hash function(HashMap) -> 0x21949CB (중복값이 발생하지 않음)
		m.put("hong", "홍길동");
		m.put("kang", "강감찬");
		System.out.println(m.get("hong")); 
		// 앞에 있는 값을 호출하면 뒤에 값이 호출됨. ex)hong를 호출 시 홍길동이 호출됨.
		m.put("","박혁거세"); 
		// 비어있는 키를 사용할 수는 있으나, Map을 사용하는 이유로는 어울리지 않음.
		m.put("park","");
		//키는 있으나 값이 비어있는 경우는 사용함.
		if(m.get("park").equals("")) {
			m.put("","박");
			
		}
		System.out.println(m);
		m.remove("hong");
		System.out.println(m);
		
		//Map 여러개의 자료형 사용 가능.
		Map<String,Integer> m2 = new HashMap<>(); 
		
		m2.put("age", 32);
		m2.put("level", 5);
		
		System.out.println(m2);
		
		System.out.println(m2.keySet()); //키만 출력
		System.out.println(m2.values()); //값만 출력
		System.out.println(m2.containsKey("age"));
		//해당 키가 있는지 확인 (False: 없음, true: 있음)
		
		
	}
}
