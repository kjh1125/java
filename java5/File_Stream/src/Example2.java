import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Example2 {

	public static void main(String[] args) throws IOException {
		/*
		 * 해당 정보는 각 지점별 댐 수위현황을 적용한 데이터입니다. 해당 데이터중 100미만의 수위를 가진 댐만 추려서 20220623.txt
		 * 파일로 내용이 저장되도록 하십시오
		 * 
		 * 1. 파일 불러오기 2. 2차 배열로 바꾸기 [댐, 숫자] 3. 숫자만 빼오기 4. 조건문으로 배열 재생성하기 5. 파일 새로 만들기
		 *
		 */

		List<String> li = Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\info.txt"));

		ArrayList<Double> d = new ArrayList<>();
		ArrayList<String> s = new ArrayList<>();
		String a1[] = new String[30];

		String a = "";

		int w = 0;

		while (w < li.size()) {

			a += li.get(w) + ",";

			w++;
		}

		a1 = a.split(",");
		System.out.println(Arrays.toString(a1));

		int w1 = 0;

		while (w1 < a1.length) {

			try {
				d.add(Double.parseDouble(a1[w1]));
			} catch (Exception e) {
				s.add(a1[w1]);
			}

			w1++;
		}

		int w2 = 0;

		Path data = Paths.get("C:\\java5\\File_Stream\\src\\20220623.txt");
		Files.createFile(data);
		
		OutputStream os = new FileOutputStream("C:\\java5\\File_Stream\\src\\20220623.txt");
		String name = "";
		byte data[] = new byte[1024];
		
		
		while (w2 < d.size()) {

			if (d.get(w2) < 100) {
				name = s.get(w2);
				byte data[] = name.getBytes();
			}

			w2++;
		}

	}

}
