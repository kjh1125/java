import java.util.Scanner;

public class Class6 {

	public static void main(String[] args) {
		
		int num = 3;
		datalist da = new datalist();
		da.array_data(num);
		
		//String pay ="신용카드";
		String pay = "무통장";
		if(pay.equals("신용카드")) {
			da.pay1(); //해당 조건에 맞는 메소드를 호출
		}
		else {
			da.pay2(pay); // 메소드에 객체값을 태워서 전달 (객체값은 무한대 여러 개 태우고 싶은 경우 중간에 , 사용)
		}
		
		/*
		 * 응용문제 해당 로드할 class명은 agrees라는 이름을 가지고 있습니다.
		 * main메소드에서 사용자가 "동의함", "동의안함"을 입력하게 됩니다.
		 * 동의함으로 입력되었을 경우 "회원가입이 진행됩니다."라는 메세지를 출력하고
		 * 동의 안 함으로 입력 시 "동의를 하셔야 진행됩니다."
		 * 라고 출력되도록 하시오.
		 * 단, agrees 클래스 안에 void 메소드 한 개 또는 두 개를 선택하여 
		 * 코드를 제작하시오. 
		 */
		
		agrees ag = new agrees();
		Scanner sc = new Scanner(System.in);
		System.out.println("회원가입 동의하면 동의함 아니면 동의안함을 입력해주세요");
		String a = sc.next();
		ag.yes(a);
		
		sc.close();
		
	}

}

class datalist{
	/* static메소드를 활용하는 형태: 여러 package에서 해당 메소드를 
	 * 자주 사용해야 되는 경우 static 메소드를 활용.
	 * 
	 * static(정적메소드): 오버라이딩을 사용할 수 없음.
	 * void(동적메소드)만 사용 시: 오버라이딩을 사용할 수 있음.
	 * 오버라이딩 ex)
	 * class a{
	 * void 메소드
	 * }
	 * class b extend a{
	 * void 메소드
	 * }
	*/
	
	public void array_data(int a) { //static이 없는 메소드
		
		int w = 1;
		while(w<=9){
			//System.out.print(a*w+" ");
			w++;
		}
		
	}
	
	public void pay1() {
		//System.out.println("신용카드로 결제 진행합니다.");
		
	}
	
    public void pay2(String pm) {
    //	System.out.println(pm+"으로 결제 진행합니다.");
	}
	
}

class agrees{
	public void yes(String a) {
		String msg;
		
		if(a.equals("동의함")) {
			msg = "회원가입이 진행됩니다.";
		
		}
		else {
			msg = "동의를 하셔야 진행됩니다.";
			
		}
		System.out.println(msg);
		
	}
	
	
}

/*
 * 필기시험 문제
 * 1. Editor의 종류?(이클립스, vs코드 등)
 * 2. Database의 종류(SQL 등)
 * 3. java에서 사용하는 자료형이 아닌 것은?
 * 4. java에서 사용하는 구분언어가 잘못 된 것은? ex)Project란?, package란?, import, class란?
 * 5. java에 대한 설명 중 잘못 된 것은?(java의 역사X, java의 특징O)
 * 6. 다음 문법코드 중 잘못 된 부분은?
*/
