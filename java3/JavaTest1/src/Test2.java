
public class Test2 {

	public static void main(String[] args) {

		int sc1 = 50;
		String msg;

		if (sc1 >= 90) {
			msg = "등급 A입니다";
		} 
		else if (sc1 < 90 && sc1 >= 70) {
			msg = "등급 B입니다";
		}
		else if (sc1 < 70 && sc1 >= 50) {
			msg = "등급 C입니다";
		}
		else {
			msg = "일반등급입니다";
		}

		System.out.println(msg);

	}

}