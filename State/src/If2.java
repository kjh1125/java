
public class If2 {

	public static void main(String[] args) {
		
		String mid1 = "hong"; 
		String mid2 = "kim";
		String mpass = "a123456"; // ��й�ȣ�� Ư������ ������ �ִ� ���� - �νĿ���, �����ͺ��̽����� �ٸ� ���ڷ� �߸� �޾Ƶ���.
		
		//�ش� ���ǹ��� ���ڷ� Ȯ���ϴ� ���������̸� else if���� ������� �ʰ� else������ �����ϴ� �κ�.
		
		if(mid1=="hong") {
			System.out.println("ȯ���մϴ�.");
		}
		else if(mid1=="park") { // �߰��� �񱳴���� ���� ���
			System.out.println("ȯ���մϴ�.");
		}
		else {
			System.out.println("���Ե��� ���� ������Դϴ�.");
		}
		
		//���̵� �� �н����带 ��� �����ϴ� ���� ���ǹ�
		
		if(mid2=="kim") { // ū if��
			
			// ���� if��
			if(mpass=="a123456") {
				System.out.println("�α��� �ϼ̽��ϴ�.");
				
			}
			else {
				System.out.println("�н����尡 Ʋ���ϴ�.");
			}
			
		}
		
		else {
		System.out.println("���Ե��� ���� ������Դϴ�.");	
		}
	}

}