import java.util.ArrayList;
import java.util.Arrays;

//�ߺ� ���̵� üũ �ý��� ����� : awt_abstract�� �Բ� ���
//ȸ�������� : hong,lee,park
public class awt5 {

	public static void main(String[] args) {
		
		handle hd = new handle();
		
		hd.design();
	}

}

class handle extends awt5_abstract{
	private String aid; //awt���� �Ѿ�� �μ����� Ŭ�������� Ȱ���ϱ� ���� ����
	private String return_id; 
	//awt�� �ٽ� ���� �����ϱ� ���� ������ ���� ���� 
	//null�� ��� ���̵� ��밡��, id���� ���޵Ǹ� �ش� ���̵�� ����� �� ���ٰ� �� ����.
	
	private ArrayList<String> db = null;
	
	@Override
	public String signok() {
		return this.return_id;
	}
	
	@Override
	public void idcheck(String id) {
		//awt���� �ߺ� ��ư�� Ŭ�� �� �ش� ������ ���������� �����Ͽ� ���� �ʱ�ȭ ��.
		this.return_id =null; 
		this.aid = id;
		this.dataload(); // ���������� �����Ͱ� �Ѿ���� ��� �ش� �޼ҵ带 �ε��Ͽ� Ȯ�� 
		int ea = this.db.size();
		int w = 0;
		
		while(w<ea) {
			
			if(this.aid.equals(this.db.get(w))) {
				this.return_id = this.db.get(w);
				break;
			}
			w++;
		}
		
	}
	
	@Override
	public void dataload() {
		String a[] = {"hong","lee","park","jeong","kim"};
		this.db = new ArrayList<>(Arrays.asList(a));
	}
}