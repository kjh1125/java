
public class If {

	public static void main(String[] args) {
		
		byte a = 100;
		byte b = 100;
		
		
		// 조건문 (if~else) if와 else는 하나의 조건문에서 한 번만 사용 가능, else if 는 여러 번 사용 가능.
		
		if(a > b) { // if문
			System.out.println("a값이 더 큽니다.");
		}
		else if(a < b) { // else if문
			System.out.println("b값이 더 큽니다.");
		}
		else { //else문
			System.out.println("두 값이 같습니다.");
			
		}
		
		// else문이 없는 경우.
		
		if(a > b) { // if문
			System.out.println("a값이 더 큽니다.");
		}
		else if(a < b) { // else if문
			System.out.println("b값이 더 큽니다.");
		}
		
		else if(a == b) { // else if문
			System.out.println("두 값이 같습니다.");
		}
		
		// 부등호기호 : <, >, <=, >=, == 
		
	}

}
