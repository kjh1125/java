import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Server에 여러 개의 포트를 오픈 (8001,8002)
//Exception : bind Exception (PORT 충돌)

public class chat_server {

	public static void main(String[] args) {

		int port[] = { 8001, 8002 };
		int ea = port.length;

		openchat oc = null;
		int w = 0;

		while (w < ea) {
			oc = new openchat(port[w]);
			oc.start();
			w++;

			/*
			 * 포트 하나만 사용 할 경우 
			 * int port = 8003; 
			 * openchat oc = null; 
			 * oc= new openchat(port[w]); 
			 * oc.start();
			 * 
			 */

		}

	}

}

class openchat extends Thread {

	String ip = "127.0.0.1";
	int pt = 0;
	ServerSocket sk = null;
	Socket sc = null;
	InputStream is = null;
	OutputStream os = null;

	public openchat(int p) {
		this.pt = p;

	}

	@Override
	public void run() {

		try {
			this.sk = new ServerSocket(this.pt); // 서버 소켓은 한 번만 돌림

			while (true) {
				this.sc = this.sk.accept(); // 해당 port 모두 오픈

				this.is = this.sc.getInputStream();
				this.os = this.sc.getOutputStream();

				// client에서 보낸 메시지를 받는 구간

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