import java.util.Scanner;

public class Scan2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		System.out.println("���̵� �Է��ϼ���");
		String mid = a.next();
		//System.out.println(mid); //�߰� �׽�Ʈ
		a.close();
		if(mid.equals("kim")||mid.equals("hong")) {
			// ���ڿ� ���´� scanner �̿� �� equals��� �Լ��� �߰��� ����ؾ���.
			System.out.println("ȸ���� Ȯ�εǾ����ϴ�.");
		}
		else {
			System.out.println("ȸ���� Ȯ�ε��� �ʽ��ϴ�.");
		}
	}

}
