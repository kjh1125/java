import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ���� ���� �迭 ������ ���� �ֽ��ϴ�.
		 * a1 : "ȫ�浿","�̼���","������","������","������"
		 * a2 : "100","80","39","60","55"
		 * 
		 * "�˻��ϰ��� �ϴ� �̸��� �����ּ���" ���.
		 * �˻����� �̼����̶�� �˻��ϰ� �Ǹ� 
		 * "�̼��Ŵ��� 80�� �Դϴ�." ��� ����� �Ǿ�� �մϴ�.
		 * 
		 */
		
		String a[][] = {
			{"ȫ�浿","�̼���","������","������","������"},
			{"100","80","39","60","55"}
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻��ϰ��� �ϴ� �̸��� �����ּ���");
		String name = sc.next();
		
		data d1 = new data();
		d1.list(a,name);
		
		sc.close();
		d1 = null;

	}

}

class data{
	public void list(String a[][],String b) {
		
		String a1[][] = a; //main���� ������ 2�� �迭 ��
		String b1 =b; // Scanner�� �Է��� �̸�
		int w = 0; // ū �ݺ��� �ݺ�Ƚ��
		int aea = a1.length; //�迭�� ����
		int aea1 = a1[0].length; //�迭������ ����
		String msg=null; 
		
		while(w<aea) { //2�� �ݺ�
			int ct=0;
			
			while(ct<aea1) {// 5�� �ݺ� 
				if(b1.equals(a1[0][ct])) {
					msg = b1+"���� ������ "+a1[1][ct]+"���Դϴ�";
					break;
				}
		
			ct++;
			}
			
			w++;
		}
		System.out.println(msg);
		
		
	}
}
