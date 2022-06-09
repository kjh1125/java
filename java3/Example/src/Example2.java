
public class Example2 {

	private int usernum;
	private int randomnum;
	public boolean b = false;
	
	public void ex2(int a,int r) {
		usernum = a;
		randomnum = r;
		
		
		if(usernum>randomnum) {
			System.out.println("Down");
		}
		else if(usernum<randomnum) {
			System.out.println("Up");
		}
		else {
			System.out.println("Á¤´ä");
			b = true;
		}
		
	}
	
	
}
