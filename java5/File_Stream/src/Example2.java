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
		 * �ش� ������ �� ������ �� ������Ȳ�� ������ �������Դϴ�. �ش� �������� 100�̸��� ������ ���� �︸ �߷��� 20220623.txt
		 * ���Ϸ� ������ ����ǵ��� �Ͻʽÿ�
		 * 
		 * 1. ���� �ҷ����� 2. 2�� �迭�� �ٲٱ� [��, ����] 3. ���ڸ� ������ 4. ���ǹ����� �迭 ������ϱ� 5. ���� ���� �����
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
