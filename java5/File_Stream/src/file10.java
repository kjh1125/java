import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Arrays;

//OutputStream (output) - �ֻ���
//(File,Object,Audio)OutputStream - ���� 


public class file10 {

	public static void main(String[] args) throws IOException {
		
		
		String a = "123456789";
		// byte[] b : ���ڿ��� ASCII ������ �迭�� ������ �� ���. 
		byte[] b = a.getBytes(); // getBytes("�����Ŷ")�޼ҵ�
		System.out.println(Arrays.toString(b)); // �ƽ�Ű�� �Էµ�.
		
		try {
			OutputStream os = System.out; // ��¸� ��� Sysout ����
			
			os.write(b,0,b.length); // (byte �迭�̸�, �迭��ȣ,�迭ũ��
			os.flush(); //�����Ʈ 
			

			
		} catch (Exception e) {
			
		}
		
	}

}
