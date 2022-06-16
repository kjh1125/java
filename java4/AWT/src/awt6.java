import java.util.Random;

//인증번호 발송 시스템 -awt6_abstract 연계
public class awt6 {
	
	public static void main(String[] args) {
		
		system s = new system();
		s.design();
		
	}

}

class system extends awt6_abstract{
	
	private int result=0;
	
	@Override
	public void rdnumcreate() {
		Random r = new Random();
		String a="";
		int w =0;
		
		while(w<4) {
			a+=r.nextInt(9)+1;
			w++;
		}
		this.result = Integer.parseInt(a);
		System.out.println(this.result);
		
	}
	
	@Override
	public void check(int a) {
		
		if(this.result==a) {
			msg.setText("인증이 완료되었습니다");
		}
		else if(this.result==0) {
			msg.setText("인증번호발송을 눌러주세요");
		}
		else {
			msg.setText("인증번호를 다시 확인하시기 바랍니다");
		}
		
	}
	
}