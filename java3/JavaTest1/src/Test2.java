
public class Test2 {

	public static void main(String[] args) {

		int sc1 = 50;
		String msg;

		if (sc1 >= 90) {
			msg = "��� A�Դϴ�";
		} 
		else if (sc1 < 90 && sc1 >= 70) {
			msg = "��� B�Դϴ�";
		}
		else if (sc1 < 70 && sc1 >= 50) {
			msg = "��� C�Դϴ�";
		}
		else {
			msg = "�Ϲݵ���Դϴ�";
		}

		System.out.println(msg);

	}

}