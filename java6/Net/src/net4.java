import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class net4 {

	public static void main(String[] args) throws Exception{
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL url = new URL(page);
		//Stream������ read�� ��� ����. , Reader�� ����ؾ� readLine ��� ����.
		InputStream is = url.openStream();
		BufferedInputStream bs = new BufferedInputStream(is); //�迭 byte[]
		byte html[] = new byte[1024];
		//FileOutputStream fs = new FileOutputStream("game.html"); //�迭 �� �ε��ؼ� ����
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("game.html"));
		
		int s = 0;
		while((s=bs.read(html))!=-1) { //Stream�� read�� byte�迭���� �Է�
			bos.write(html,0,s);
		}
		
		bs.close();
		bos.flush();
		bos.close();
		
	}

}
