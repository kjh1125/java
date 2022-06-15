import java.util.Timer;
import java.util.TimerTask;


public class Time2{

	
	public static void main(String[] args) {		
		Timer timer = new Timer(); // Timer util을 이용하여 시간메소드를 사용합니다.
		//(시작할 메소드&클래스, 몇 초 뒤 시작할 지 , 반속 시간)  
		TimerTask tk = new TimerTask() {
			String adata[] = {"홍길동","이순신","강감찬","유관순"};
			int a = 0;
			@Override
			public void run() {

				if(a>=4) {
					System.exit(0);
				
				}
				System.out.println(adata[a]);
				a++;
				
			}
		};
		
			timer.scheduleAtFixedRate(tk, 1000, 1000);
		}
	}



class gogo extends TimerTask{ //TimerTask : 시간작업
    
	public void run() { //run - Task에서 실행하는 메소드 명령어
	//System.out.println("시간함수 잘 작동이 될까요~?");
    }
}