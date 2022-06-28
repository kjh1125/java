import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;

//Files�� �ش� ��� ������ �迭�� ���۽�Ű�� ���
public class file8 {

	public static void main(String[] args) throws IOException {
		
		//List�� �ֻ��� �迭 Ŭ���� (Object) ���� ����
		//Files : �ű� IO Ŭ����. readAllLines (��ü ������ �� ���� ��� ����)
		//Files + Paths.get("���");
		
		List<String> data = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\buffer.txt"));
		
		System.out.println(data);
		
		//�Ϲ� �迭�� �ٲٴ� ��: �ѱ������� �ջ�ǰ� ���� �������� �޸𸮿� ���ϰ� �ɸ�. 
		byte[] data2 = Files.readAllBytes(Paths.get("C:\\java5\\File_Stream\\src\\buffer.txt"));
		System.out.println(new String(data2));
		
	}

}