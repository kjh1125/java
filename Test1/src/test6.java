
public class test6 {

	public static void main(String[] args) {
		user1 u1 = new user1();
		user2 u2 = new user2();
		
		u1.id();
		u2.id();
	

	}

}




class user1 implements test6_1{
	@Override
	public void id() {
		System.out.println("ȫ�浿�� ȯ���մϴ�.");
		
	}
	
	
}

class user2 implements test6_1{
	
	@Override
	public void id() {
		System.out.println("�̼��Ŵ� �ֹ��Ͻ� ������ �����ϴ�.");
		
	}
	
}


