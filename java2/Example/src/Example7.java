import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * ������ �迭�� ���� + �ܺ� Ŭ���� �� �޼ҵ� ���.
		 * [data]
		 {"ȫ�浿","�հ�"},
		 {"�̼���","�հ�"},
		 {"������","���հ�"},
		 {"������","�հ�"},
		 {"������","���հ�"},
		 {"�庸��","���հ�"}
		 * 
		 * ������ �迭 ���·�, �ش� ���� �հ��ڸ� ���.
		 * ��, �迭 ���� �ܺ� Ŭ���� �ȿ� �޼ҵ忡�� ó���� �ǵ��� �մϴ�.
		 * ��� : ȫ�浿 �̼��� ������
		 */
		test t = new test();
		t.test1();
		t=null;
		
	}

}

class test{
	
	public void test1() {
		
		String data[][] = {
				 {"ȫ�浿","�հ�"},
				 {"�̼���","�հ�"},
				 {"������","���հ�"},
				 {"������","�հ�"},
				 {"������","���հ�"},
				 {"�庸��","���հ�"}
		};
		
		int dea = data.length;
		int w = 0;
		String name = "";
		
		do {
			if(data[w][1].equals("�հ�"))
					{
				name += data[w][0]+" ";
			}
			
			w++;
		}while(w<dea);
		
		String p[] = name.split(" ");
		System.out.println(Arrays.toString(p));
		
	}
}
