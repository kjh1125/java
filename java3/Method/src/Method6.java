
public class Method6 {

	public static void main(String[] args) {
		// Private�� ���� ��ü ���� ���� 2
		
		insert i = new insert();
		
		i.userid = "admin";
		String skey = "a1234567";
		String result = i.checks(skey);
		System.out.println(result);
	}

}

class insert{
	String userid=null;
	private String key = "a123456";
	
	public String checks(String bb) {
		
		
		String msg = null;
		if(key.equals("a1234567")) { // �ش� Ű��(private)�� �ܺ� class ���� �Ѿ���� �μ����� ��
			if(userid.equals("hong")) { // ID Ȯ��.
				msg ="�����͸� Ȯ�� �߿� �ֽ��ϴ�.";
			}
			else {
				msg ="�ش� ������ ���� Ȯ������ �� �մϴ�.";
			}
		}
		else { // �ܺ� class���� �ùٸ��� ���� Ű���� ���� ���
			msg ="error";
		}
		
		return msg; //���� ��� retrun���� ȸ��
	}
}
