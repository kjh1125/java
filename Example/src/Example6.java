
public class Example6 {

	public static void main(String[] args) {
		
		/*
		 * ���빮�� 6��
		 * 1~10���� ���������� �����ϴ� �ݺ����� �ֽ��ϴ�.
		 * ��, 1~5������ ��� ���� ���ϰ� 6~10������ ��� ���� ���մϴ�. 
		 * �ش� �� ���� ���� ���Ͽ� ���� ���� ū ��, ���� ���� ū ���� ����� ����Ͻÿ�
		 */
		
		int a = 1;
		int b = 1;
		int c = 0;
		
		
		while(a<=10) {
			
			if(a<=5)
			{
				b*=a;
			}
			else {
				c+=a;
			}
			a++;
		}
		System.out.println("1~5���� ���� ��: "+b+", 6~10���� ���� ��: "+c);
		if(b>c) {
			System.out.println("���� ���� Ů�ϴ�.");
		}
		else if(c>b){
			System.out.println("���� ���� Ů�ϴ�.");
		}
		else {
			System.out.println("�� �� ���� �����ϴ�.");
		}
		
		
	}
	
}
