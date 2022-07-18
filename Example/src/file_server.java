import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class file_server {

	public static void main(String[] args) {
		
		f_server fs = new f_server();
		fs.data();
		
	}

}


class f_server{
	
	ServerSocket server = null;
	Socket sk = null;
	int port = 8005;
	InputStream is = null;
	OutputStream os = null;
	
	public void data() {
		try {
			this.server = new ServerSocket(this.port);
			this.sk = this.server.accept();
			System.out.println("서버 가동중...");
			
			this.is = this.sk.getInputStream();
			this.os = this.sk.getOutputStream();
			
			byte data[] = new byte[1024*200];
			int n = this.is.read(data);
			//String f = new String(data,0,n); // 채팅을 받을 때 사용하는 명령어
			String url = "C:\\javahomework\\Example\\src\\copy.jpg";
			//파일로 클라이언트가 전송을 하므로 서버에서 byte로 값을 받게 됩니다.
			// getInputStream() -> FileOutputStream() 
			FileOutputStream fs = new FileOutputStream(url);
			//System.out.println(f);
			
			fs.write(data,0,n); //해당 URL 자료형으로 저장되도록 하는 명령어
			fs.flush(); 
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
}