import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class chat_server {

	public static void main(String[] args) {
		chat ch = new chat();
		ch.chatserver();

	}

}

class chat {

	private int port = 8009;
	ServerSocket sk = null;
	Socket so = null;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	String mid = null;
	String msg = null;
	String cmsg = null;


	public void chatserver() {
		try {
			this.sk = new ServerSocket(port);
			this.sc = new Scanner(System.in);
			System.out.println("���̵� �����ϼ���");
			this.mid = sc.nextLine();
			System.out.println("ä�ù� �����Ǿ����ϴ�");

			while (true) {
				this.so = sk.accept();
				this.is = so.getInputStream();
				this.os = so.getOutputStream();
				
				
				

				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.msg = new String(data, 0, n);

				if(this.msg.indexOf(":")==-1&&this.msg.indexOf("��")==-1) {
					System.out.println(this.msg+"���� �����ϼ̽��ϴ�");
					sk.close();
					sc.close();
					break;
					
					
				}
				else {
					System.out.println(this.msg);
					
				}

				this.sc = new Scanner(System.in);
				System.out.println("���� �Է�");
				this.cmsg = this.mid + ": " + this.sc.nextLine().intern();
				this.os.write(this.cmsg.getBytes());
				this.os.flush();
				
			
			}

		} catch (Exception e) {

		}

	}

}
