
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class lastexclient {

	public static void main(String[] args) throws Exception{

		try {
			client c = new client();
			
		} catch (Exception e) {
			System.out.println("���ӿ���");
		}

	}

}

class client{
	
	String ip = "";
	String port = "";
	int portnum;
	Socket sc = null;
	InputStream is = null;
	OutputStream os = null;
	String msg="";
	Scanner sc1 = null;
	
	public client() throws Exception{
		
		this.sc1 = new Scanner(System.in);
		
		System.out.println("������ IP��ȣ�� �Է����ּ���");
		this.ip = sc1.nextLine();
		port();
		this.sc = new Socket(this.ip,this.portnum);
		this.is = this.sc.getInputStream();
		this.os = this.sc.getOutputStream();
		
		this.msg= "GUEST(kim) ����";
		this.os.write(this.msg.getBytes());
		this.os.flush();
		sc1.close();
		
	}
	public void port() {
		this.sc1 = new Scanner(System.in);
	System.out.println("������ Port��ȣ�� �Է����ּ���");
	try {
		this.port = sc1.next();
		this.portnum = Integer.parseInt(this.port);
		sc1.close();
	} catch (Exception e) {
		System.out.println("port��ȣ�� ���ڸ� �Է��ϼ���");
		port();
	}
	}
	
	
}