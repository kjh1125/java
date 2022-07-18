import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

//8001 client의 경우 Thread 사용할 필요 없음.
public class chat_client2 {

	public static void main(String[] args) {
		
		port_chat1 pc = new port_chat1();
		pc.connect();
		

	}

}

class port_chat1{
	int port = 8002;
	String ip = "192.168.1.137";
	InputStream is = null;
	OutputStream os = null;
	String msg = "";
	Socket sc = null;
	
	public void connect() {
		try {
			while(true) {
				this.sc = new Socket(this.ip,this.port);
				this.is = this.sc.getInputStream();
				this.os = this.sc.getOutputStream();
				
				this.msg = "클라이언트" + this.port+" 접속";
				
				this.os.write(this.msg.getBytes());
				this.os.flush();
				}
			
		} catch (Exception e) {
			
		}
	}
	
}