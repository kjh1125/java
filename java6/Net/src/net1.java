import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class net1 {
	
	//UnknownHostException: Host ������ Ȯ�ε��� ���� ��� 
	public static void main(String[] args) throws UnknownHostException{
		//InetAddress : IPnetworkAddress
		//getByName: ������ ������ ��
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);
//		System.out.println(ia.getHostName()); //������ ��
//		System.out.println(ia.getHostAddress()); // DNS�� ����� IP
		
		
		//getAllByName: �����ο� IP ���� Ȯ�� /�迭�� �޾ƾ� ��.
		InetAddress ia2[] = InetAddress.getAllByName("daum.net");
		System.out.println(ia2.length); // DNS�� ����� ip�� �� ������ Ȯ��
		
		int w = 0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
		
	}

}
