import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * {5,10,15,20,25,30,35}
		 */
		
		int data[] = {5,10,15,20,25,30,35};
		/*
		 * foreach���� ����� ���� �ε��� ��ȣ�� �ʿ���� ����� ���
		 * for,do~while�� ����� ���� �ε��� ��ȣ�� �ʿ��� �� ���
		 * [0][1][2] : �ε��� ��ȣ
		 */
		
		for(int f:data) { // int f�� ���������� data �迭���� �޾Ƽ� �����Ŵ.
			if(f%2==0) {
		//	System.out.print(f+",");
			}
		}
		
		String pay[] = {"�������Ա�","�ſ�ī��","�޴���","��ǰ��","����"};
		Scanner sc = new Scanner(System.in);
		//System.out.println("�����ϰ��� �ϴ� ���¸� �������ּ���.");
		//String pm=sc.next();
		
		for(String z:pay) { //�迭 �����Ͱ� �����̹Ƿ� �޴� �������� ���� �������� ����ؾ� �մϴ�.
		//	if(pm.equals(z)) {
				
				if(z.equals("�޴���")) {
					//System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
				}
				else {
					//System.out.println(pm+"(��)�� ���� ����˴ϴ�.");
				}
			}
			
		//sc.close();
	
		/*
		 * ���빮��
		 * {"�ܹ���","����","ġŲ","Ŀ��"};
		 * 
		 * "�ֹ��ϰ��� �ϴ� ������ �������ּ���."
		 * �ش� ������ �� 4���� ����� �˴ϴ�.
		 * ��, "�ֹ�����"��� ����ڰ� �Է� �� �� ��� �ֹ��� ����Ǹ�,
		 * �ֹ������� ����Ͻø� �˴ϴ�.
		 * 
		 */
		String menu[] = {"�ܹ���","����","ġŲ","Ŀ��"};
		String[] total= new String[4];
		
			int ct=0;
			
			for(String x:menu) {
				
				System.out.println("�ֹ��ϰ��� �ϴ� ������ �������ּ���.");
				String ans = sc.next();
				
				if(ct==4||ans.equals("�ֹ�����"))
				{
					System.out.println(Arrays.toString(total));
				break;
				}
				else if(ans.equals(x)){
				total[ct]=ans;
				}
				ct++;
			}
		
			
		sc.close();
		}
	
	}
		

		

