import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Server�� ���� ���� ��Ʈ�� ���� (8001,8002)
//Exception : bind Exception (PORT �浹)

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
			 * ��Ʈ �ϳ��� ��� �� ��� 
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
			this.sk = new ServerSocket(this.pt); // ���� ������ �� ���� ����

			while (true) {
				this.sc = this.sk.accept(); // �ش� port ��� ����

				this.is = this.sc.getInputStream();
				this.os = this.sc.getOutputStream();

				// client���� ���� �޽����� �޴� ����

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