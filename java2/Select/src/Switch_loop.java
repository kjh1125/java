
public class Switch_loop {

	public static void main(String[] args) {
		
		String sign="*";
		int total;
		/* case �ȿ� ������ �ݺ����� ����� �� �ս��ϴ�.
		 * ������ ������ ����ص� �Ǹ�, case�� ���� �ٸ��� �۵��ϱ� ������ ������ ���� �ʽ��ϴ�.
		 * ��, case�� �ϳ��� ������ ���� ��� ������ case�� �۵����� �ʽ��ϴ�.
		 */
		int dw=1;
		
		
		switch(sign) { // switch ������ ����� �ȿ� �־�� ��. 
		// �ش� �� ���� ��� ó���� total ���� ���� ������ �ۿ� ��¹��� ���� ��� �����߻� 
		case "+" ->{
		int f;
		total=0;
		for(f=1;f<=5;f++) {
			total+=f;
		}
		System.out.println(total);
		}
		case "-" ->{
			total=0;
			System.out.println("�������� ��µ��� �ʽ��ϴ�.");
		}
		case "*" ->{
			total=1;
			do {
				total*=dw;
				dw++;
			}while(dw<=5);
			System.out.println(total);
		}
		case "/" ->{
			total=0;
		}
		
		}
		
		
	}

}
