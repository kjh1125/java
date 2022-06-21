import java.io.FileReader;
import java.io.IOException;

public class file1 {
	/*
	 * I/O : inputStream, OutputStream
	 * �Է� ��Ʈ��: ���α׷����� ������ ��Ʈ�� (InputStream: Ű����, ���콺, HDD)
	 * ��� ��Ʈ��: ���α׷����� ������ ������ �κ� (OutputStream: �����, ������)
	 * Stream: input, output ����� ó���ϴ� �κ�
	 * JAVA.io (API)
	 * File, FileReader (�Ϲ�) //�����ڵ� -> StreamAPI (FileinputStream) // Stream API ������� ó���ӵ� ���
	 * FileWriter -> StreamAPI (FileoutputStream)
	 */
	
	
	public static void main(String[] args) throws IOException,Exception{
		/*FileReader: 
		 1.���ڵ����͸� ���Ϸκ��� �д� Ŭ����
		 2.���� �̸��� ������ �μ���(�Ķ����)���� ����ؼ� FileReader ��ü ����
		 public void abc(String a)
		*/ 
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\list.txt");
			String a ="a1";
			tests(a);
		} catch (IOException z) { // IOException�� ���� ����ó��
			System.out.println(z.getMessage());
		}
		catch (Exception z1) { // �Ϲ� Exception�� ���� ����ó�� ���
			System.out.println(z1.getMessage());
		}
	
		
		

	}

	static public void tests(String a ) throws Exception{
		
		int k = Integer.valueOf(a);
		IOException ex = new IOException();
		throw ex;
		
	}
	
}
