import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		
		//�� �迭 ������ �����Ͱ� �ִ� �迭�� Ŀ�����ϴ� ���
		
		int a[] = new int[2]; // 3���� ������ ������.
		int b[] = {1,2,3,4,5,6,7}; //7���� ��ü�� �ִ� ��Ȳ.
		//System.out.println(a);
		int aea = a.length; // a�迭 ������ ��ü�� �� ������
		int bea = b.length; // b�迭 �ȿ� �� ���� ������ ��ü
		//System.out.println(a.length);
		
		int w = 0;
		int ct = 0;
		
		while(w<bea) {
			//System.out.print(b[w]+" ");
			if(b[w]%2==0 && ct<aea) { // if(b�迭�� �� �� ¦���� && ���ο� a �迭 ��ü��ü ũ�⸸ŭ��) 
				// a�迭�� ������ ������ ��� ���� �߻��ϱ� ������ ���� �߰�.
				a[ct]=b[w]; // if���� ����ϱ� ������ a�迭���� ������ ī���� �Լ� �ʿ���.
				ct++; // ���ǿ� ���� �� a�� �ε��� ��ȣ�� +1�� ������Ŵ.
			}
			w++;
		}
		System.out.println(Arrays.toString(a));

	}

}
