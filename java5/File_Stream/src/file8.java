import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

//Files로 해당 모든 내용을 배열로 전송시키는 방법
public class file8 {

	public static void main(String[] args) throws IOException {
		
		//List는 최상위 배열 클래스 (Object) 같은 느낌
		//Files : 신규 IO 클래스. readAllLines (전체 내용을 한 번에 모두 읽음)
		//Files + Paths.get("경로");
		
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\buffer.txt"));
		
		System.out.println(data);
		
		//일반 배열로 바꾸는 법: 한글파일이 손상되고 많은 생성으로 메모리에 부하가 걸림. 
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\java5\\File_Stream\\src\\buffer.txt"));
		System.out.println(new String(data2));
		
	}

}
