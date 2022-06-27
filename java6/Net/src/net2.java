import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

//TCP(연결 프로토콜) - 전송속도가 빠름. 
//UDP(사용자 데이터 프로토콜) - 전송속도가 느림 (1:1일 경우에는 굉장히 빠름)
/*PORT (TCP의 한 종류)
 80 : WEB (http://)
 21 : FTP (파일 전송시 사용)
 22 : SSH - Linux, Unix (파일전송 and 서버외부접속)
 23 : TELNET - Window (서버외부접속)
 443 : WEB (https://)
 25 : SMTP (메일서버) - 메일 보내기
 110 : POP3 (메일받기) - 문자, 파일 받기 (비동기화)
 143 : IMAP (메일받기) - 문자, 파일 받기 (서버와 동기화)
 
 
 //SNMP : UDP (문자발송시스템) SMS, VPN (가상 IP) - UDP
 */
public class net2 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("웹에서 가져올 이미지 주소를 입력해주세요.");
		String url = sc.next();
		
		try {
			URL u = new URL(url); // URL(클래스) : 네트워크 경로를 말함.
			URLConnection con = u.openConnection(); // 해당 경로를 연결
			//System.out.println(con);
			int imgsize = con.getContentLength();
			//System.out.println(imgsize); //확인 시 -1(없음)이 나오면 이미지파일이 잘못 된 것. indexof 사용법과 같음. 
			String imgtype = con.getContentType(); // 파일 속성을 확인하는 기능 // image/jpeg
			//System.out.println(imgtype);
			long date = con.getDate(); //파일 로드 날짜
			//System.out.println(date);
			
			//openStream : URL에서만 사용
			InputStream is = u.openStream(); //URL에서 파일을 읽어올 때 사용.
			BufferedInputStream bi = new BufferedInputStream(is); //URL에서 읽은 파일을 임시저장. 속도상승을 위해
			FileOutputStream fo = new FileOutputStream("copy.jpg");
			byte data[] = new byte[1024]; // 1024byte = 1kb 로 조각냄
			
			//fo.write(bi.read(data));
			
			int imgdata = 0;
			int cnt = 0; //반복값
			while((imgdata=bi.read(data))!=-1) {
				fo.write(data,0,imgdata); // 조각난 파일을 붙여넣기.
				cnt += imgdata; // 1024++
				System.out.println("다운로드 중..."+(cnt*100)/imgsize+"%");
			};
			fo.flush();
			fo.close();
			sc.close();
			System.out.println("다운로드 완료");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
