import java.util.Random;

//������ȣ �߼� �ý��� -awt6_abstract ����
public class awt6 {
	
	public static void main(String[] args) {
		
		system s = new system();
		s.design();
		
	}

}

class system extends awt6_abstract{
	
	private int result=0;
	
	@Override
	public void rdnumcreate() {
		Random r = new Random();
		String a="";
		int w =0;
		
		while(w<4) {
			a+=r.nextInt(9)+1;
			w++;
		}
		this.result = Integer.parseInt(a);
		System.out.println(this.result);
		
	}
	
	@Override
	public void check(int a) {
		
		if(this.result==a) {
			msg.setText("������ �Ϸ�Ǿ����ϴ�");
		}
		else if(this.result==0) {
			msg.setText("������ȣ�߼��� �����ּ���");
		}
		else {
			msg.setText("������ȣ�� �ٽ� Ȯ���Ͻñ� �ٶ��ϴ�");
		}
		
	}
	
}