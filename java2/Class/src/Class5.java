import java.util.Scanner;

public class Class5 {

	public static void main(String[] args) {
		Member2.lists2(); //�޸𸮿��� �ٷ� �ε�
		Member2 mb2=new Member2();
		// static�� ���� �Լ��� �� ��ü �� �ν��Ͻ��� ����
		mb2.lists(); //�ν��Ͻ�(�޸�)�� �ִ� �޼ҵ带 �ε��ϰ� ��.

		Member2.lists3("������",123456);

		/*
		 * ���빮�� for_in�̶�� �Ϲ� �޼ҵ�(�޸�)�� �ֽ��ϴ�.
		 * ���α׷� ���� �� ������ ���� ������ �մϴ�.
		 * "����Ͻ� ������ ���ڸ� �ϳ� �Է����ּ���."
		 * [���] - �ش� �޼ҵ忡�� ����� ����ؾ� ��.
		 * ex)���
		 * ����ڰ� 3���� �Է� �� 
		 * 3*1=3.... 3*9=27 ��µǾ�� ��. // �ݺ��� for�� ���.
		 */
		Scanner sc = new Scanner(System.in);
    	System.out.println("������ ���ڸ� �ϳ� �Է����ּ���.");
    	int sc1 = sc.nextInt();
		
		Member2.for_in(sc1);
		sc.close();
	}

}

class Member2{
	
	public void lists() { //�޸𸮿� ������ �Ҵ� ���� �޼ҵ��Լ��� ����
		String a = "ȫ�浿";
	//	System.out.println(a);
	}
    public static void lists2() { //�޸𸮿� �Ҵ�(static)�ϴ� �޼ҵ��Լ�
    	String a = "�̼���";
    	//System.out.println(a);
    }
    public static void lists3(String nm, int pw) {
    	//nm�� �޼ҵ忡�� ���� �޴� ������ �ٷ� ����� ���.
    	int user_pw = pw; 
    	//�޼ҵ��� ��ü���� ÷���Ͽ� �ε� �� �޼ҵ� �ȿ� ������ �ʵ���� �̿��Ͽ� ���� �޴� ����
    	if(nm.equals("������")&&user_pw==123456) {
    	//	System.out.println("ȸ��Ȯ���� �Ǿ����ϴ�.");
    		}
    	else {
    	//	System.out.println("��ȸ���Դϴ�.");
    	}

    }
    
    public static void for_in(int a) {
    	
    	
    	int f; // �ݺ���
    	int a1=a; //���� ��
    	int total; //��
    	
    	for(f=1;f<10;f++) {
    		total = f*a1;
    		System.out.printf("%d*%d=%d, ",f,a1,total);
    	}
    	
    	
    }
}