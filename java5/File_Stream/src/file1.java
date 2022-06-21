import java.io.FileReader;
import java.io.IOException;

public class file1 {
	/*
	 * I/O : inputStream, OutputStream
	 * 입력 스트림: 프로그램으로 들어오는 스트림 (InputStream: 키보드, 마우스, HDD)
	 * 출력 스트림: 프로그램에서 밖으로 나가는 부분 (OutputStream: 모니터, 프린터)
	 * Stream: input, output 사용자 처리하는 부분
	 * JAVA.io (API)
	 * File, FileReader (일반) //원시코드 -> StreamAPI (FileinputStream) // Stream API 사용으로 처리속도 향상
	 * FileWriter -> StreamAPI (FileoutputStream)
	 */
	
	
	public static void main(String[] args) throws IOException,Exception{
		/*FileReader: 
		 1.문자데이터를 파일로부터 읽는 클래스
		 2.파일 이름을 생성자 인수값(파라미터)으로 사용해서 FileReader 객체 생성
		 public void abc(String a)
		*/ 
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt");
			String a ="a1";
			tests(a);
		} catch (IOException z) { // IOException에 대한 예외처리
			System.out.println(z.getMessage());
		}
		catch (Exception z1) { // 일반 Exception에 대한 예외처리 방식
			System.out.println(z1.getMessage());
		}
	
		
		

	}

	static public void tests(String a ) throws Exception{
		
		int k = Integer.valueOf(a);
		IOException ex = new IOException();
		throw ex;
		
	}
	
}
