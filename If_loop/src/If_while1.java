
public class If_while1 {

	public static void main(String[] args) {
		
	/*
	 * ���빮�� while������ 10~30 ���� �߿���
	 * Ȧ���� ����Ͻÿ�
	 * Ȧ�� �� �� 20�̻��� Ȧ�� ���� ����մϴ�.
		
		int a = 10;
		
		while(a<=30) {
			if(a%2==1&&a>=20) {
				System.out.print(a+" ");
			}
			a++;
	 }
		
		int w = 10;
		while(w<31) {
			
			if(w%2==1) {
				if(w>=20) {
				System.out.print(w + " ");
				}
				}
			w++;
		}
	 */

		//ī���� ������ ���� �ľ��ϱ�
		
		/*
		 * 1~10���� ���� �߿� ¦ ������ �� ������ ������ ����ϼ���.
		 */
		
		int a=1; // �ݺ�
		int count = 0; //ī���� ���� ��
		
		while(a<=10) { 
			if(a%2==0) //¦���� ���
			{
				count++; // �ش� ������ ���� ��� +1�� ������.
			}
			
			a++;
		}
		//�ݺ��� ���� �� ���� ī���� ���� ����ϰ� ��.
		System.out.printf("1���� 10���� ¦���� ������: %d",count);

	}

}