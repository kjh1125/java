import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * {5,10,15,20,25,30,35}
//		 */
//		
//		Scanner sc = new Scanner(System.in);
//		int data[] = {5,10,15,20,25,30,35};
//		/*
//		 * foreach���� ����� ���� �ε��� ��ȣ�� �ʿ���� ����� ���
//		 * for,do~while�� ����� ���� �ε��� ��ȣ�� �ʿ��� �� ���
//		 * [0][1][2] : �ε��� ��ȣ
//		 */
//		
//		for(int f:data) { // int f�� ���������� data �迭���� �޾Ƽ� �����Ŵ.
//			if(f%2==0) {
//		//	System.out.print(f+",");
//			}
//		}
//		
//		String pay[] = {"�������Ա�","�ſ�ī��","�޴���","��ǰ��","����"};
//		
//		//System.out.println("�����ϰ��� �ϴ� ���¸� �������ּ���.");
//		//String pm=sc.next();
//		
//		for(String z:pay) { //�迭 �����Ͱ� �����̹Ƿ� �޴� �������� ���� �������� ����ؾ� �մϴ�.
//		//	if(pm.equals(z)) {
//				
//				if(z.equals("�޴���")) {
//					//System.out.println("���� �ý��� �������� �ش� ������ ����Ͻ� �� �����ϴ�.");
//				}
//				else {
//					//System.out.println(pm+"(��)�� ���� ����˴ϴ�.");
//				}
//			}
//			
//		//sc.close();
//	
//		/*
//		 * ���빮��
//		 * {"�ܹ���","����","ġŲ","Ŀ��"};
//		 * 
//		 * "�ֹ��ϰ��� �ϴ� ������ �������ּ���."
//		 * �ش� ������ �� 4���� ����� �˴ϴ�.
//		 * ��, "�ֹ�����"��� ����ڰ� �Է� �� �� ��� �ֹ��� ����Ǹ�,
//		 * �ֹ������� ����Ͻø� �˴ϴ�.
//		 * 
//		 */
		
		String menus[] = {"�ܹ���","����","ġŲ","Ŀ��"};
		Scanner sc1 = new Scanner(System.in);
		String user_menu[]= new String[4];
		String user;
		int ct =0;
		
		for(String f:menus) {
			/*
			 * Scanner�� �ݺ��� �ȿ� ����� �� loop�� ������ �ݺ������� ����.
			 * ����ڰ� �Է��� ������ �ݺ��� ������ŭ ����ϴ� ������. 
			 */
			
			System.out.println("�޴��� ����");
			user = sc1.next(); // �ݺ��� �ȿ� �Է��� ���� ��� �ݺ��� ���� �ʰ� 1ȸ�� �۵���, ��� ����� �۵���Ű���� 
			//�ݺ��� �ȿ� ���ǹ��� ���Խ��������.
			
			if(user.equals("�ֹ�����")) {
				break;
			}
			else {
				for(String ff:menus) {
					if(user.equals(ff)) {
						user_menu[ct]=ff;
						ct++;
					}
				}
			}
			
			
			
		}
		System.out.println("�ֹ��Ͻ� �޴��� ������ �����ϴ�."+Arrays.toString(user_menu));
			
		sc1.close();
		}
	
	}
		

		

