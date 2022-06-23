import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Scanner;

//Scanner를 이용한 파일로드 사용법 (output)
public class file5 {

	public static void main(String[] args) throws IOException{
		//system.in : input
		//system.out : output
		
		
		
		
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\db.txt",Charset.forName("UTF8"));
			Scanner sc = new Scanner(fr);
//			for(;;) { //loop시 예외처리로 빠질 수 있음.
//				String result = sc.next(); // 파일로드 된 입력 값을 result에 전달
//				if(result!=null) {
//			System.out.println(result); //출력
//				}
//				else {
//					sc.close();
//					break;
//				}
//				
//			}
			
			int count = 0;
			
			while(sc.hasNext()) { 
				//hasNext() : true,false가 나오는 명령어 다음 입력값이 있는지 확인 가능.
				
					sc.nextLine();
					count++;
				
			}
			System.out.println(count);
			sc.close();
			fr.close();
	
		
	}

}
