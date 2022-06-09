import App.App1; // 다른 package를 로드 시 import하여 사용 함.
//외부 package에서 APP1.java 파일을 로드 및 기본 파일을 로드하여 사용한다.
public class Method11 {

	public static void main(String[] args) {
		
		App1 b= new App1(); // main 메소드를 로드하게 됨.

		//b.main(args);
		b.abox(); // main 메소드 안에서 abox라는 void 메소드를 로드하는 부분.

	}

}
