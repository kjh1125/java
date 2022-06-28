import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;

public class net4 {

	public static void main(String[] args) throws Exception{
		String page = "https://www.kr.playblackdesert.com/ko-KR/Main/Index";
		URL url = new URL(page);
		//Stream에서는 read만 사용 가능. , Reader를 사용해야 readLine 사용 가능.
		InputStream is = url.openStream();
		BufferedInputStream bs = new BufferedInputStream(is); //배열 byte[]
		byte html[] = new byte[1024];
		//FileOutputStream fs = new FileOutputStream("game.html"); //배열 값 로드해서 저장
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("game.html"));
		
		int s = 0;
		while((s=bs.read(html))!=-1) { //Stream은 read에 byte배열명을 입력
			bos.write(html,0,s);
		}
		
		bs.close();
		bos.flush();
		bos.close();
		
	}

}
