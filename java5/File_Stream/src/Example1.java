
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
		 * ���빮�� �ش� ����ڰ� ��ȭ������ �˻��մϴ�. �ش� ��ȭ���� �´� ������ ���� ���� ��� ��ȭ��ü�� ���� ������ ����ϰ� �˴ϴ�. ��Ʈ:
		 * Scanner ��� "�˻��� ��ȭ������ �Է��ϼ���" :���˵���2 [���˵���2] - ��õ5 2022�� 4������
		 * 
		 * "�˻��� ��ȭ������ �Է��ϼ���" :�Ƿη� �˻��� ��ȭ�� Ȯ�ε��� �ʽ��ϴ�.
		 * 
		 * 
		 * 
		 * Scanner sc = new Scanner(System.in); List<String> li =
		 * Files.readAllLines(Paths.get("C:\\java5\\File_Stream\\src\\movie.txt"));
		 * 
		 * String msg = "";
		 * 
		 * System.out.println("�˻��� ��ȭ������ �Է��ϼ���"); String name = sc.next().intern(); int
		 * w = 0; while (w < li.size()) { if (li.get(w).indexOf(name) != -1) {
		 * 
		 * msg = li.get(w); break; } else { msg ="�˻��� ��ȭ�� �����ϴ�."; }
		 * 
		 * w++; } sc.close();
		 * 
		 * 
		 * System.out.println(msg);
		 */

		try {
			// ���Ϸε� �� �޼ҵ� ����
			Scanner sc = new Scanner(System.in);
			System.out.println("1. ������, 2.����������");
			int user = sc.nextInt();

			if (user == 1) {

				movie m = new movie("movie.txt");
				sc.close();
			} else {
				System.out.println("���� �غ� ��");
				sc.close();
			}

		} catch (Exception e) {
			if (e.getMessage() != null) {
				System.out.println("���� �����ͺ��̽��� ���ӿ����� �߻��Ͽ����ϴ�");
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
		String data = this.bf.readLine(); // do~while�� ��� �� �ʱ� ���� ���� ��������� ó���� null���� �� ��.

		do {

			this.ar.add(data);

		} while ((data = this.bf.readLine()) != null);

	}

	public void search() {
		this.sc = new Scanner(System.in);
		System.out.println("�˻��� ��ȭ ������ �Է����ּ���");
		String subject = this.sc.next().intern(); // intern��ɾ� ������� equals�� �ƴ� ==�� ��� ����.
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
			System.out.println("�˻��� ��ȭ�� �����ϴ�");
			search();
		}
		
		sc.close();

	}

}
