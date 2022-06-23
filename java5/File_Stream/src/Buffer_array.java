import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

//file7에 대한 추가 설명 BufferReader+Array (output->input->output)
public class Buffer_array {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr); 
		ArrayList<String> ar = new ArrayList<>(); //빈 배열 클래스
		
		String a = "";
		while((a=br.readLine())!=null) { //버퍼에 있는 값을 String 자료형으로 이전 후 
			ar.add(a); // 해당 arraylist에 배열로 추가시킴.
		}
		br.close();
		System.out.println(ar);
		
		System.out.println(ar.size());
		
	}

}
