import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client {

	public static void main(String[] args) {
		String ip = "127.0.0.1";
		int port = 9090;
		Scanner sn = null;
		Socket sc = null;
		OutputStream os =null;
		InputStream is = null;
		
		try {
			sc = new Socket(ip, port);
			System.out.println("���� ���� �Ǿ����ϴ�");
			os = sc.getOutputStream();
			is = sc.getInputStream();
			
			
			for (;;) { //���������� ���Ͽ� ��� ���ӵǵ��� �ϴ� ����
				sn = new Scanner(System.in);
				System.out.println("�Է��Ͻ� ������ �ۼ����ּ���");
				String msg = "ȫ�浿:"+sn.nextLine();
				os.write(msg.getBytes());
				os.flush();

				byte[] data = new byte[1024];
				int n = is.read(data);
				String message = new String(data, 0, n);
				System.out.println(message);

			}



		} catch (Exception c) {
			System.out.println(c.getMessage());
			if ((c.getMessage()) != null) {
				System.out.println("���� ���� ��ְ� �߻���");
				
				// TODO: handle exception
			}
		}
		finally { //Ŭ���̾�Ʈ�� ���� ���� �� �ش� ���� �� ���� Stream, Scanner���� ��� ����
			try {
				sc.close();
				os.close();
				is.close();
				sn.close(); //���� ���� �� üũ
			} catch (Exception e) {
				
				
			}
		}
	}

}
