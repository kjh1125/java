import java.util.ArrayList;
import java.util.Arrays;

public class Test2 {

	public static void main(String[] args) {
		/*
		 * ���빮�� ���Ե� ȸ������ �� ���� �����Ϳ��� ����Ʈ�� ���� ������� ����� �̸��� �����Ͽ� ��� String�� int�� �ٲ� �� sort;
		 * ���μ��� �ڵ� ������ Free
		 */

		t2 t = new t2();
		t.sender();

	}

}

abstract class t1 {

	abstract public void sender();

	abstract void db();

}

class t2 extends t1 {

	ArrayList<String[]> d1;
	ArrayList<Integer[]> d2;

	@Override
	public void sender() {
		db();

		int w = 0;
		String a1 = "";

		while (w < this.d1.size()) {

			a1 += this.d1.get(w)[6] + ",";

			w++;
		}
		// System.out.println(a1);

		String s1[] = a1.split(",");
		// System.out.println(Arrays.toString(s1));

		int ww = 0;
		int s2[] = new int[11];
		while (ww < s1.length) {

			int a = Integer.parseInt(s1[ww]);
			s2[ww] = a;

			ww++;
		}

		Arrays.sort(s2);

		int www = 0;
		String aaa = "";

		while (www < s2.length) {

			aaa += s2[www] + ",";
			www++;
		}

		String s3[] = aaa.split(",");

		int wwww = 0;

		String result = "";

		while (wwww < s3.length) {

			int wwww1 = 0;

			while (wwww1 < s3.length) {

				if (s3[wwww].equals(this.d1.get(wwww1)[6])) {

					result += this.d1.get(wwww1)[0] + ",";
				}

				wwww1++;
			}

			wwww++;
		}
		System.out.println(result);
	}

	@Override
	void db() {
		String adata[][] = { { "ȫ�浿", "SKT", "010-1236-4879", "45", "���α�", "hong@gmail.com", "2200" },
				{ "�赵��", "LG", "010-1267-5879", "25", "������", "kim@nate.com", "2100" },
				{ "���Ѽ�", "LG", "010-1267-4112", "37", "���α�", "soso4112@naver.com", "1200" },
				{ "���缺", "SKT", "010-3221-8871", "41", "������", "jsung_kks@naver.com", "700" },
				{ "�ѿ�", "KT", "010-2455-4879", "22", "��õ��", "han1004@nate.com", "920" },
				{ "������", "SKT", "010-3770-4009", "34", "���α�", "kans32@gmail.com", "1250" },
				{ "���", "KT", "010-1606-3137", "20", "����", "kimsil_love@nate.com", "4505" },
				{ "���Ѱ�", "SKT", "010-3412-0902", "31", "��õ��", "hanso12@nate.com", "2125" },
				{ "������", "LG", "010-4557-8282", "30", "����", "jehyuk@naver.com", "8160" },
				{ "�̼���", "KT", "010-3738-4800", "55", "������", "sunyoung@nate.com", "4510" },
				{ "������", "SKT", "010-5242-0879", "42", "������", "chreey@gmail.com", "6720" } };

		d1 = new ArrayList<String[]>(Arrays.asList(adata));

	}

}