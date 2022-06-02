package box;

public class Class3 {

	public static void main(String[] args) {
		//자료형(데이터형) 변환
		//double -> int로 변환
		double a = 137.5;
		int b = (int)a; // 
		
		//int -> double로 변환
		int c = 35;
		double d = 0.1*(double)c;
		System.out.println(d);

		//String -> int
		String x = "35";
		String x2 = "156";
		//int z = Integer.parseInt(x); //parseInt(int 형에 사용하는 산술연산) 
		//문자형(String, char)으로 된 숫자를 숫자형(int, double등)으로 바꿀 때 
		//단독 실행하기 때문에 valueof 명령어에 비해 속도가 빠름
		int z = Integer.valueOf(x); 
		// 같은 값이 나오지만 valueof 메소드(메소드함수) -> parseInt를 거쳐서 작동되어 속도가 떨어짐
		// 문자와 섞인 값에서 숫자만 가져올 때 사용할 수 있음.
		int total = Integer.parseInt(x)+Integer.parseInt(x2); 
		// 문자형을 숫자로 변환하여 산술계산을 처리함.
		System.out.println(total);
		
		String j = "923456789";
		String j2= "9234567892"; //int로는 10억단위 이상 X 
		
		//int total2 = Integer.parseInt(j)+Integer.parseInt(j2);
		//Long 사용 시 Long.parseLong 사용.
		Long total2 = Long.parseLong(j)+Long.parseLong(j2);
		double total3 = (double)total2;
		System.out.println(total3);
		
		//문자(char) -> 문자(String) : 기본지식으로만 알고 있으면 됨.
		char p = '남'; // char 사용 시에는 '사용.
		String f = String.valueOf(p); //문자 -> 문자 // String에는 parse가 없고 valueof만 있음.
		
		System.out.println(f);
		
	}

}
