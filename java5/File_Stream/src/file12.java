import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//FileOutputStream

public class file12 {

	public static void main(String[] args) throws IOException{
		String test= "����";
		OutputStream os = new FileOutputStream("C:\\java5\\File_Stream\\src\\array.txt");
		
		byte data[] = test.getBytes(); //���ڸ� ASCII�ڵ�� ��ȯ
		os.write(data);
		os.flush(); 
		//Stream�� ����� ��� ���� �޸𸮿� �ְ� ��, flush() �޸� ���� ��� ���� �۾�
	}

}
