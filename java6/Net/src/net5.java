import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

//Socket통신 : Server, Client : 메시지, 파일 전달, 송수신 통신 (양방향 통신)

//HTTP통신 : Image, 동영상, 음악 사용자(요청)랑 서버(응답)랑 송수신 통신 (단방향 통신)
public class net5 {
//Server // net6(Client)과 연동
	public static void main(String[] args) throws Exception {
		System.out.println("Server Connect");
		int port = 8080; // 오픈할 포트번호를 세팅 (단, 절대 중복된 포트를 사용하면 안 됨.)
		String msg = "Success Connect!!";

		try {
			ServerSocket ss = new ServerSocket(port); // ServerSocket : 오픈시킬 포트를 적용
			//연결을 지속적으로 유지하기 위해서는 ServerSocket은 절대 재로드하면 안 됨.
			while (true) {
				System.out.println("연결 대기중.....");
				Socket sc = ss.accept(); // accept() : 클라이언트가 들어오는 것을 대기하는 역할을 하게함.
				System.out.println("호스트:통신 연결 성공");
				// Server에서 client를 통해 받는 통로
				InputStream is = sc.getInputStream(); // client에서 보내는 값을 읽는 통로
				// Client로 보내는 통로
				OutputStream os = sc.getOutputStream(); // client로 값을 전송
				byte data[] = new byte[1024]; // client에서 받는 값을 byte로 받음
				int n = is.read(data); // 해당 값을 읽어들임

				String msgclient = new String(data, 0, n); // 해당 값을 배열로 확인하여 변수로 이관
				System.out.println(msgclient); // 이관된 값을 출력시키기 위함

				String aws = "반갑습니다."; // 서버에서 보내는 메시지
				os.write(aws.getBytes()); // 메시지를 클라이언트로 보내기위한 메모리 저장
				os.flush();
				os.close();
				is.close();
				sc.close();
			}
		} catch (Exception e) {
			System.out.println("서버중복");
		}

	}

}
