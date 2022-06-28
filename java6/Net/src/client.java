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
			System.out.println("서버 접속 되었습니다");
			os = sc.getOutputStream();
			is = sc.getInputStream();
			
			
			for (;;) { //지속적으로 소켓에 계속 접속되도록 하는 형태
				sn = new Scanner(System.in);
				System.out.println("입력하실 내용을 작성해주세요");
				String msg = "홍길동:"+sn.nextLine();
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
				System.out.println("현재 접속 장애가 발생함");
				
				// TODO: handle exception
			}
		}
		finally { //클라이언트가 접속 종료 시 해당 소켓 및 각종 Stream, Scanner등을 모두 종료
			try {
				sc.close();
				os.close();
				is.close();
				sn.close(); //접속 종료 시 체크
			} catch (Exception e) {
				
				
			}
		}
	}

}
