import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�ּҸ� �Է��Ͻÿ�");
		String ad = sc.nextLine();
		System.out.println("��ȭ��ȣ�� �Է��Ͻÿ�");
		String tel = sc.nextLine();
		
		System.out.println("�ش������� Ȯ�����ּ���");
		System.out.printf("�ּ�: %s ��ȭ��ȣ: %s",ad,tel);
		
		sc.close();
		

	}

}
