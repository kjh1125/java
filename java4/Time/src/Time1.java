
public class Time1 {

	public static void main(String[] args) {
		/*
		 * try~catch��: ����ó����� ����
		 */
		int dw = 1;
		
		do {
			
			
			try { //���ܹ߻� �ڵ带 ����
				Thread.sleep(1000); // 1000 = 1��
				//Thread.sleep : �Ͻ����� ���¸� ����
			}catch(InterruptedException e){
				//InterruptedException: �ش� ���ܹ߻��� �Ǿ��� ��� ó���ϱ� ���� ����
			}
			
			
			System.out.println(dw);
			
			dw++;
		}while(dw<11);

	}

}
