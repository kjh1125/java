package List1;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class list4 {

	public static void main(String[] args) {
		Integer num1[] = {3,6,9,12,15};
		LinkedList<Integer> ln = new LinkedList<>(Arrays.asList(num1));
		//�Խ��� ���� ��¸��ϴ� ��� Arrayslist ��� // ��ü ����
		//������ �ؾߵǴ� ��� LinkedList�� ���, �Է��� �������� �߰� �κ� ������ ����.
		ln.add(33);
		System.out.println(ln);

		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> list = new LinkedList<>();//����ִ� �迭
		String user;
		//for(;;):���ѷ���
		while(true) { //���ѷ���
			System.out.println("���ڸ� �Է��Ͻÿ�");
			user = sc.next();				
			try { //����ڰ� �Է��� ���� ������ �ִ��� Ȯ���ϴ� ��Ʈ
				int number = Integer.parseInt(user);
				list.add(number);
				int ea = list.size();
				if(ea>=5) { // �迭�� 5�� �̻��̸� ���ѷ����� ��������.
					break;
				}
			} catch(Exception e){ // ������ �߻��� ��� �۵��Ǵ� ��Ʈ
				System.out.println("�ش� �Է»����� �����Դϴ�");
				
			}
		}
		System.out.println(list);
		
	}

}
