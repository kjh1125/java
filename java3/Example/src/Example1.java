import java.util.Random;
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		/*
		 * A파트: PC랜덤 숫자 추출, 스캐너 이용 5바퀴
		 * B파트: PC에서 랜덤 숫자와 사용자가 뽑은 숫자를 비교 및 결과 처리.
		 * 
		 * up&down 게임
		 * 1.PC가 숫자를 하나 선택 (random 함수) // 1~10
		 * 2. 총 기회는 총 5번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력
		 * 3. 만약에 PC가 숫자 7을 선택한 기준에서 사용자 숫자와 비교할 경우
		 * PC:7 사용자: 2 => 결과 : UP
		 * 4.  총 기회는 총 4번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력
		 * 5. PC:7 사용자: 4 => 결과 : UP
		 * 6.  총 기회는 총 4번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력
		 * PC:7 사용자: 7 => 결과 : 정답입니다. 모든 프로세서는 정지 system.exit(0);
		 */
		
		
		Random r = new Random();
		Example2 ex = new Example2();
		Scanner sc = new Scanner(System.in);
		/*
		 * 일반 random 형식 (random double 자료형)
		 * int pc = (int)(Math.random()*3+1); // 1,2,3 출력 원할 때.
		 * 
		 * util을 이용한 random형식
		 * Random r = new Random();
		 * int r1 = r.nextInt(10)+1; // 1~10 출력을 원할 때
		 */
		int r1 = r.nextInt(10)+1;
		int f;
		String msg; 
		
		for(f=5;f>0;f--) {
			msg = "총 기회는 "+f+"번 남았습니다. 1~10까지 번호 중 하나의 번호를 입력하세요";
			
			if(f>0) {
			System.out.println(msg);
			int sc1 = sc.nextInt();
			ex.ex2(sc1,r1);
			String out = ex.result();
			System.out.println(out);
			
			int check = out.indexOf("정답"); // indexOf 단어검색 (-1)없음 (0)있음.
			if(check==0) {
				break;
			}
			}
			
			else{
				System.exit(0);
			}
			
			
		}
		if(f==0){
			msg = "실패";
			System.out.println(msg);
		}
		r = null;
		sc.close();
		System.gc();
		
	}

}
