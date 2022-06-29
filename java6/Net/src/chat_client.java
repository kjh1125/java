import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//client
public class chat_client {

	public static void main(String[] args) {
		try {

			client_chat cc = new client_chat();
			cc.chat();

		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println(e);

			}

		}

	}

}

class client_chat {

	private final String ip = "127.0.0.1"; // �����Ϸ��� ���� ip
	final int port = 8009;
	Scanner sc = null;
	InputStream is = null;
	OutputStream os = null;
	private String mid = null;
	Socket sk = null;
	String msg = null; // ����� �Է�
	String smsg = null; // ���� ���۸޽���
	Boolean a = false;
	
	public void chat() {
		// ���� Stream�� close���� �ʾƾ� ��, Stream�� ���ϰ� ����Ǿ� �־� ����� ���ϵ� �����
		
		try {
			this.sc = new Scanner(System.in);
			System.out.println("���̵� �������ּ���");
			this.mid = this.sc.next();

			int ct = 0;
			while (true) {
				this.sk = new Socket(this.ip, this.port);
				this.is = sk.getInputStream();
				this.os = sk.getOutputStream();
				

				if (ct ==0) {
					this.msg = this.mid + "�� ����";
						
				}
				else {
				this.sc = new Scanner(System.in);
				System.out.println("�����Է�");
				this.msg = this.mid + ": " + this.sc.nextLine().intern();
				
				}
				if(msg.indexOf("exit")!=-1) {
					this.msg = this.mid;
					this.os.write(this.msg.getBytes());
					this.os.flush();
					is.close();
					os.close();
				}
				
				this.os.write(this.msg.getBytes());
				this.os.flush();
				
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.smsg = new String(data, 0, n);
				System.out.println(this.smsg);

				ct++;
			}

		} catch (Exception a1) {
			System.out.println(a1);
		}

	}
}
