import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class net1 {
	
	//UnknownHostException: Host 정보가 확인되지 않을 경우 
	public static void main(String[] args) throws UnknownHostException{
		//InetAddress : IPnetworkAddress
		//getByName: 접속할 도메인 명
		InetAddress ia = InetAddress.getByName("localhost");
		System.out.println(ia);
//		System.out.println(ia.getHostName()); //도메인 명
//		System.out.println(ia.getHostAddress()); // DNS에 연결된 IP
		
		
		//getAllByName: 도메인에 IP 정보 확인 /배열로 받아야 함.
		InetAddress ia2[] = InetAddress.getAllByName("daum.net");
		System.out.println(ia2.length); // DNS에 적용된 ip가 몇 개인지 확인
		
		int w = 0;
		while(w<ia2.length) {
			System.out.println(ia2[w].getHostAddress());
			w++;
		}
		
	}

}
