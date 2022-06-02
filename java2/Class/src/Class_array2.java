import java.util.Random;
import java.util.Scanner;

public class Class_array2 {

	public static void main(String[] args) {
		//Scanner sc = new Scanner(System.in);
		//System.out.println("0~10까지 숫자를 하나 선택하세요");
	//	int no = sc.nextInt();
		
		
		memorys m = new memorys();
		/*memorys m = null;
		m = new memorys();
		*/
	//	m.ms(no);
		//메모리를 관리하기 위해 위와 같은 코드 사용.
	//	sc.close();
		m = new memorys();
		m.rd();
		m = null; // 해당 인스탄스를 비움.
	}

}

class memorys{
	public void ms(int user){
		//Math.random() 랜덤메소드 사용법 // 기본 자료형 double

		// random -> 보안코드, 인증코드, 추첨, 룰렛
		
		//double a = Math.random(); /// 0.0~1.0
		//0~10 기본적으로 랜덤 함수의 경우 소수점이기 때문에 double -> int 변경이 필요. 
		
	/*
		if(user==b) {
			msg="당첨";
		}
		else {
			msg="다음 기회에";
		}
		message(msg);
	}
	*/
		
	//for(int f=1;f<11;f++) {
		//int b = (int)(Math.random()*10); 
	//	System.out.println(b);
	//}
}
	
	
	public void rd() { // random util 사용법
		Random r = new Random(); // random 객체 생성 및 인스턴스 적용
		int w = 0;
		while(w<6) {
			System.out.print(r.nextInt(45)+1+" "); // 0~9까지 r.nextInt를 사용
			w++;
		}
		//r=null;
	}
}

