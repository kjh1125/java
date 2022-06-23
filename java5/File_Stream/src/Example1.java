
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) throws IOException {
		/*
		 * 응용문제 해당 사용자가 영화제목을 검색합니다. 해당 영화제목에 맞는 데이터 값이 있을 경우 영화전체에 대한 정보를 출력하게 됩니다. 힌트:
		 * Scanner 사용 "검색할 영화제목을 입력하세요" :범죄도시2 [범죄도시2] - 추천5 2022년 4월개봉
		 * 
		 * "검색할 영화제목을 입력하세요" :뽀로로 검색한 영화는 확인되지 않습니다.
		 * 
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in); List<String> li =
		 * Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie.txt"));
		 * 
		 * String msg = "";
		 * 
		 * System.out.println("검색할 영화제목을 입력하세요"); String name = sc.next().intern(); int
		 * w = 0; while (w < li.size()) { if (li.get(w).indexOf(name) != -1) {
		 * 
		 * msg = li.get(w); break; } else { msg ="검색한 영화가 없습니다."; }
		 * 
		 * w++; } sc.close();
		 * 
		 * 
		 * System.out.println(msg);
		 */

		try {
			// 파일로드 및 메소드 전달
			Scanner sc = new Scanner(System.in);
			System.out.println("1. 개봉작, 2.개봉예정작");
			int user = sc.nextInt();

			if (user == 1) {

				movie m = new movie("movie.txt");
				sc.close();
			} else {
				System.out.println("서비스 준비 중");
				sc.close();
			}

		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println("현재 데이터베이스에 접속오류가 발생하였습니다");
			}
		}

	}

}

class movie {

	private String path = "C:\\java5\\File_Stream\\src\\";
	private FileReader fr = null;
	private BufferedReader bf = null;
	private ArrayList<String> ar = null;
	private Scanner sc = null;
	

	public movie(String m) throws IOException {

		try {

			this.fr = new FileReader(this.path + m, Charset.forName("UTF8"));
			this.custom();
			this.bf.close();
			this.search();

		} catch (Exception e1) {
			System.out.println(e1);
		}

	}

	public void custom() throws IOException {
		this.bf = new BufferedReader(this.fr);
		this.ar = new ArrayList<>();
		String data = this.bf.readLine(); // do~while문 사용 시 초기 값을 먼저 적용해줘야 처음에 null값이 안 들어감.

		do {

			this.ar.add(data);

		} while ((data = this.bf.readLine()) != null);

	}

	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("검색할 영화 제목을 입력해주세요");
		String subject = this.sc.next().intern(); // intern명령어 사용으로 equals가 아닌 ==을 사용 가능.
		boolean a = false;
		
		for (String moviesb : this.ar) {

//			if (moviesb.indexOf(subject) != -1) {
//				System.out.println(moviesb);
//			}
			
			if(moviesb.contains(subject))
			{
				System.out.println(moviesb);
				a = true;
				break;
			}

		}

		if(a==false) {
			System.out.println("검색한 영화가 없습니다");
			search();
		}
		
		sc.close();

	}

}
