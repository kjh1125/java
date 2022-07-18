
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class lastexclient {

	public static void main(String[] args) throws Exception{

		try {
			client c = new client();
			
		} catch (Exception e) {
			System.out.println("접속에러");
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
		
		System.out.println("접속할 IP번호를 입력해주세요");
		this.ip = sc1.nextLine();
		port();
		this.sc = new Socket(this.ip,this.portnum);
		this.is = this.sc.getInputStream();
		this.os = this.sc.getOutputStream();
		
		this.msg= "GUEST(kim) 참여";
		this.os.write(this.msg.getBytes());
		this.os.flush();
		sc1.close();
		
	}
	public void port() {
		this.sc1 = new Scanner(System.in);
	System.out.println("접속할 Port번호를 입력해주세요");
	try {
		this.port = sc1.next();
		this.portnum = Integer.parseInt(this.port);
		sc1.close();
	} catch (Exception e) {
		System.out.println("port번호는 숫자만 입력하세요");
		port();
	}
	}
	
	
}