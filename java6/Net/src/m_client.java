import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_client {
//m_client1�� ���� �̸� �߸� ��
	public static void main(String[] args) {
		chatroom cr = new chatroom();

	}

}

class chatroom { // �⺻����->�� ���Ӹ��� thread�� ����

	ServerSocket server = null;
	static final int port = 9009; // Thread���� �������� ����ϱ� ����
	Socket sk = null;

	public chatroom() {
		try {
			this.server = new ServerSocket(this.port);

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("��Ƽä��on");

		while (true) {
			try {

				this.sk = this.server.accept(); // Ŭ���̾�Ʈ ���� �㰡 �κ�
				chat_thread ct = new chat_thread(this.sk); //
				Thread t = new Thread(ct);
				t.start();

			} catch (Exception e2) {
				System.out.println(e2);
			}

		}
	}

}

class chat_thread implements Runnable {
	Socket sk = null;
	InputStream is = null;
	OutputStream os = null;
	String msg = null;
	String rst = null;
	Scanner sc = null;
	//�迭�� static���� �޸𸮿� �����Ѿ� ��, �׷��� ������ Thread ���� �ø��� �ʱ�ȭ�Ǹ鼭 ������ �� Ȯ���� �� ��.
	static ArrayList<Socket> user = new ArrayList<>(); //������

	public chat_thread(Socket s) {
		this.sk = s;
		this.user.add(this.sk);
		try {
			System.out.println("ä�ÿ� �����ϼ̽��ϴ�.");
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();

		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ ���������� �ùٸ��� �ʽ��ϴ�");

		}

	}

	@Override
	public void run() {
		try {
			while(true) {
				byte data[] = new byte[1024];
				int n = this.is.read(data);
				this.msg = new String(data,0,n);
				System.out.println(this.msg);
				
				this.sc = new Scanner(System.in);
				
				while(true) {
					System.out.println(this.user.size());
				System.out.println("���� ���� �Է�");
				this.rst = sc.nextLine();
				
				
				//�迭�� �ִ� vport�� ���� ������ ���� �� ��ŭ �ݺ�
				for(int j=0;j<this.user.size();j++)
				{
					//�迭�� �ִ� ����� vport�� ������ �ϰ� ��
				OutputStream all = this.user.get(j).getOutputStream();
				//����� ���� Stream�� ����
				all.write(this.rst.getBytes()); //����
				all.flush(); //���� ���۸޽��� ����
				}
				}
				/*
				this.os.write(this.msg.getBytes()); //ȸ��
				this.os.flush();
				*/
			}
		} catch (Exception e) {
			System.out.println("Ŭ���̾�Ʈ ����");
		}
		finally {
			try {
				this.is.close();
				this.os.close();
				this.sk.close();
				
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
			
		}
	}

}