public class awt4 {

	public static void main(String[] args) {
		//awt4_class.java�� ����
		
		decorate de = new decorate();
		de.view();

	}

}

class decorate extends awt4_class {
	public String aws ="";
	
	public void btn_push(int c) {
		// ����ڰ� �Է��� ���ڸ� �������� �������� �ۼ��ϼ���
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



