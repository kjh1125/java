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
		System.out.println("총 이체금액은"+result[0]+"이며, 총 잔고금액은 "+ result[1]+"입니다");
	}

}

class payroll extends pay_abstract{
	
	String filename="";
	int total = 0;
	int all_money = this.money; //현재 통장 잔고금액
	
	//입금 파트
	public void input_sc() {
		Scanner sc = new Scanner(System.in);
		int c = 0; //반복문
		int m_in = 0; //재무과 담당자가 입력하는 급여
		
		
		while(c<this.em.size()) {
			System.out.println("이체를 시작합니다 ["+this.em.get(c)+"] 에게 이체할 금액을 입력하세요");
			m_in= sc.nextInt();
			this.all_money -= m_in;
			this.total += m_in; //이체된 전체 금액
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
		this.em = new ArrayList<>(); //빈배열
		this.fr = new FileReader(this.filename,Charset.forName("UTF8"));
		//System.out.println((char)this.fr.read()); 
		BufferedReader bf = new BufferedReader(fr);
		//System.out.println(bf.readLine()); //buffer 사용 시 주의!
		
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