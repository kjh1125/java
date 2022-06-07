
public class Method6 {

	public static void main(String[] args) {
		// Private에 대한 객체 선언 형태 2
		
		insert i = new insert();
		
		i.userid = "admin";
		String skey = "a1234567";
		String result = i.checks(skey);
		System.out.println(result);
	}

}

class insert{
	String userid=null;
	private String key = "a123456";
	
	public String checks(String bb) {
		
		
		String msg = null;
		if(key.equals("a1234567")) { // 해당 키값(private)과 외부 class 에서 넘어오는 인수값과 비교
			if(userid.equals("hong")) { // ID 확인.
				msg ="데이터를 확인 중에 있습니다.";
			}
			else {
				msg ="해당 데이터 값을 확인하지 못 합니다.";
			}
		}
		else { // 외부 class에서 올바르지 않은 키값이 오는 경우
			msg ="error";
		}
		
		return msg; //최종 결과 retrun으로 회신
	}
}
