package List1;

import java.util.LinkedList;
import java.util.Scanner;

public class list5 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ����ڰ� �ݾ��� ���ڷ� �Է��մϴ�.
		 * �ش� ���� �ݾ� Ƚ���� �� 8�� �Դϴ�.
		 * 0~n���� �Է°����ϸ�
		 * �ش� �Է��� ��� ������ ���� �հ� �ݾ��� ��½�Ű�ÿ�.
		 * ����)
		 * �Ա��� �ݾ��� ��������
		 *  
		 */
		
		
		in i = new in();
		System.out.println(i.result());
		
	}

}

class in{
	private String num;
	private int money;
	private int ea;
	private int sum;
	LinkedList<Integer> list = new LinkedList<>(); // ��迭 ����
	
	
	public in() { 
		 
		Scanner sc = new Scanner(System.in); 
		
		while(true) {
			System.out.println("�ݾ��� �Է��ϼ���");
			this.num = sc.next();
			try {
			this.money = Integer.parseInt(this.num);
			this.list.add(this.money);
			this.ea = list.size();
			if(ea>=8) {
				break;
			}
			
			} catch(Exception e){
				System.out.println("�����Դϴ�, ���ڸ� �Է��ϼ���");
			}
		}
		this.out();
	}
	
	public void out() {
		int w = 0;
		
		while(w<this.ea) {
			
			this.sum+= this.list.get(w);
			w++;
		}
		
	}
	
	public String result() {
		return "�Է��� �ݾ�:"+this.list+"�� ��ģ �� �ݾ���"+this.sum+"�� �Դϴ�";
	}
	
}
