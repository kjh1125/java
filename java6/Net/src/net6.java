import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//Ŭ���̾�Ʈ
	public static void main(String[] args) throws Exception{
		System.out.println("Ŭ���̾�Ʈ");
		String ip = "127.0.0.1"; //localhost
		int port = 8080;
		
		try {
		
			Socket sc = new Socket(ip,port); // ������ ����IP, ������ ���� port
			System.out.println("���� ���ῡ �����߽��ϴ�.");
			String cmsg = "�ȳ��ϼ���";
			//client���� Server�� ������ ���
			OutputStream os = sc.getOutputStream();
			
			//Server���� ������ ���� �޴� ���
			os.write(cmsg.getBytes());
			os.flush();
			
			
			
			InputStream is = sc.getInputStream();
			
			//Server���� ȸ�ŵ� ������ byte �迭�� ���� �� ���
			byte data[] = new byte[1024];
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			
			sc.close();
			os.close();
			
		} catch (Exception e) {
			System.out.println("���� ���ῡ �����߽��ϴ�.");
		}

	}

}
