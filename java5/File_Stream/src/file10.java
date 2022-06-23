import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OutputStream (output) - 최상위
//(File,Object,Audio)OutputStream - 하위 


public class file10 {

	public static void main(String[] args) throws IOException {
		
		
		String a = "123456789";
		// byte[] b : 문자열을 ASCII 형태의 배열로 변경할 때 사용. 
		byte[] b = a.getBytes(); // getBytes("언어패킷")메소드
		System.out.println(Arrays.toString(b)); // 아스키로 입력됨.
		
		try {
			OutputStream os = System.out; // 출력만 사용 Sysout 역할
			
			os.write(b,0,b.length); // (byte 배열이름, 배열번호,배열크기
			os.flush(); //출력파트 
			

			
		} catch (Exception e) {
			
		}
		
	}

}
