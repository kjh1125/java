import java.util.ArrayList;
import java.util.Arrays;

public class Class4 {

	public static void main(String[] args) {
		/*
		 * �迭������: ȫ�浿, �̼���, ������ ������ ������ ����.
		 * ���� class���� ���ڸ� �ϳ� �����մϴ�.
		 * ��, ���ڰ� null�̳� �迭 �����Ϳ� ������� "������"������ �� ���� ����.
		 * �ܺ� Ŭ������: data_list
		 * �߻� Ŭ������: v_constuct
		 * �ܺ� Ŭ���� -> ���� Ŭ������: check
		 * 
		 * [�������]
		 * ���� Ŭ�������� �������� ������ ��� 
		 * ���� Ŭ�������� "�ش� ����ڴ� �����ڰ� �ƴմϴ�" ��� ���
		 * ���� Ŭ�������� �̼����� ������ ���
		 * ���� Ŭ�������� "�ش� ����ڰ� �ֽ��ϴ�" ��� ���
		 * ��, ArrayList�� �迭�� �ε��Ͻÿ�.
		 */
		
		data_list d = new data_list();
		d.userinput("�̼���");

	}

}

abstract class v_constuct{
	
	String user_name;
	public abstract void userinput(String a);
}

class data_list extends v_constuct{
	
	@Override
	public void userinput(String a) {
		if(a==null) {
			System.out.println("����� �̸��� �Է��ϼž� �մϴ�.");
		}
		else {
			this.user_name = a;
			check ck = new check(); // ȣ���� �ʿ��� ���� �ϴ� ����
			ck.db();	
		}
	}
	
	class check{
		String user_name = data_list.this.user_name; //�θ�Ŭ�������� ���� ���� �ڽ�Ŭ������ �̰�
		String data_list[]; //�ʵ忡 �迭�� �޴� ��ü ����
		ArrayList<String> ar = null; // ArrayList util�� �ʵ忡 ��ü ����
		
		public void db() {
			//�ش� �ʵ忡 �ִ� ArrayList�� �ν��Ͻ��� ����
			this.data_list = new String[] {"ȫ�浿","�̼���","������"};
			this.ar = new ArrayList<>(Arrays.asList(this.data_list)); // this�� ó��
			this.compare(); //db�� ����� ������ ���ϴ� �޼ҵ� ����.
		}
		
		public void compare() {
			int ea = this.ar.size();
			int w = 0;
			String msg ="";
			boolean bl = false; //��� Ȯ�� �۾�
			
			do{
				
				if(this.ar.get(w).equals(this.user_name)) {
					msg = "�ش� ����ڰ� �ֽ��ϴ�" ;
					bl = true;
					break;
				}
				
				w++;
			}while(w<ea);
			
			if (bl==false) {
				msg = "�ش� ����ڴ� �����ڰ� �ƴմϴ�";
			}
			
			System.out.println(msg);
			
		}
		
	}
	
}


