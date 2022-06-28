import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class server2 {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		
		OutputStream os = null;
		int port = 9091;
		Scanner in_msg = null;
		String server_msg = null;
		String message = null;
		String user_id = null;
		String exit_msg = null;
		
		try {
			ss = new ServerSocket(port);
			System.out.println("�������� ����Ͻ� ���̵� �Է����ּ���.");
			in_msg = new Scanner(System.in);
			user_id = in_msg.nextLine();
			System.out.println("���� ���� �����..");
			
			sc = ss.accept();
			System.out.println("���� Ȯ��");
			is = sc.getInputStream();
			os = sc.getOutputStream();
			
			byte data[] = new byte[1024];
			
			while (true) {

				int n = is.read(data);
				message = new String(data,0,n);
				
				if(message.indexOf("exit") != -1 ) {
					System.out.println(message + "�� �����ϼ̽��ϴ�.");
					System.exit(0);
				}
				else {
					System.out.println(message);
				}

				System.out.println("������ �Է����ּ���");
				server_msg = user_id + " : [ " + in_msg.nextLine() + " ]";
//				server_msg = " [ " + in_msg.nextLine() + " ]";
				os.write(server_msg.getBytes());
				os.flush();
			}
		}catch(Exception e) {
			
			System.out.println("SERVER ERROR");
		}
	}
}