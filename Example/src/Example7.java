import java.util.Scanner;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * ���빮��
		 * ����ڰ� ���� ������ Ȯ���Ͽ� ���� �Է� �� �ش� ����� �����ϴ� ���μ����� �����մϴ�.
		 * "ù ��° �Է� �� ��(1~10����) �Դϴ�."
		 * "�� ��° �Է� �� ��(1~10����) �Դϴ�."
		 * "�� ��° �Է� �� ��(1~10����) �Դϴ�."
		 * 
		 * ������ �����Դϴ�.
		 * �ش� �� ���� ���� ���� �����ȣ�� �����ÿ�: +,-,*,/
		 * 
		 * �ش� �����ȣ�� �°� ������ �����Ͽ� �������� ��½�Ű�ÿ�
		 * 
		
		int a,b,c;
		String cal;
		int sum=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("ù ��° ���� �Է��ϼ���.(1~10����)");
		a = sc.nextInt();
		System.out.println("�� ��° ���� �Է��ϼ���.(1~10����)");
		b = sc.nextInt();
		System.out.println("�� ��° ���� �Է��ϼ���.(1~10����)");
		c = sc.nextInt();
		System.out.println("�����ȣ�� �Է��ϼ���.");
		cal = sc.next();
		
		if(cal.equals("+")) {
			sum=a+b+c;
		}
		else if(cal.equals("-")) {
			sum=a-b-c;
		}
		else if(cal.equals("*")) {
			sum=a*b*c;
		}
		else if(cal.equals("/")) {
			sum=a/b/c;
		}
		System.out.printf("�������: %d %s %d %s %d = %d",a,cal,b,cal,c,sum);
		sc.close();
		 */
Scanner sc = new Scanner(System.in);
System.out.println("1��");
int no1 = sc.nextInt();
System.out.println("2��");
int no2 = sc.nextInt();
System.out.println("3��");
int no3 = sc.nextInt();

System.out.println("�����ȣ�� �����ÿ�");
String ms = sc.next();
double a1;

if(ms.equals("+")) {
	System.out.println(no1+no2+no3);
}
else if(ms.equals("-")) {
	System.out.println(no1-no2-no3);
}
else if(ms.equals("*")) {
	System.out.println(no1*no2*no3);
}
else{
	a1 = no1/no2/no3;
	System.out.println(a1);
}

sc.close();

	}

}
