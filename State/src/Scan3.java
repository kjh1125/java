import java.util.Scanner;

public class Scan3 {

	public static void main(String[] args) {
		/* Q. ����ڰ� ���ϴ� ���ڸ� �Է��ϼ���
		 * ������� : ¦��, Ȧ�� ���Դϴ�. ��� ���
        */
		
		
		Scanner a = new Scanner(System.in); //�������� ctrl+space�� �ҷ�����, �Լ� ��ҹ��� ���� �ʼ�.
		System.out.println("���ϴ� ���ڸ� �Է��ϼ���");
		int b = a.nextInt();
		int c = b%2;
		a.close();
		// %�� ���� �����鼭 ������ ���� Ȯ���ϴ� ���ı�
		if(c==0) {
			System.out.println("¦�����Դϴ�.");
		}
		else{
			System.out.println("Ȧ�����Դϴ�.");
		}
	}

}
