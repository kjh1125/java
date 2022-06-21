import java.io.FileWriter;
import java.io.IOException;

//파일 쓰기(write)
public class File4 {

	public static void main(String[] args) throws Exception {
		try {
			//FileWriter: 문자 데이터를 파일에 쓰는 클래스
			
			String user[] = {"41","b","c","d"};
			//FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt");
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt",true);
			//FileWriter에 true를 사용하면 기존 입력 된 데이터를 초기화 하지 않음.
			
			
			for(int f=0;f<user.length;f++) {
				fw.write(user[f]); //write: 문자,배열데이터 값을 파일에 적용
			}
			
			fw.close(); //파일 오픈사항을 종료함
			
		} catch (Exception e) {
			System.out.println("test");
			
		}

		
		
	}

}
