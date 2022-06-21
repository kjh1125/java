
public class Exception4 {

	public static void main(String[] args) {
		
		ex e = new ex();
		
		try {
			
	    e.loader("ok");
			
			//자기 자신을 바로 예외사황으로 만듬
		//Exception aaa = new Exception();
		//throw aaa; //throw : 자신을 호출하여 예외가 발생하면 자신을 호출한 후 
			
		} catch (Exception e2) {
			if(e2.getMessage()!=null) {
			System.out.println(e2);
			}
		}
		
		
	}

}

class ex{
	Exception e3=null;
	
	public void loader(String a) throws Exception { // try~catch를 받기 위한 클래스 로드
		// 잘못된 문법사항 (자신의 오류를 상위 main 클래스에 모두 전달하는 상황임
		/*
		if(a=="ok") {
			//정상이지만 loader 클래스에서 오류가 발생
			int b = Integer.valueOf(a); 
			
		}
		else {
			//해당 문법은 자신의 오류 사항에 대한 예외처리가 잘못된 경우
			this.e3 = new Exception();
			throw this.e3;
			
		}
		*/
		//잘 쓴 문법
		try {
			if(a=="ok") {
				//정상이지만 loader 클래스에서 오류가 발생
				int b = Integer.valueOf(a); 
			}
			else {
				System.out.println("test");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			this.e3 = new Exception(); //자신의 오류 사항을 리턴받아서 확인함
			throw this.e3;
			
		}
		
		
		
	}
	
}