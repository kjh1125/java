

public class Method8 {

	public static void main(String[] args) {
		/*
		 * ���빮��. ���� ���α׷��Ӱ� �ش� DB(Database)�� �� �� 
		 * Ȧ�� ���� ���� �� ������ �ް��� �մϴ�.
		 * �ش� ������ ��µ� �� �ֵ��� �ڵ带 �ۼ��Ͻÿ�.
		 */
		odbc bc = new odbc();
		System.out.println(bc.oddsum());
		bc = null;

	}

}

class odbc{
	private int odd[]; // �迭���� ������� �ʵ��� ���.
	private int oddea = 0; // Ȧ���� ��� +1�� �����ϰ� �ϱ� ���� �ʵ� ���� ��. 
	
	public odbc() {
		int odata[] = {15,22,17,14,32,35,19,33};
		this.odd = odata; 
		int oddea1 = odd.length;
		
		int w=0;
		
		
		do{
			if(odd[w]%2==1) {
				this.oddea++; // Ȧ���� ��� +1�� ����.
			}
			
			w++;
		}while(w<oddea1);
		

		oddsum();
		
		
		
	}
	public int oddsum() {
		return this.oddea; // �������� return ��Ŵ.
	}
}