import java.util.Scanner; 
//import: java�� �ִ� ������ �ε��� �� ����ϴ� ���
//export: java�� �ִ� ������ ������ �� ����ϴ� ���
//java.util ��Ű�� �ȿ� Scanner Ŭ���� �κ��� �ε��ϰ� �˴ϴ�.
//java.util ��Ű���� �׳� ������� ���ϸ� new�� �Ҵ��׿� �����ڸ� ����Ͽ��� ��.
//��, �ش� �ڵ� ��ġ�� �ۼ��ڵ庸�� �Ʒ��� ������ �� �˴ϴ�. // ex)import�� ������ �ڵ尡 �ۼ��ڵ� ���� �־�� ��.

public class If4 {

	public static void main(String[] args) {
		
		//new : ��ü�� �����ϴ� ��
		Scanner a = new Scanner(System.in);
		//System.in(�Է�) != System.out(���)
		System.out.println("���̵� �Է��ϼ���");
		a.close();
		String mid = a.next();
		//next(): ����ڰ� �Է��ϴ� ���¸� ���� (����, ���ڸ� �Է¹޴� ����)
	    System.out.println(mid);
	
	}			
}
