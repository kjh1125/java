
public class datatype {

	public static void main(String[] args) {
		String data[] = {"홍길동"};
		
		//intern(): String을 equals를 사용하지 않고 ==(부등호)로 사용가능.
		String a = "홍길동";
		String b = "홍길동";
		String c = new String("홍길동").intern(); 
		// new 명령어로 heap에 지정된 문자열을 intern명령어로 Spring pool로 변경 가능, 
		// indent(0),indent(1)등으로 별개로 그룹 지정 가능.
		String d = new String("홍길동");
		String e = data[0];
		//Scanner sc = new Scanner(System.in);

		System.out.println(c==a);
		
		/*
		if(c==e) {
			System.out.println("값이 같습니다");
			
		}
		*/
		
		// new String : 소속이 없는 자유분방한 자료형(문자,배열값)
		
	}

}
