import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class client2 {

	public static void main(String[] args) {
		String ip = "192.168.1.114";
		int port = 9091;
		Scanner sn = null;
		Scanner sn1 = null;
		Socket sc = null;
		OutputStream os =null;
		InputStream is = null;
		String userid = "";
		String msg ="";
		
		
		try {
			sc = new Socket(ip, port);
			sn1 = new Scanner(System.in);
			System.out.println("ä�ÿ� ����Ͻ� ���̵� �Է����ּ���.");
			
			userid = sn1.nextLine();
			os = sc.getOutputStream();
			is = sc.getInputStream();
			
			
			for (;;) { //���������� ���Ͽ� ��� ���ӵǵ��� �ϴ� ����
				sn = new Scanner(System.in);
				System.out.println("�Է��Ͻ� ������ �ۼ����ּ���");
				
				msg = userid+": "+sn.nextLine();
			
				if((msg.indexOf("exit"))!=-1) {
					os.write(userid.getBytes());
					System.out.println("ä���� ����Ǿ����ϴ�.");
					System.exit(0);
					
				}
				else {
				
				os.write(msg.getBytes());
				os.flush();

				byte[] data = new byte[1024];
				int n = is.read(data);
				String message = new String(data, 0, n);
				System.out.println(message);
				}
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
