import java.io.FileWriter;
import java.io.IOException;

//���� ����(write)
public class File4 {

	public static void main(String[] args) throws Exception {
		try {
			//FileWriter: ���� �����͸� ���Ͽ� ���� Ŭ����
			
			String user[] = {"41","b","c","d"};
			//FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt");
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\array.txt",true);
			//FileWriter�� true�� ����ϸ� ���� �Է� �� �����͸� �ʱ�ȭ ���� ����.
			
			
			for(int f=0;f<user.length;f++) {
				fw.write(user[f]); //write: ����,�迭������ ���� ���Ͽ� ����
			}
			
			fw.close(); //���� ���»����� ������
			
		} catch (Exception e) {
			System.out.println("test");
			
		}

		
		
	}

}
