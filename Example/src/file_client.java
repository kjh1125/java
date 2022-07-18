import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.Buffer;

public class file_client {

	public static void main(String[] args) {
		
		f_client fc = new f_client();
		fc.files();
		
		
	}

}


class f_client{
	Socket sc = null;
	String ip = "127.0.0.1";
	int port = 8005;
	InputStream is = null;
	OutputStream os = null;
	
	public void files() {
		
		try {
			this.sc = new Socket(this.ip,this.port);
			
			this.is = this.sc.getInputStream();
			this.os = this.sc.getOutputStream();
			
			// ÷������ byte �迭�� ������
			String url = "C:\\t.jpg";
			//Ŭ���̾�Ʈ���� ���� �̹���, ������, ����, ������ ������ ����
			FileInputStream fs = new FileInputStream(url);
			BufferedInputStream bs = new BufferedInputStream(fs);
			//÷������ ��������
			
			byte img[] = new byte[bs.available()];
			//System.out.println(bs.read(img));
			int fordata = 0;
			while((fordata=bs.read(img))!=-1) {
				
				this.os.write(img,0,fordata);
				
				bs.close();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
	
}