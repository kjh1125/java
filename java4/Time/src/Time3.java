
public class Time3 {

	public static void main(String[] args) {
		/*
		try {
			System.out.println("��������");
			Thread.sleep(5000);
			System.out.println("��������");
		}catch(InterruptedException e){
			System.out.println(e);
		}
		*/

		/*
		 * ���빮�� �ܺ�Ŭ����O
		 * ����Ŭ�������� �ش� �ܺ� Ŭ������ �ε��ϸ� �ش� �޼ҵ忡�� �ﰢ������ 8�ʰ� �ε��� �߻�
		 * 8�� ���� "ó�����Դϴ�. ��ø� ��ٷ��ּ���"
		 * 8�� ���Ŀ� return���� "�Ա��� ��� ó���Ǿ����ϴ�" ��� ���ڸ� �޵��� �Ͻʽÿ�.
		 */
		test t = new test();
	
		
	}

}
class test{
	public test() {
		try {
			System.out.println("ó�����Դϴ�. ��ø� ��ٷ��ּ���");
			Thread.sleep(8000);
			String kkk = this.msg();
			System.out.println(kkk);
		}catch(InterruptedException e){
			System.out.println("���ܹ߻�"); // try������ ������ �߻��ϴ� ��� ex)int c=1/0  
		}
	}
	public String msg() {
		return "�Ա��� ��� ó���Ǿ����ϴ�.";
	}
}
