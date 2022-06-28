import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class net6 {
	//클라이언트
	public static void main(String[] args) throws Exception{
		System.out.println("클라이언트");
		String ip = "127.0.0.1"; //localhost
		int port = 8080;
		
		try {
		
			Socket sc = new Socket(ip,port); // 접속한 서버IP, 접속할 서버 port
			System.out.println("서버 연결에 성공했습니다.");
			String cmsg = "안녕하세요";
			//client에서 Server로 보내는 통로
			OutputStream os = sc.getOutputStream();
			
			//Server에서 보내는 값을 받는 통로
			os.write(cmsg.getBytes());
			os.flush();
			
			
			
			InputStream is = sc.getInputStream();
			
			//Server에서 회신된 내용을 byte 배열로 받을 후 출력
			byte data[] = new byte[1024];
			int n = is.read(data);
			String sm = new String(data,0,n);
			System.out.println(sm);
			
			sc.close();
			os.close();
			
		} catch (Exception e) {
			System.out.println("서버 연결에 실패했습니다.");
		}

	}

}
