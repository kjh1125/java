
public class Test3 {

	public static void main(String[] args) {
		
		int total=0;
		
		int w = 1;
		
		while(w<6) {
			int ww=1;
			while(ww<10) {
				
				total += w+ww;

				ww++;
			}
			
			w++;
		}

		System.out.println(total);
		
	}

}
