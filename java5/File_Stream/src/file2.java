import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class file2 {

	public static void main(String[] args) throws IOException{
		
		
		try {
			//FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt"); //java 8번 이하
			//Charset.forName("EUCKR") :java12부터 나온 기능으로 EUCKR(ANSI),UTF8,UTF16 지원 
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt",Charset.forName("EUCKR"));
			//System.out.println(fr.getEncoding()); // 인코더 형식 확인 FileReader
			//System.out.println(fr.read()); //용량
			//int w = 0;
			while(true) {
				int m = fr.read(); // -1: 내용이 없음(더 이상 문자가 없을 경우)
				System.out.print((char)m); //2byte char로만 사용가능.
				if(m==-1) { // 더 이상 가져올 문자가 없을 경우 loop 빠져나감
					
					fr.close(); //fileReader를 종료함
					System.exit(0);
				}
					
			}
			
			
		} catch (IOException e) {
			if(e.getMessage()!=null) {
				System.out.println(e);
			}
		}

	}

}
