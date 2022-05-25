import java.util.Scanner;

public class Scan4 {

	public static void main(String[] args) {
	   
		Scanner a = new Scanner(System.in);
		System.out.println("입력할 내용을 적어주세요!");
		//String memo = a.next(); //next(): 스페이스바 입력 전까지만 적용됨. 
		String memo = a.nextLine(); //nextLine(): 스페이스바 포함 모두 입력 적용
		System.out.println(memo);

		a.close(); // scanner를 종료. // close하지 않으면 memory 계속 소모되기 때문에 Scanner 사용 후 항상 close 사용해주는게 좋음.
		
		String mid = "park"; //String = %s
		byte age = 25; //int나 byte등 숫자는 %d
		/* 
		
		[중요사항] 
		%s: String(문자열) + 숫자
		%d: int,byte,long 등 정수
		%f: float, double. 실수
		%t: date, time 시간
		%b: boolean(true,false)(참,거짓)
		
		*/
		// System.out.println(mid+"님의 나이는"+age+"입니다.");
		
		System.out.printf("%s님의 나이는 %d 입니다",mid,age); //문자열 format 출력 printf: format을 뜻함. 
	}

}
