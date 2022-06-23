import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class file13 {

	public static void main(String[] args) throws IOException	 {
		
		
		try {
			// createDirectories: 신규 디렉토리 생성
			// Files.createDirectories(Paths.get("C:\\java5\\File_Stream\\src\\Test"));
			
			
			// 파일 복사
//			Path data1 = Paths.get("C:\\java5\\File_Stream\\src\\movie.txt");
//			Path data2 = Paths.get("C:\\java5\\File_Stream\\src\\movie2.txt");
//			
//			Files.copy(data1, data2);
//			
			//해당 파일을 다른 디렉토리로 이동.
//			Path data3 = Paths.get("C:\\java5\\File_Stream\\src\\movie2.txt");
//			Path directory = Paths.get("C:\\java5\\movie"); // 파일명까지 같이 설정
//			Files.move(data3,directory,StandardCopyOption.REPLACE_EXISTING);
			
			
			//해당 파일 삭제
//			Path data4 = Paths.get("C:\\java5\\File_Stream\\src\\movie2.txt");
//			Files.delete(data4);
			
			
			//파일 생성
			Path data5 = Paths.get("C:\\java5\\File_Stream\\src\\movie3.txt");
			Files.createFile(data5);
			
			
			
		} catch (Exception e) {
		
			System.out.println(e);
		}

	}

}
