import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


//Stream�� �̿��� ���� �ε� 
public class file11 {

	public static void main(String[] args) throws IOException {
		try {
			//FileInputStream fs = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
			InputStream is = new FileInputStream("C:\\java5\\File_Stream\\src\\list.txt");
			System.out.println(is.available()); // available : ���� ��ü ũ��
			
			byte temp[] = new byte[is.available()]; //���� ũ�⸸ŭ �����������,�뷮 ���������� �� �� ����.
			//byte temp[] = new byte[1024*16]; // �뷮�� ����
			int ea = is.read(temp); // ASCII �ڵ�� ��ü�� �о ea�� ���� �޵��� ��.
			System.out.println(ea);
			String data = new String(temp,"UTF8"); // String �������·� �޾Ƽ� ���
			System.out.println(data);
			
		} catch (Exception e) {
			
			
		}
		
	}

}
