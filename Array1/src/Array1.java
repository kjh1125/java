
public class Array1 {

	public static void main(String[] args) {
		//�迭�̶�? ������ ������ ���¸� ����. (Array)
		//�迭 ��ȣ [], {} 
		int a[] = new int[4]; // a[] ���������� �迭 ���� �޴� ����
		//new int[4] : ���ڷ� �� 4���� �����͸� ������
		
		a[0]=5; // �迭�� ������ 0���� ������
		a[1]=15;
		a[2]=25;
		a[3]=35;
		//new int[�迭����] : �ش� ������ ���� �����ͺ��� ������ Ŀ�� ��.
		
		
		int ea = a.length; //length�� �迭�� ������ �ľ��� �� �����.
		//System.out.println(ea);
		int f;
		for(f=0;f<ea;f++) {
		//	System.out.println(a[f]);
			//a[f] : a[0] ~ a[4] 
		}
		
		String user[] = new String[3];
		user[0]="ȫ�浿";
		user[1]="�̼���";
		user[2]="������";
		
		int k = user.length;
		int w = 0;
	
		do {
			//System.out.println(user[w]);
			w++;
			
		}while(w<k);

		
		//int[]z : �迭���� �����ϰ� �ش� �����͸� ���������� �ڵ� �����Ͽ� ����
		//int z[]: �迭���� �����ϸ鼭 ���� 0���� �����Ͽ� ���� ������.
		int[] z = new int[] {10,20,30,33,42,11}; //1���迭
		int zea = z.length;
		//System.out.println(zea);
		int ww=0;
		
		do {
		//	System.out.println(z[ww]);
			ww++;
			
		}while(ww<zea);
		
		
		// aa[] �迭 ���� �迭����+���� ���������� �־�� �ϴ� �������� ����.
		// ������ ����Ǹ鼭 a[] �迭���� {}�� �νĽ�ų �� �ֵ��� ��ȭ��.
		int aa[] = {10,11,22,33,55};
		
		int aea = aa.length;
		
		int w1=0;
		
		while(w1<aea) {
			
			System.out.println(aa[w1]);
			w1++;
		}
		
		
		
	}

}
