
public class Double_loop3 {

	public static void main(String[] args) {
		
		/*
		 * ���빮��
		 * ���� ��� ���� ��µǵ��� for������ �ۼ��Ͻÿ�.
		 * 5+2=7
		 * 5+3=8
		 * 5+4=9
		 * 5+5=10
		 * 6+2=8
		 * 6+3=9
		 * 6+4=10
		 * 6+5=11
		 * 7+2=9
		 * 7+3=10
		 * 7+4=11
		 * 7+5=12
		 * ...
		 * 9+5=14
		 */

		int f, ff;
		
		for(f=5;f<=9;f++) {
			
			for(ff=2;ff<=5;ff++) {
				
				//System.out.println(f+"+"+ff+"="+(f+ff));
				
			}
			
		}
		
		/*
		 * ���빮�� double-while������
		 * 9~7 // 7~5
		 * ���ϱ��
		 * 
		 */
		
		int w = 9;
		
		while(w>=7) {
		
			int ww = 7;
			
			while(ww>=5) {
				int sum = w*ww;
				//System.out.println(w+"*"+ww+"="+sum);
				
				ww--;
			}
			w--;
		}
		

	/*
	 * ���빮��
	 * �����(do~while��)
	 * 5~3
	 * 4~7 
	 * +�� ó��
	 * 
	 */
	
int dw=5;
	do {
		int ddw=4;
		do {
			int sum=dw+ddw;
			System.out.println(dw+"+"+ddw+"="+sum);
			
			ddw++;
		}while(ddw<=7);
		
		dw--;
	}while(dw>=3);
	
}
	
}
