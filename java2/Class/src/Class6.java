import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
		int num = 3;
		datalist da = new datalist();
		da.array_data(num);
		
		//String pay ="�ſ�ī��";
		String pay = "������";
		if(pay.equals("�ſ�ī��")) {
			da.pay1(); //�ش� ���ǿ� �´� �޼ҵ带 ȣ��
		}
		else {
			da.pay2(pay); // �޼ҵ忡 ��ü���� �¿��� ���� (��ü���� ���Ѵ� ���� �� �¿�� ���� ��� �߰��� , ���)
		}
		
		/*
		 * ���빮�� �ش� �ε��� class���� agrees��� �̸��� ������ �ֽ��ϴ�.
		 * main�޼ҵ忡�� ����ڰ� "������", "���Ǿ���"�� �Է��ϰ� �˴ϴ�.
		 * ���������� �ԷµǾ��� ��� "ȸ�������� ����˴ϴ�."��� �޼����� ����ϰ�
		 * ���� �� ������ �Է� �� "���Ǹ� �ϼž� ����˴ϴ�."
		 * ��� ��µǵ��� �Ͻÿ�.
		 * ��, agrees Ŭ���� �ȿ� void �޼ҵ� �� �� �Ǵ� �� ���� �����Ͽ� 
		 * �ڵ带 �����Ͻÿ�. 
		 */
		
		agrees ag = new agrees();
		Scanner sc = new Scanner(System.in);
		System.out.println("ȸ������ �����ϸ� ������ �ƴϸ� ���Ǿ����� �Է����ּ���");
		String a = sc.next();
		ag.yes(a);
		
		sc.close();
		
	}

}

class datalist{
	/* static�޼ҵ带 Ȱ���ϴ� ����: ���� package���� �ش� �޼ҵ带 
	 * ���� ����ؾ� �Ǵ� ��� static �޼ҵ带 Ȱ��.
	 * 
	 * static(�����޼ҵ�): �������̵��� ����� �� ����.
	 * void(�����޼ҵ�)�� ��� ��: �������̵��� ����� �� ����.
	 * �������̵� ex)
	 * class a{
	 * void �޼ҵ�
	 * }
	 * class b extend a{
	 * void �޼ҵ�
	 * }
	*/
	
	public void array_data(int a) { //static�� ���� �޼ҵ�
		
		int w = 1;
		while(w<=9){
			//System.out.print(a*w+" ");
			w++;
		}
		
	}
	
	public void pay1() {
		//System.out.println("�ſ�ī��� ���� �����մϴ�.");
		
	}
	
    public void pay2(String pm) {
    //	System.out.println(pm+"���� ���� �����մϴ�.");
	}
	
}

class agrees{
	public void yes(String a) {
		String msg;
		
		if(a.equals("������")) {
			msg = "ȸ�������� ����˴ϴ�.";
		
		}
		else {
			msg = "���Ǹ� �ϼž� ����˴ϴ�.";
			
		}
		System.out.println(msg);
		
	}
	
	
}

/*
 * �ʱ���� ����
 * 1. Editor�� ����?(��Ŭ����, vs�ڵ� ��)
 * 2. Database�� ����(SQL ��)
 * 3. java���� ����ϴ� �ڷ����� �ƴ� ����?
 * 4. java���� ����ϴ� ���о� �߸� �� ����? ex)Project��?, package��?, import, class��?
 * 5. java�� ���� ���� �� �߸� �� ����?(java�� ����X, java�� Ư¡O)
 * 6. ���� �����ڵ� �� �߸� �� �κ���?
*/
