import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//Scanner�� �̿��� ���� ���� ���� (input)
public class file6 {

	public static void main(String[] args) throws IOException{
		
		
		try {
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\db.txt",true); //true ��� �� ���� ������ ����
			Scanner sc = new Scanner(System.in);
			System.out.println("���� �Է�");
			for(int f=0; f<3; f++) { //3�� �ݺ�
			String notice = sc.nextLine()+"\n";
			fw.write(notice); //�ش� �Է� ������ db.txt�� ����
			}
			sc.close();
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
