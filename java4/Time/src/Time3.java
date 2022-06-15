
public class Time3 {

	public static void main(String[] args) {
		/*
		try {
			System.out.println("수업시작");
			Thread.sleep(5000);
			System.out.println("수업종료");
		}catch(InterruptedException e){
			System.out.println(e);
		}
		*/

		/*
		 * 응용문제 외부클래스O
		 * 메인클래스에서 해당 외부 클래스를 로드하면 해당 메소드에서 즉각적으로 8초간 로딩이 발생
		 * 8초 동안 "처리중입니다. 잠시만 기다려주세요"
		 * 8초 이후에 return으로 "입금이 모두 처리되었습니다" 라는 문자를 받도록 하십시오.
		 */
		test t = new test();
	
		
	}

}
class test{
	public test() {
		try {
			System.out.println("처리중입니다. 잠시만 기다려주세요");
			Thread.sleep(8000);
			String kkk = this.msg();
			System.out.println(kkk);
		}catch(InterruptedException e){
			System.out.println("예외발생"); // try문에서 에러가 발생하는 경우 ex)int c=1/0  
		}
	}
	public String msg() {
		return "입금이 모두 처리되었습니다.";
	}
}
