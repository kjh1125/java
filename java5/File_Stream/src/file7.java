import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

//*���� ��ɾ� : read(),readLine()(buffer������ ��밡��,filereader������ ���Ұ�), next(), nextLine()
//BufferReader (Output) 
public class file7 {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
			BufferedReader bf = new BufferedReader(fr);// readLine���� �� �� ���� Ȯ�� ����.
			//BufferedReader : Temp(�ӽ������) - ȿ�������� ������ ���� ������ ������ �� ����.
			//System.out.println((char)fr.read());
			
			//bf.close(); //bf(����)�� ������ fr(�ҷ��� �ڷ�)�� ����.
//			System.out.println(bf.readLine()); // �ش� �ӽ�����ҿ� ����� ���� �� ���� �� ���� �ε��ϰ� �˴ϴ�.
			
//			FileReader fr2 = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
//			BufferedReader bf2 = new BufferedReader(fr2);
			
			
			//if(bf.readLine()!=null) { 
			//���ǹ��� readline ��� �ÿ��� �� �� ������ ������ ���ֵǾ� ���� ���� �� ���� ������ ��µ�.
//				String b1 = bf.readLine(); 
				// ù ��° ������ �ٽ� ����ϰ� ���� ��� filereader�� �ٽ� �� �� ���۸� �ٽ� �ε��ϰų� String���� �ش� ���� �����Ͽ� ���.
				
			//}
			
//			int w = 0;
//			while(w<=2) {
//				System.out.println(bf2.readLine()); 
//				// readLine�� ���� �� �۵� ��Ű�� ��� �ݺ��� ���ο� ������� ���� ���� �ε��.
//				w++;
//			}
//			System.out.println(bf.readLine());
//			bf.close();
//			bf2.close();
			
			// ���۴� �ӵ��� ���� ��� �ֹ߼��޸𸮸� �����ֱ� ������ ��뿡 ������ ���� �Ǵ� �迭�� �켱 ���� �� ����ؾ���.
			String line="";
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
			// ������ ������ ���ΰ����� Ȯ���ϴ� ���
			//LineNumberReader : ���� ��ü ���� ������ Ȯ���ϴ� Ŭ����
			FileReader fr2 = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
			LineNumberReader lr = new LineNumberReader(fr2);
			int ea = 0;
			while((lr.readLine())!=null) {
				ea = lr.getLineNumber(); //2�� += ��� X
			
			}
			System.out.println(ea);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	
	}

}
