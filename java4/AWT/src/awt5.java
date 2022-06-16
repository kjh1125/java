import java.util.ArrayList;
import java.util.Arrays;

//중복 아이디 체크 시스템 만들기 : awt_abstract와 함께 사용
//회원데이터 : hong,lee,park
public class awt5 {

	public static void main(String[] args) {
		
		handle hd = new handle();
		
		hd.design();
	}

}

class handle extends awt5_abstract{
	private String aid; //awt에서 넘어온 인수값을 클래스에서 활용하기 위한 변수
	private String return_id; 
	//awt로 다시 값을 전달하기 위해 생성한 전역 변수 
	//null일 경우 아이디 사용가능, id값이 전달되면 해당 아이디는 사용할 수 없다고 할 예정.
	
	private ArrayList<String> db = null;
	
	@Override
	public String signok() {
		return this.return_id;
	}
	
	@Override
	public void idcheck(String id) {
		//awt에서 중복 버튼을 클릭 시 해당 변수를 지속적으로 실행하여 값이 초기화 됨.
		this.return_id =null; 
		this.aid = id;
		this.dataload(); // 정상적으로 데이터가 넘어왔을 경우 해당 메소드를 로드하여 확인 
		int ea = this.db.size();
		int w = 0;
		
		while(w<ea) {
			
			if(this.aid.equals(this.db.get(w))) {
				this.return_id = this.db.get(w);
				break;
			}
			w++;
		}
		
	}
	
	@Override
	public void dataload() {
		String a[] = {"hong","lee","park","jeong","kim"};
		this.db = new ArrayList<>(Arrays.asList(a));
	}
}