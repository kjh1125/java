import java.util.ArrayList;
import java.util.Random;

public class test5 {

	public static void main(String[] args) {
		/*
		 * ��ǻ�Ͱ� 1~9���� ���ڸ� �� 5�� �ݺ� �մϴ�. 5�� �ݺ��ϴ� ���� �迭�� �ش� ���� ���� �Ǿ�� �մϴ�. ��, �ߺ��� ���� ���� �迭��
		 * �Է� ���� �ʵ��� �մϴ�. �� ��Ʈ �迭�� ArrayList�� ����ϸ�, �迭�� �ߺ��� ���δ� ������ return �޼ҵ带 Ȱ���Ͽ� üũ
		 * �ǵ��� �մϴ�.
		 * 
		 * ���� ���� [2,3,7,9,4]
		 * 
		 */

		test5_1 t = new test5_1();
		t.setter();
		
		
	}

}

class test5_1{
	
	ArrayList<Integer> sum = new ArrayList<>();
	ArrayList<Integer> sum2 = new ArrayList<>();
	String a="";
	
public void setter() {
	Random r = new Random();
	
	int w = 0;
	
	while(w<5) {
		int b = r.nextInt(9)+1;
		this.sum.add(b);
		
		w++;
	}
	
	for(int num: this.sum) {
		if(!this.sum2.contains(num)) {
			this.sum2.add(num);
			
		}
		
		else{
			this.a+=num+",";
		}
		
	}
	
	
	
	System.out.println(this.sum2);
	System.out.println("�ߺ���: "+this.a);

}




}


