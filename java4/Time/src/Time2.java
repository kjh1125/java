import java.util.Timer;
import java.util.TimerTask;


public class Time2{

	
	public static void main(String[] args) {		
		Timer timer = new Timer(); // Timer util�� �̿��Ͽ� �ð��޼ҵ带 ����մϴ�.
		//(������ �޼ҵ�&Ŭ����, �� �� �� ������ �� , �ݼ� �ð�)  
		TimerTask tk = new TimerTask() {
			String adata[] = {"ȫ�浿","�̼���","������","������"};
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



class gogo extends TimerTask{ //TimerTask : �ð��۾�
    
	public void run() { //run - Task���� �����ϴ� �޼ҵ� ��ɾ�
	//System.out.println("�ð��Լ� �� �۵��� �ɱ��~?");
    }
}