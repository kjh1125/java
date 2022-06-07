
public class Method2 {

	public static void main(String[] args) {
		// default package를 사용 시 해당 class 명을 호출하면 됨.
		// 단 package로 묶여있을 경우에는 제일 상단에 package를 선언해야 함.
		/*
		 tests ts = new tests();
		 ts.a2++;
		 System.out.println(ts.a2);
        */
		
		info i = new info();
		/* 아래와 같이 사용할 경우 에러 발생함.
		System.out.println(i.data1(20));
		System.out.println(i.data2(20));
		*/
		System.out.println(i.data3(20));
		String result = i.data4("홍길동");
		//data4 메소드 return값을 result 변수로 받아서 처리
		System.out.println(result);
		
	}

}

class info{
	/*
	 * Static 또는 void 메소드에서는 return이라는 명령어를 사용하지 못 함.
	 */
	public static void data1(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		//return z;
		
	}
	public void data2(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		//return z;
	}
	// 자료형 메소드(int, String)라고 말하며, 무조건 return을 사용해야 함.
	// 단, sysout 명령어를 사용하지 못 함.f
	public int data3(int abc) {
		int z = abc + 20;
		//System.out.println(z);
		return z;
	}
	// return값과 sysout을 같이 쓸 수는 있지만 sysout만 사용은 못함
	public String data4(String abc) { 
		String z = abc + "님 환영합니다.";
		return z;
	
	}
}