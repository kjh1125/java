
public class If_for2 {

	public static void main(String[] args) {
		// 1~100������ ���� �� 80�̻��� ���ڸ� ���
		/*
		int f;
		for(f=1;f<=100;f++) {
			if(f>=80)
			{
				System.out.print(f+" ");
			}
		}*/
		
		//200~300������ ���� �� 240������ ���ڸ� ����Ͻÿ�.
		/*
		int a;
		for(a=200;a<=300;a++) {
			if(a<=240) {
				//System.out.print(a+" ");
			}
		}
		
		final int b = 4;
		int w;
		
		for(w=1;w<11;w++) {
			if(w%b==0) {
			// System.out.printf("%d ",w);
			}
		}
		
		//���빮�� ������ �� 2���� �ݺ��մϴ�. ��, 2�� ����� �� 10�̻� ���ڸ� ����մϴ�.
		/*
		int c; //�ݺ���
		final int d=2; //��� �� 
		int e; //��� ��
		
		for(c=1;c<10;c++) {
			e=c*d;
			if(e>=10) {
			System.out.printf("%d ",e);
			}
		}
		
		
		 * ���빮��
		 * ���� ������� ���� �ش� ���� ��µǵ��� �ڵ带 �����Ͻÿ�.
		 * 18 36 54 72
		 */
		/*
		int a;
		final int b = 18;
		
		for(a=1;a<=100;a++) {
			
			if(a%b==0&&a<=72) {
			System.out.printf("%d ",a);
			}
			
		}
		
*/
		int p;
		int total3;
		
		for(p=1;p<=9;p++){
			total3 = 9 * p;
			
			if(p%2 == 0) {
				System.out.print(total3 + " ");
			}
		}
		
		
/*
		int a;
		
		for(a=1;a<=20;a++) {
			if(a==6||a==14||a==17||a==19) 
			{
				System.out.print(a+" ");
			}
		}
		
		 */
		
		
	}

}
