import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class lastexserver {

	public static void main(String[] args) {
		
		
		server1 s = new server1();
		s.start();
		
		
	}

}


class server1 extends Thread {

	ServerSocket sk = null;
	Socket sc = null;
	InputStream is = null;
	OutputStream os = null;
	String ip = "127.0.0.1";
	int pn=0;
	

	public server1() {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("사용하실 포트번호를 입력하세요");
		this.pn = sc1.nextInt();
		System.out.println("채팅서버오픈["+this.pn+"]");
	}

	@Override
	public void run() {

		try {
			this.sk = new ServerSocket(this.pn);
			
			while(true) {
				
				this.sc = this.sk.accept();
				
				this.is = this.sc.getInputStream();
				this.os = this.sc.getOutputStream();
				
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				String msg = new String(data, 0, n);
				System.out.println(msg);
				
			}
			
			

		} catch (Exception e) {

			System.out.println(e);
			
			
		}

	}

}