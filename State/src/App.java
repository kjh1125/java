
public class App {

	public static void main(String[] args) {
	/*	
		short a, b;
		a = 25+31*4+12;
		b = 15*3+9+14;
		
		System.out.println("a��"+a);
		System.out.println("b��"+b);
		System.out.println("a�� b�� ���� �� ���");
		if(a<b) {
			System.out.println(a);
		}
		else if(a>b){
			System.out.println(b);
		}
		else {
			System.out.println("�� ���� ����");
		}
	}
    */
			
    int a = 25+31*4+12;
	int b = 15*3+9+14;
	
	if(a>b) {
		System.out.println("���� 2�� ���� �۽��ϴ�.");
	}
	else if(a<b)
	{
		System.out.println("���� 1�� ���� �۽��ϴ�.");
	}
	else {
		System.out.println("�� ���� �����ϴ�.");
	}
	
	/*
	 * 2���� 0~1 // ¦ �� Ȧ �� ���п����� ���.
	 * 8���� 0~7 // ���� ��� �� ��.
	 * 16���� 0~9 abcdef // ��ȣȭ �� ��� 	 */
	
	// �ش� ���� 2������ ¦��, Ȧ���� Ȯ���ϱ�
	
	int c = b%2; //%��ȣ ��� �� 0 �Ǵ� 1�� ������ ���� ����� ��. 
	
	if(c==0) {
		System.out.println("¦���Դϴ�.");
	}
	else {
		System.out.println("Ȧ���Դϴ�.");
	}
	
	}
}
