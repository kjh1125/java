import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

//8001 client�� ��� Thread ����� �ʿ� ����.
public class chat_client {

	public static void main(String[] args) {
		
		port_chat pc = new port_chat();
		pc.connect();
		

	}

}

class port_chat{
	int port = 8001;
	String ip = "192.168.1.137";
	InputStream is = null;
	OutputStream os = null;
	String msg = "";
	Socket sc = null;
	
	public void connect() {
		try {
			while(true) {
			this.sc = new Socket(this.ip,this.port);
			this.is = this.sc.getInputStream();
			this.os = this.sc.getOutputStream();
			
			// ������ �ش� �޽����� ����
//			this.msg = "Ŭ���̾�Ʈ" + this.port+" ����";
//			this.os.write(this.msg.getBytes());
//			this.os.flush();
			
			Scanner sc1 = new Scanner(System.in);
			System.out.println("�����Է�");
			String a = sc1.nextLine();
			this.os.write(a.getBytes());
			this.os.flush();
			
			//�޽��� ���� ��
			
			}
		} catch (Exception e) {
			
		}
	}
	
}