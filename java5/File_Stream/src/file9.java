import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

//Reader(�ֻ���)
//(����) BufferedReader, FileReader, CharArrayReader - �������� ASCII
//(����) InputStreamReader - �̹���, ������, �����


//InputStream(�Է�)
public class file9 {

	public static void main(String[] args) throws IOException {
		//Stream�� ����ϴ� ���� : �̹���, ������, ����� ���� ������ �ε��� �� ����.
		//InputStream: ��� �Է���ġ�� ���� ���� �޴� Ŭ����, �⺻(int)-ASCII
		//InputStream: (�ֻ��� �Է���ġ)(Object ����)
		// -FileInputStream, AudioInputStream, ObjectInputStream
		// Stream�� ��� ���� close ���� �ʾƵ� �ڵ����� ����.
		InputStream is = new InputStream() { //�⺻ Ŭ������ �ε��Ͽ� �������̵� �޼ҵ带 �ҷ���.
			
			@Override
			public int read() throws IOException { //byte 1~2 
				int a = 15;
				return a;
			}
			
			
			
		};

		
		//InputStreamReader (�����Ŷ ����) (���ڵ�) -FileinputStream
		//InputStreamReader ("���ϸ�",ECUKR)orInputStreamReader ("���ϸ�",UTF8)
		InputStreamReader ir = new InputStreamReader(is,Charset.forName("UTF8")); 
		// reader�� ��ġ�� ���� ������ � ������ ���� �� �� ���� ����
		
		try {
		//	System.out.println(is.read());
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		//Ű���尪 �ε�
		InputStream user = System.in;
		try {
			int code = user.read(); //Ű���� �Է� ���� ASCII �ڵ尪���� ��ȯ��
			
			System.out.println(code);
			
		} catch (Exception z) {
			System.out.println(z);
			
		}
		
	}

}
