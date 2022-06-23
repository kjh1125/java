import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

//Reader(최상위)
//(하위) BufferedReader, FileReader, CharArrayReader - 문서파일 ASCII
//(하위) InputStreamReader - 이미지, 동영상, 오디오


//InputStream(입력)
public class file9 {

	public static void main(String[] args) throws IOException {
		//Stream을 사용하는 이유 : 이미지, 동영상, 오디오 같은 파일을 로드할 수 있음.
		//InputStream: 모든 입력장치에 대한 값을 받는 클래스, 기본(int)-ASCII
		//InputStream: (최상위 입력장치)(Object 같은)
		// -FileInputStream, AudioInputStream, ObjectInputStream
		// Stream의 경우 따로 close 하지 않아도 자동으로 닫힘.
		InputStream is = new InputStream() { //기본 클래스를 로드하여 오버라이드 메소드를 불러옴.
			
			@Override
			public int read() throws IOException { //byte 1~2 
				int a = 15;
				return a;
			}
			
			
			
		};

		
		//InputStreamReader (언어패킷 변경) (인코딩) -FileinputStream
		//InputStreamReader ("파일명",ECUKR)orInputStreamReader ("파일명",UTF8)
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8")); 
		// reader를 거치는 이유 이전에 어떤 파일이 올지 알 수 없기 때문
		
		try {
		//	System.out.println(is.read());
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//키보드값 로드
		InputStream user = System.in;
		try {
			int code = user.read(); //키보드 입력 값을 ASCII 코드값으로 반환함
			
			System.out.println(code);
			
		} catch (Exception z) {
			System.out.println(z);
			
		}
		
	}

}
