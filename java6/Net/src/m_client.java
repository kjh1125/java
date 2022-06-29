import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;

public class m_client {
//m_client1의 서버 이름 잘못 씀
	public static void main(String[] args) {
		chatroom cr = new chatroom();

	}

}

class chatroom { // 기본사항->각 접속마다 thread를 분할

	ServerSocket server = null;
	static final int port = 9009; // Thread에서 공용으로 사용하기 위함
	Socket sk = null;

	public chatroom() {
		try {
			this.server = new ServerSocket(this.port);

		} catch (Exception e) {
			System.out.println(e);
		}

		System.out.println("멀티채팅on");

		while (true) {
			try {

				this.sk = this.server.accept(); // 클라이언트 접속 허가 부분
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
	//배열을 static으로 메모리에 기억시켜야 함, 그렇지 않으면 Thread 실행 시마다 초기화되면서 접속자 수 확인이 안 됨.
	static ArrayList<Socket> user = new ArrayList<>(); //접속자

	public chat_thread(Socket s) {
		this.sk = s;
		this.user.add(this.sk);
		try {
			System.out.println("채팅에 참여하셨습니다.");
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();

		} catch (Exception e) {
			System.out.println("클라이언트 접속정보가 올바르지 않습니다");

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
				System.out.println("보낼 내용 입력");
				this.rst = sc.nextLine();
				
				
				//배열에 있는 vport에 대한 정보를 담은 수 만큼 반복
				for(int j=0;j<this.user.size();j++)
				{
					//배열에 있는 사용자 vport로 전송을 하게 됨
				OutputStream all = this.user.get(j).getOutputStream();
				//사용자 별로 Stream을 생성
				all.write(this.rst.getBytes()); //전송
				all.flush(); //이전 전송메시지 비우기
				}
				}
				/*
				this.os.write(this.msg.getBytes()); //회신
				this.os.flush();
				*/
			}
		} catch (Exception e) {
			System.out.println("클라이언트 종료");
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