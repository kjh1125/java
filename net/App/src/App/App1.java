package App;
import java.util.Scanner;


public class App1 {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�˻� �� ������ �л����� �Է��� �ּ���?");
		String student = sc.next();

		System.out.println("�˻��� ���� ���� [��ü] or [�����]");
		String score = sc.next();
		
		a12 ap2 = new a12(student,score);
		
		if(ap2.s123==true) {
			
		if(score.equals("��ü")) {
			String a22[] = ap2.a5();
			
			System.out.println(student+"���� ����"+"\n����:"+a22[1]+",����:"+a22[2]+",����:"+a22[3]+",����:"+a22[4]);
		}
		
		else{
			System.out.println(student+"���� "+score+"������:"+ap2.a4());
		}
		}
		
		else {
			System.out.println("�������� �ʴ� �����̰ų� �̸��Դϴ�");
		}
		ap2 =null;
		sc.close();
			
	}
}
//=========================================================================================================




/* a12 [][] = {
0{"������", "�̰���", "���", "������", "������"}, // �̸�
1{"80", "78", "92", "67", "40" }, // ����
2{"40", "80", "80", "92", "100"}, // ����
3{"95", "30", "55", "90", "65"}, // ����
4{"20", "80", "100", "95", "30"} // ����
};
*/

