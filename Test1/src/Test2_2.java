import java.util.Scanner;

public class Test2_2 {

	public static void main(String[] args) {
		/*
		 * [����2] �˻��� ����� �̸��� �˻��ϰ� �˴ϴ�. (���� �޼ҵ忡�� ����)
		 * 
		 * ����� ����Ʈ�� ������ �����ϴ�. (�ܺ� Ŭ���� �� �ܺ� �޼ҵ忡�� ����) ������, �ǿ�ȯ, �ݻ���, �赿��, �����, ������, ����ȣ,
		 * ����
		 * 
		 * �ش� ����Ʈ ������ ������ �޼ҵ� ���� �����ؾ� �մϴ�. ����ڰ� �Էµ� �̸��� ���� ��� "�ش� ����ڰ� �ֽ��ϴ�." ��� ����ϰ� ����
		 * ��� "�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�." ��� ����մϴ�.
		 * 
		 * ��Ʈ : ���θ޼ҵ忡�� Scanner �۵� �ϸ�, ������ �˻��� �ܺ� Class �� �ܺ� �޼ҵ忡�� ó��
		 * 
		 * 
		 */

		test1 t = new test1();
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��� ����� �Է��ϼ���");
		String name = sc.next();
		t.setter(name);
		sc.close();
		
	}

}

class test1{
	
	String userdb[] = {"������","�ǿ�ȯ", "�ݻ���", "�赿��", "�����", "������", "����ȣ","����"};
	String msg="�ش� ����ڴ� ���� ���� �ʾҽ��ϴ�.";
	
	public void setter(String a) {
		
		int w = 0;
		
		
		while(w<this.userdb.length) {
			
			if(a.equals(userdb[w])) {
				this.msg = "�ش� ����ڰ� �ֽ��ϴ�.";
				break;
			}
			
			w++;
		}
		System.out.println(msg);
	}
	
	
	
}
