import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner�� �̿��� ���Ϸε� ���� (output)
public class file5 {

	public static void main(String[] args) throws IOException{
		//system.in : input
		//system.out : output
		
		
		
		
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\db.txt",Charset.forName("UTF8"));
			Scanner sc = new Scanner(fr);
//			for(;;) { //loop�� ����ó���� ���� �� ����.
//				String result = sc.next(); // ���Ϸε� �� �Է� ���� result�� ����
//				if(result!=null) {
//			System.out.println(result); //���
//				}
//				else {
//					sc.close();
//					break;
//				}
//				
//			}
			
			int count = 0;
			
			while(sc.hasNext()) { 
				//hasNext() : true,false�� ������ ��ɾ� ���� �Է°��� �ִ��� Ȯ�� ����.
				
					sc.nextLine();
					count++;
				
			}
			System.out.println(count);
			sc.close();
			fr.close();
	
		
	}

}
