import java.util.Arrays;
import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		/*
		 * �迭����+�⺻(Ŭ����)�޼ҵ� ���� :
		 * ����ڰ� ���� ������ ���� �Է��ϰ� �˴ϴ�.
		 * "�б� �л� �̸��� �Է����ּ���"
		 * ������ �� �迭�����ʹ� 5���� �����Ǿ����ϴ�.
		 * ������ �޼ҵ忡�� �ش� ����ڰ� �Է��� ���� �迭�� �����Ͽ�
		 * ����Ͻÿ�
		 * ex) ����ڰ� �Է��� ����: hong kim park lee jang
		 * ��� - [hong,kim,park,lee,jang]
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		int f;
		Example4 ex = new Example4();
		String list = "";
		
		for(f=0;f<5;f++) {
			System.out.println("�б� �л� �̸��� �Է����ּ���");
			String name = sc.next();
			list += name+" ";
			
		}
		ex.input(list);
		ex = null;
		sc.close();
	}

	public void input(String a) {
		String userin[] = a.split(" ");
		//split: ���ڿ� �Ǵ� ���ڿ��� Ư������ �������� �迭�� ���� �� �ִ� ��ɾ��Դϴ�.
		System.out.println(Arrays.toString(userin));
		
	}
	
}
