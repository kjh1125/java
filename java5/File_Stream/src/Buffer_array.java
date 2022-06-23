import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

//file7�� ���� �߰� ���� BufferReader+Array (output->input->output)
public class Buffer_array {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
		BufferedReader br = new BufferedReader(fr); 
		ArrayList<String> ar = new ArrayList<>(); //�� �迭 Ŭ����
		
		String a = "";
		while((a=br.readLine())!=null) { //���ۿ� �ִ� ���� String �ڷ������� ���� �� 
			ar.add(a); // �ش� arraylist�� �迭�� �߰���Ŵ.
		}
		br.close();
		System.out.println(ar);
		
		System.out.println(ar.size());
		
	}

}
