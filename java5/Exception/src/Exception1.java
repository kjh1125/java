/*
 * Exception : Try,catch�� �Բ� ��� (����ó��)
 * RuntimeException (Error �߻� �� ����ó�� üũ�� �� ��) - null, class, Arraysize
 * OtherException (����ó�� üũ���� ��� ��)
 * Exception[����]
 * Arithmetic:0���� ���� �� �߻��ϴ� Exception
 * NullPointer: Null ��ü�� ������ ��
 * ClassCast: Ŭ������ ��ȯ
 * NumberFormat: ���������� ��ȯ
 * ArrayIndexOutOfBound: �迭������ �ε��� ��ȣ ����
 * IOException: ����� ���� �߻� **********
 * Exception: ��ü ����ó�� ��Ȳ ***********
 */


public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try { //try: �ش� ���� int�� ����
			a = Integer.valueOf(b);
			//error �߻� :a1�̶�� ���ڸ� int�� �����ϴٰ�(1) 
			//������ ���� ��ȯ �� a�� ���� �����߻�(2)
		} catch (Exception e) {
			System.out.println(e); // ��� ������ �߻��ߴ��� Ȯ��(3)
		}
		finally {
			b = b.replaceAll("[a-z]",""); //������ ��ó��(4)
			a = Integer.valueOf(b); //���� ������(5)
		    
		}
		System.out.println(a); //�������(6)
		
		
		
	}

}
