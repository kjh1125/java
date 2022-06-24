package java_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pay_program {

	public static void main(String[] args) {
		payroll py = new payroll();
		py.start();
		int result[] = py.check();
		System.out.println("�� ��ü�ݾ���"+result[0]+"�̸�, �� �ܰ�ݾ��� "+ result[1]+"�Դϴ�");
	}

}

class payroll extends pay_abstract{
	
	String filename="";
	int total = 0;
	int all_money = this.money; //���� ���� �ܰ�ݾ�
	
	//�Ա� ��Ʈ
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		int c = 0; //�ݺ���
		int m_in = 0; //�繫�� ����ڰ� �Է��ϴ� �޿�
		
		
		while(c<this.em.size()) {
			System.out.println("��ü�� �����մϴ� ["+this.em.get(c)+"] ���� ��ü�� �ݾ��� �Է��ϼ���");
			m_in= sc.nextInt();
			this.all_money -= m_in;
			this.total += m_in; //��ü�� ��ü �ݾ�
			c++;
		}
		sc.close();
	}
	
	@Override
	public void start() {
		try {
			this.filename = "C:\\javatest\\javatest\\src\\java_1\\employee.txt";
			this.db2();
			this.input_sc();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	@Override
	void db2() throws IOException {
		this.em = new ArrayList<>(); //��迭
		this.fr = new FileReader(this.filename,Charset.forName("UTF8"));
		//System.out.println((char)this.fr.read()); 
		BufferedReader bf = new BufferedReader(fr);
		//System.out.println(bf.readLine()); //buffer ��� �� ����!
		
		String data = bf.readLine();
		String data1[] = data.split(",");
		//System.out.println(Arrays.toString(data.split(",")));
		int ea = data1.length;
		int w = 0;
		
		while(w<ea) {
			this.em.add(data1[w]);
			w++;
		}
		bf.close();
		
	}
	
	@Override
	public int check()[] {
	
		return new int[] {this.total,this.all_money};
	}
	
}