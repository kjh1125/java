import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * ���� ����ڰ� ���� ���� ���α׷��� ��û�Ͽ����ϴ�.
		 * ����ڰ� �� 5���� ���ڸ� �Է��ϰ� �˴ϴ�.
		 * "1~46�� ������ ���ڸ� �Է����ּ���."
		 * ����ڰ� �Է��� 5���� ���ڸ� �迭�� ����. (main���� ó��)
		 * 
		 * �ܺ� Ŭ������ �̿��Ͽ� pc�� ���� ��÷��ȣ 5���� �����ϰ� �̾Ƴ��ϴ�.
		 * pc�� ���� 5���� ���ڸ� �迭�� �����մϴ�. (�ܺ� Ŭ���� �޼ҵ�� ����)
		 * 
		 * ������ ��� method�� �ϳ� �� �����Ͽ� ����ڰ� �Է��� 5���� �迭 �����Ϳ�,
		 * pc�� ���� �迭 �����͸� �ش� method�� �����Ͽ�, ����ϸ� �˴ϴ�.
		 * 
		 * ��, ��� ����ϴ� �ݺ����� ������ do~while������ �ۼ��Ͻÿ�.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int dw=0;
		int data[] = new int[5];
		
		do {
			System.out.println("1~46�� ������ ���ڸ� 5�� �Է����ּ���.");
			int a = sc.nextInt();
			data[dw] = a;
			dw++;
		}while(dw<5);
		
		num n = new num();
		n.random(data);
		n = null;
		sc.close();
		
	}

}

class num
{
	public void random(int user[]) {
		Random r = new Random();
		int dw =0;
		int ra[] = new int[5]; 
		
		do {
			ra[dw] = r.nextInt(46)+1;
			dw++;
		}while(dw<5);
		r=null;
		total(user,ra);
		
	}
	
	public void total(int a1[],int a2[]) {
		
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		
	}
	
}
