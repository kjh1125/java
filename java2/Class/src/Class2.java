
public class Class2 {
	// package를 사용하지 못 함 (default라서)
	public static void main(String[] args) {
//		//별도의 클래스 지정 후 함수를 이용하여 값을 전달받기
		
	//inject a = new inject();
	
	inject.oksign(); // 가장 기본이 되는 함수축, static void를 사용 시
	inject.test();
	members.user("이순신"); // 괄호 안에 있는 데이터(인자값)
	members.cal(5,10); // members 클래스 안 에 cal이라는 일반함수에 5와 10을 인자값으로 입력.
	}

}

class inject{
	//public static void : 가장 기본이 되는 일반 함수를 뜻합니다.
	public static void oksign(){
		String user = "홍길동";
		System.out.println(user);
	}
	public static void test(){
		int a = 1;
		int b = 3;
		int c = a+b;
		System.out.println(c);
	}
	
}

class members{
	
	public static void user(String names) {
		String msg = names + "님 환영합니다.";
		System.out.println(msg);
	}
	public static void cal(int a, int b) { // (자료형 이름, 자료형 이름) :인자값 두 개를 받음
		int c = a*b;
		System.out.println(c);
	}

}

