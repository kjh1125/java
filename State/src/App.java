
public class App {

	public static void main(String[] args) {
	/*	
		short a, b;
		a = 25+31*4+12;
		b = 15*3+9+14;
		
		System.out.println("a는"+a);
		System.out.println("b는"+b);
		System.out.println("a와 b중 작은 값 출력");
		if(a<b) {
			System.out.println(a);
		}
		else if(a>b){
			System.out.println(b);
		}
		else {
			System.out.println("두 값이 같음");
		}
	}
    */
			
    int a = 25+31*4+12;
	int b = 15*3+9+14;
	
	if(a>b) {
		System.out.println("공식 2번 값이 작습니다.");
	}
	else if(a<b)
	{
		System.out.println("공식 1번 값이 작습니다.");
	}
	else {
		System.out.println("두 값이 같습니다.");
	}
	
	/*
	 * 2진수 0~1 // 짝 수 홀 수 구분에서만 사용.
	 * 8진수 0~7 // 거의 사용 안 함.
	 * 16진수 0~9 abcdef // 암호화 시 사용 	 */
	
	// 해당 값을 2진수로 짝수, 홀수로 확인하기
	
	int c = b%2; //%기호 사용 시 0 또는 1로 나머지 값이 출력이 됨. 
	
	if(c==0) {
		System.out.println("짝수입니다.");
	}
	else {
		System.out.println("홀수입니다.");
	}
	
	}
}
