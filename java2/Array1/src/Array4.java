import java.util.Arrays;

public class Array4 {

	public static void main(String[] args) {
		String[] names = new String[3]; // ���� ���� �迭 // ������ ��������.
		
		String m[] = {"ȫ�浿","�̼���","������"}; //�迭���� �����Ͱ� �ִ� ����
		// System.out.println(names[0]); 
		int ct = 0; //foreach���� �ε��� ��ȣ�� �����Ƿ� �ε�����ȣ�� ���� �������ֱ� ���� ���� ������ �ʿ���.
		for(String a:m) {
			if(a.equals("ȫ�浿")||a.equals("������")) { 
		    //�ش� (����)�迭�� �� ���ǿ� �´� ���� �߷��� ���ο� �迭���� �߰���.
			System.out.println(ct);
			names[ct] = a;
			ct++;//�ε��� ��ȣ�� ���������� �����ϱ� ���� ������.
			}
		}
		// int name_ea=names.length;
		System.out.println(Arrays.toString(names));

		/*����ڰ� ��ٱ��Ͽ� ������ �����ϰ� �˴ϴ�.
		 * ��, �ش� �ݾ� ����Ʈ�� ������� ���� ���� ��ü ���� �ݾ׸� ��µǵ��� �մϴ�.
		 * 
		 * 1500,22000,13000,14500,113800,45000
		 */
		
		int[] a = {1500,22000,13000,14500,113800,45000};
		
		int b;
		int c = a.length;
		int total=0;
		for(b=0;b<c;b++) {
			total+=a[b];
			
		}
		System.out.println(total);
	
	}

}
