import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("0~10���� ���ڸ� �ϳ� �����ϼ���");
	//	int no = sc.nextInt();
		
		
		memorys m = new memorys();
		/*memorys m = null;
		m = new memorys();
		*/
	//	m.ms(no);
		//�޸𸮸� �����ϱ� ���� ���� ���� �ڵ� ���.
	//	sc.close();
		m = new memorys();
		m.rd();
		m = null; // �ش� �ν�ź���� ���.
	}

}

class memorys{
	public void ms(int user){
		//Math.random() �����޼ҵ� ���� // �⺻ �ڷ��� double

		// random -> �����ڵ�, �����ڵ�, ��÷, �귿
		
		//double a = Math.random(); /// 0.0~1.0
		//0~10 �⺻������ ���� �Լ��� ��� �Ҽ����̱� ������ double -> int ������ �ʿ�. 
		
	/*
		if(user==b) {
			msg="��÷";
		}
		else {
			msg="���� ��ȸ��";
		}
		message(msg);
	}
	*/
		
	//for(int f=1;f<11;f++) {
		//int b = (int)(Math.random()*10); 
	//	System.out.println(b);
	//}
}
	
	
	public void rd() { // random util ����
		Random r = new Random(); // random ��ü ���� �� �ν��Ͻ� ����
		int w = 0;
		while(w<6) {
			System.out.print(r.nextInt(45)+1+" "); // 0~9���� r.nextInt�� ���
			w++;
		}
		//r=null;
	}
}

