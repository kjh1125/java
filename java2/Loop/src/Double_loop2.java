
public class Double_loop2 {

	public static void main(String[] args) {
		//while
		
		int w = 1;
		int ww;
		
		while(w<=3) {
			
			ww = 1;//���� while���� �ʱⰪ�� ū �ݺ��� �ȿ� ����.
			
			while(ww<=4) {
				//System.out.println(w+"+"+ww);

				ww++;
			}
			
			w++;
		}

		int dw=1;
		
		do {
			
			//do while�� ���� while�� ���� �ʱⰪ�� ū �ݺ��� �ȿ� ����.
			int ddw=1;
			do {
				//System.out.println(dw +"+"+ddw);
				ddw++;
			}while(ddw<=4); //���� �ݺ��� ����
			
			
			dw++;
		}while(dw<=3); // ū �ݺ��� ����
		
	}

}
