import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.nio.charset.Charset;

//*공통 명령어 : read(),readLine()(buffer에서만 사용가능,filereader에서는 사용불가), next(), nextLine()
//BufferReader (Output) 
public class file7 {

	public static void main(String[] args) throws IOException {
		
		try {
			FileReader fr = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
			BufferedReader bf = new BufferedReader(fr);// readLine으로 값 한 번에 확인 가능.
			//BufferedReader : Temp(임시저장소) - 효율적으로 파일을 보다 빠르게 가져올 수 있음.
			//System.out.println((char)fr.read());
			
			//bf.close(); //bf(버퍼)를 닫으면 fr(불러온 자료)도 닫힘.
//			System.out.println(bf.readLine()); // 해당 임시저장소에 저장된 내용 중 라인 한 줄을 로드하게 됩니다.
			
//			FileReader fr2 = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
//			BufferedReader bf2 = new BufferedReader(fr2);
			
			
			//if(bf.readLine()!=null) { 
			//조건문에 readline 사용 시에도 한 번 실행한 것으로 간주되어 다음 실행 시 다음 라인이 출력됨.
//				String b1 = bf.readLine(); 
				// 첫 번째 라인을 다시 출력하고 싶은 경우 filereader를 다시 한 후 버퍼를 다시 로드하거나 String으로 해당 값을 저장하여 사용.
				
			//}
			
//			int w = 0;
//			while(w<=2) {
//				System.out.println(bf2.readLine()); 
//				// readLine을 여러 번 작동 시키는 경우 반복문 여부와 상관없이 다음 줄이 로드됨.
//				w++;
//			}
//			System.out.println(bf.readLine());
//			bf.close();
//			bf2.close();
			
			// 버퍼는 속도가 빠른 대신 휘발성메모리를 갖고있기 때문에 사용에 무조건 변수 또는 배열로 우선 받은 후 사용해야함.
			String line="";
			while((line=bf.readLine())!=null) {
				System.out.println(line);
			}
			// 데이터 문서에 라인갯수를 확인하는 방법
			//LineNumberReader : 파일 전체 라인 갯수를 확인하는 클래스
			FileReader fr2 = new FileReader("C:\\java5\\File_Stream\\src\\buffer.txt",Charset.forName("UTF8"));
			LineNumberReader lr = new LineNumberReader(fr2);
			int ea = 0;
			while((lr.readLine())!=null) {
				ea = lr.getLineNumber(); //2줄 += 사용 X
			
			}
			System.out.println(ea);
			
		} catch (Exception e) {
			System.out.println(e);
		}

	
	}

}
