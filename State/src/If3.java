
public class If3 {

	public static void main(String[] args) {
		
		//boolean : true�� false�� ���� �ϳ��� ���еǴ� ��ɾ�
		
		boolean ck = true; 
		
		if(ck==true) {
			System.out.println("ȸ�������� ����˴ϴ�.");
		}
		else {
			System.out.println("�̿����� �����ϼž߸� ����˴ϴ�.");
		}
		
		
		String name, pass; 
		name= "park";
		pass = "a1234";
		
		//&& : and ��ȣ �� ���� ���� �̻� ��� ������ �� 
		//|| : or ������ ��ȣ �� ���� ���� �̻󿡼� �� ���� ���� ���
		
		if(name=="park" && pass=="a1234") {
			System.out.println("�α��� �ϼ̽��ϴ�.");
			
		}
		else {
			System.out.println("���̵� �� �н����带 Ȯ���ϼ���");
		}
		
		
		if(name=="park" || name=="kim")
			// if(name=="park" || pass=="a1234") // �� ���� ���� �߿� �� ������ ���� ��� �߻��ϰ� ��, �߸� �� ��ȣ ���.
			
		{
			System.out.println("ȸ������ Ȯ�εǾ����ϴ�.");
		}
		
		else {
			System.out.println("Ȯ�ε� ȸ���� �����ϴ�.");
		}
		
		
		
		
	}

}
