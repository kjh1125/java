
public class Exception5 {

	//����: �� �ְ� ��¸� ��
	public static void main(String[] args) { 
		
		try {
			words wd = new words();
			String result = wd.files("");
			System.out.println(result);
			
		} catch (Exception e) {
			
			
			if(e.getMessage()!=null) {
			System.out.println(e);
			}
			}
		finally {
			try {
				words wd1 = new words();
				String result1 = wd1.files("ȫ�浿");
				System.out.println(result1);
				
			} catch (Exception e2) {
				System.exit(0);
			}
		}
		
	}
}


class words{
	//����: ���� �ް� ���� �� return
	public String files(String aa) throws Exception {
		
		if(aa==null || aa.equals("")) {
			
			throw new Exception("���̺������");
		}
		else {
			String msg = aa+"�� ȯ���մϴ�";
			return msg;
		}
	}
}