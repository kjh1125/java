import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * ���� �ش� ���� �ֽ��ϴ�. �ش� ���� ���� �迭�� ���� ���� �ǵ��� �մϴ�. honggildong
		 * 
		 * ��� h,o,n,g,g,i,d,o,n,g �� �迭�� ���� �Ǿ�� �մϴ�. �ش� ó���� �ܺ� class���� ó���� �ǵ��� �մϴ�.
		 * 
		 */

		test12 t = new test12();
		
		
	}

}


class test12{

	String a = "honggildong";
	ArrayList<String> b = new ArrayList<>();
	String c = "";
	public test12() {
		
		int w = 0;
		
		while(w<a.length()) {
			
			
			this.c = this.a.substring(w,w+1);
			this.b.add(this.c);  
			 

			w++;
		}
		
		
		System.out.println(b);
		
	}
	
	
}