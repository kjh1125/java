import java.util.Scanner;

public class Example10 {

	public static void main(String[] args) {
		/*
		 * ���빮�� 10
		 * ���� �̿����� ���� ���� ���α׷� ����
		 * ���� �׸��� ��ü 3�����̸� ��� ����(True)�Ͽ��߸� ���� ���μ����� ����
		 * "�����׸� �����Ͻðڽ��ϴ�.?" ���� 1, ���� �� �� 2
		 * 
		 * �ϳ��� �������� ���� ���
		 * "��� �����ϼž߸� ����˴ϴ�" ��� ���.
		 * ��� �����Ͽ��� ���
		 * "ȸ�������� �Ϸ�Ǿ����ϴ�."��� ���.
		Scanner sc = new Scanner(System.in);
		Boolean a,b,c;
		a= false;
		b= false;
		c= false;
		
		byte e = 1;
		
		while(e<4) {
		
			if(e==1) {
				System.out.printf("%d�� �׸� �����Ͻðڽ��ϱ�? ���� 1��, ���� �� �� 2��\n", e);
				byte d = sc.nextByte();
				if(d==1) {
					a = true;
				}
			}
			else if(e==2) {
				System.out.printf("%d�� �׸� �����Ͻðڽ��ϱ�? ���� 1��, ���� �� �� 2��\n", e);
				byte d = sc.nextByte();
				if(d==1) {
					b = true;
				}
			}
			
			else if(e==3) {
				System.out.printf("%d�� �׸� �����Ͻðڽ��ϱ�? ���� 1��, ���� �� �� 2��\n", e);
				byte d = sc.nextByte();
				if(d==1) {
					c = true;
				}
			}
		e++;
		}
		
		if(a==true&&b==true&&c==true){
			System.out.println("ȸ�� ������ �Ϸ�Ǿ����ϴ�.");
		}
		else{
			System.out.println("��� �����ϼž߸� ����˴ϴ�");
		}
		
		sc.close();
		 */
		
		Scanner sc = new Scanner(System.in);
		int w = 1;
		int agree;
		boolean all_agree = false;
		
		do {
			System.out.println("����? ���� (1��), ���� ���� (2��)");
			agree = sc.nextInt();
			
			if(agree==1) {
				all_agree = true;
			}
			else {
				all_agree = false;
				break;
			}
			
			w++;
		}while(w<4);
		
		if(all_agree==false) {
			System.out.println("��� �����Ͽ��߸� ����˴ϴ�.");
		}
		else {
			System.out.println("ȸ�������� �Ϸ�Ǿ����ϴ�");
		}
		sc.close();
	}

}
