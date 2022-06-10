
public class Test5 {

	public static void main(String[] args) {
		int w=1;
		int total=0;
		
		while(w<101) {
			
			if(total<4000) {
				total+=w;
			}
			else {
				System.out.println(total);
				System.exit(0);
			}
			w++;
		}

		System.out.println(total);
	}

}
