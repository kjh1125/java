import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket��� : Server, Client : �޽���, ���� ����, �ۼ��� ��� (����� ���)

//HTTP��� : Image, ������, ���� �����(��û)�� ����(����)�� �ۼ��� ��� (�ܹ��� ���)
public class net5 {
//Server // net6(Client)�� ����
	public static void main(String[] args) throws Exception {
		System.out.println("Server Connect");
		int port = 8080; // ������ ��Ʈ��ȣ�� ���� (��, ���� �ߺ��� ��Ʈ�� ����ϸ� �� ��.)
		String msg = "Success Connect!!";

		try {
			ServerSocket ss = new ServerSocket(port); // ServerSocket : ���½�ų ��Ʈ�� ����
			//������ ���������� �����ϱ� ���ؼ��� ServerSocket�� ���� ��ε��ϸ� �� ��.
			while (true) {
				System.out.println("���� �����.....");
				Socket sc = ss.accept(); // accept() : Ŭ���̾�Ʈ�� ������ ���� ����ϴ� ������ �ϰ���.
				System.out.println("ȣ��Ʈ:��� ���� ����");
				// Server���� client�� ���� �޴� ���
				InputStream is = sc.getInputStream(); // client���� ������ ���� �д� ���
				// Client�� ������ ���
				OutputStream os = sc.getOutputStream(); // client�� ���� ����
				byte data[] = new byte[1024]; // client���� �޴� ���� byte�� ����
				int n = is.read(data); // �ش� ���� �о����

				String msgclient = new String(data, 0, n); // �ش� ���� �迭�� Ȯ���Ͽ� ������ �̰�
				System.out.println(msgclient); // �̰��� ���� ��½�Ű�� ����

				String aws = "�ݰ����ϴ�."; // �������� ������ �޽���
				os.write(aws.getBytes()); // �޽����� Ŭ���̾�Ʈ�� ���������� �޸� ����
				os.flush();
				os.close();
				is.close();
				sc.close();
			}
		} catch (Exception e) {
			System.out.println("�����ߺ�");
		}

	}

}
