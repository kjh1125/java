
public class Method3 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * �μ��� 2���� ���ڸ� �����Ͽ� ���ǵ��� �մϴ�.
		 * ���� ��갪�� �޾Ƽ� ����� ����Ͻÿ�.
		 * 157,45
		 * 157*45
		 * ���� ����� ���:
		 */
		
		cal ca = new cal();
		int total = ca.num(157, 45);
		//System.out.printf("��������� ���: %d\n",total);
		ca.num2();
		ca.num();
		/*
		 * ���빮�� ���� ���� �ϳ��� �ش� �޼ҵ�� �����ϰ� �˴ϴ�.
		 * �ش� �޼ҵ忡���� ������ ���� ó���մϴ�.
		 * ���� 3�� �����ϸ� 3*1~3*9������ ��� ������� ���Ͽ� 
		 * sysout���� ��µǵ��� �Ͻʽÿ�.
		 */
		int total2 = ca.num2(3);
		System.out.println(total2);
		
		String ck = ca.mb("hong1");
		System.out.println(ck);
	}

}
class cal{
	
	public int num(int a,int b)
	{
		int total1 = a*b;
		return total1;
		
	}
	public void num() {
	//	System.out.println("test");
	}
	
	public void num2() {
		int z = num(100,200);
		//System.out.println(z);
	}
	//�ݺ��� �ȿ� return �Լ� ��� �Ұ�.
	public int num2(int a) {
		int f;
		int sum= 0;
		
		for(f=1;f<10;f++) {
			sum += a*f;
		}
		return sum;
		// ���ǹ��̶�� �ص� �ߺ����� return ��� �Ұ�.
	}
	public String mb(String mid) {
		String msg;
		String msg2 = "ȫ�浿";
		if(mid.equals("hong")) {
			msg = "ok";
		}
		else {
			msg = "cancel";
		}
		return msg+msg2; 
		//�ش� �޼ҵ忡 ������ ���� �� ���ǿ� �´� ���� �����Ͽ� �������� ���� return ��Ŵ.
	}
	
}
