import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


//Stream을 이용한 파일 로드 
public class file11 {

	public static void main(String[] args) throws IOException {
		try {
			//FileInputStream fs = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
			InputStream is = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
			System.out.println(is.available()); // available : 파일 전체 크기
			
			byte temp[] = new byte[is.available()]; //파일 크기만큼 만들어지도록,용량 무제한으로 볼 수 있음.
			//byte temp[] = new byte[1024*16]; // 용량을 제한
			int ea = is.read(temp); // ASCII 코드로 전체를 읽어서 ea가 값을 받도록 함.
			System.out.println(ea);
			String data = new String(temp,"UTF8"); // String 문자형태로 받아서 출력
			System.out.println(data);
			
		} catch (Exception e) {
			
			
		}
		
	}

}
