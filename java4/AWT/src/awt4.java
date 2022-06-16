public class awt4 {

	public static void main(String[] args) {
		//awt4_class.java와 연계
		
		decorate de = new decorate();
		de.view();

	}

}

class decorate extends awt4_class {
	public String aws ="";
	
	public void btn_push(int c) {
		// 사용자가 입력한 숫자를 기준으로 구구단을 작성하세요
		int w = 1;
		while(w<10) {
			
			this.aws+=c+"*"+w+"="+c*w+"\n";
			w++;
		}
	}
	
	public String calls() {
		return this.aws;
	}
	
	
}



