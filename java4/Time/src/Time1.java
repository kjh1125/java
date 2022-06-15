
public class Time1 {

	public static void main(String[] args) {
		/*
		 * try~catch문: 예외처리기능 문법
		 */
		int dw = 1;
		
		do {
			
			
			try { //예외발생 코드를 적용
				Thread.sleep(1000); // 1000 = 1초
				//Thread.sleep : 일시정지 상태를 말함
			}catch(InterruptedException e){
				//InterruptedException: 해당 예외발생이 되었을 경우 처리하기 위한 문법
			}
			
			
			System.out.println(dw);
			
			dw++;
		}while(dw<11);

	}

}
