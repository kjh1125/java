import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�����ϰ� ������ �ѱ۷� ǥ���Ͻʽÿ�?");
		String sc1 = sc.next();
		String msg;
		
		switch(sc1){
			
		case "����" ->{
			msg = "red";
		}
		case "��Ȳ" ->{
			msg = "orange";
		}
		case "���" ->{
			msg = "yellow";
		}
		case "�ʷ�" ->{
			msg = "green";
		}
		default ->{
			msg = "�ش� �ܾ�� ������ ���� �ʽ��ϴ�";
		}
		
		}
		System.out.println(msg);
		sc.close();
	}

}
