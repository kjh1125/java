import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


//Scanner를 이용한 파일 쓰기 사용법 (input)
public class file6 {

	public static void main(String[] args) throws IOException{
		
		
		try {
			FileWriter fw = new FileWriter("C:\\java5\\File_Stream\\src\\db.txt",true); //true 사용 시 이전 데이터 유지
			Scanner sc = new Scanner(System.in);
			System.out.println("내용 입력");
			for(int f=0; f<3; f++) { //3번 반복
			String notice = sc.nextLine()+"\n";
			fw.write(notice); //해당 입력 사항을 db.txt에 저장
			}
			sc.close();
			fw.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
