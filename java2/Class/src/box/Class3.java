package box;

public class Class3 {

	public static void main(String[] args) {
		//�ڷ���(��������) ��ȯ
		//double -> int�� ��ȯ
		double a = 137.5;
		int b = (int)a; // 
		
		//int -> double�� ��ȯ
		int c = 35;
		double d = 0.1*(double)c;
		System.out.println(d);

		//String -> int
		String x = "35";
		String x2 = "156";
		//int z = Integer.parseInt(x); //parseInt(int ���� ����ϴ� �������) 
		//������(String, char)���� �� ���ڸ� ������(int, double��)���� �ٲ� �� 
		//�ܵ� �����ϱ� ������ valueof ��ɾ ���� �ӵ��� ����
		int z = Integer.valueOf(x); 
		// ���� ���� �������� valueof �޼ҵ�(�޼ҵ��Լ�) -> parseInt�� ���ļ� �۵��Ǿ� �ӵ��� ������
		// ���ڿ� ���� ������ ���ڸ� ������ �� ����� �� ����.
		int total = Integer.parseInt(x)+Integer.parseInt(x2); 
		// �������� ���ڷ� ��ȯ�Ͽ� �������� ó����.
		System.out.println(total);
		
		String j = "923456789";
		String j2= "9234567892"; //int�δ� 10����� �̻� X 
		
		//int total2 = Integer.parseInt(j)+Integer.parseInt(j2);
		//Long ��� �� Long.parseLong ���.
		Long total2 = Long.parseLong(j)+Long.parseLong(j2);
		double total3 = (double)total2;
		System.out.println(total3);
		
		//����(char) -> ����(String) : �⺻�������θ� �˰� ������ ��.
		char p = '��'; // char ��� �ÿ��� '���.
		String f = String.valueOf(p); //���� -> ���� // String���� parse�� ���� valueof�� ����.
		
		System.out.println(f);
		
	}

}
