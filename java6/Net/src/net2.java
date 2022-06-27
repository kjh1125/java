import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

//TCP(���� ��������) - ���ۼӵ��� ����. 
//UDP(����� ������ ��������) - ���ۼӵ��� ���� (1:1�� ��쿡�� ������ ����)
/*PORT (TCP�� �� ����)
 80 : WEB (http://)
 21 : FTP (���� ���۽� ���)
 22 : SSH - Linux, Unix (�������� and �����ܺ�����)
 23 : TELNET - Window (�����ܺ�����)
 443 : WEB (https://)
 25 : SMTP (���ϼ���) - ���� ������
 110 : POP3 (���Ϲޱ�) - ����, ���� �ޱ� (�񵿱�ȭ)
 143 : IMAP (���Ϲޱ�) - ����, ���� �ޱ� (������ ����ȭ)
 
 
 //SNMP : UDP (���ڹ߼۽ý���) SMS, VPN (���� IP) - UDP
 */
public class net2 {

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �̹��� �ּҸ� �Է����ּ���.");
		String url = sc.next();
		
		try {
			URL u = new URL(url); // URL(Ŭ����) : ��Ʈ��ũ ��θ� ����.
			URLConnection con = u.openConnection(); // �ش� ��θ� ����
			//System.out.println(con);
			int imgsize = con.getContentLength();
			//System.out.println(imgsize); //Ȯ�� �� -1(����)�� ������ �̹��������� �߸� �� ��. indexof ������ ����. 
			String imgtype = con.getContentType(); // ���� �Ӽ��� Ȯ���ϴ� ��� // image/jpeg
			//System.out.println(imgtype);
			long date = con.getDate(); //���� �ε� ��¥
			//System.out.println(date);
			
			//openStream : URL������ ���
			InputStream is = u.openStream(); //URL���� ������ �о�� �� ���.
			BufferedInputStream bi = new BufferedInputStream(is); //URL���� ���� ������ �ӽ�����. �ӵ������ ����
			FileOutputStream fo = new FileOutputStream("copy.jpg");
			byte data[] = new byte[1024]; // 1024byte = 1kb �� ������
			
			//fo.write(bi.read(data));
			
			int imgdata = 0;
			int cnt = 0; //�ݺ���
			while((imgdata=bi.read(data))!=-1) {
				fo.write(data,0,imgdata); // ������ ������ �ٿ��ֱ�.
				cnt += imgdata; // 1024++
				System.out.println("�ٿ�ε� ��..."+(cnt*100)/imgsize+"%");
			};
			fo.flush();
			fo.close();
			sc.close();
			System.out.println("�ٿ�ε� �Ϸ�");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
