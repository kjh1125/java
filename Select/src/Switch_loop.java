
public class Switch_loop {

	public static void main(String[] args) {
		
		String sign="*";
		int total;
		/* case 안에 각각의 반복문을 사용할 수 잇습니다.
		 * 동일한 변수를 사용해도 되며, case는 각각 다르게 작동하기 때문에 문제가 되지 않습니다.
		 * 단, case는 하나의 조건이 맞을 경우 나머지 case는 작동하지 않습니다.
		 */
		int dw=1;
		
		
		switch(sign) { // switch 문에서 출력은 안에 넣어야 됨. 
		// 해당 문 같은 경우 처음에 total 값이 없기 때문에 밖에 출력문이 있을 경우 에러발생 
		case "+" ->{
		int f;
		total=0;
		for(f=1;f<=5;f++) {
			total+=f;
		}
		System.out.println(total);
		}
		case "-" ->{
			total=0;
			System.out.println("음수값은 출력되지 않습니다.");
		}
		case "*" ->{
			total=1;
			do {
				total*=dw;
				dw++;
			}while(dw<=5);
			System.out.println(total);
		}
		case "/" ->{
			total=0;
		}
		
		}
		
		
	}

}
