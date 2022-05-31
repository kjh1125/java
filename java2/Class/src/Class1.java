
public class Class1 {

	public static void main(String[] args) { //일반 main 함수
		
		Adata a = new Adata(); //Adata Class 먼저 로드
		Bdata b = new Bdata(); //Bdata Class 먼저 로드
		
		System.out.println(a.aa); //Adata Class 안에 aa라는 문자 자료형 객체값
		System.out.println(b.aa); //Bdata Class 안에 aa라는 문자 자료형 객체값
		
		Cdata c = new Cdata();
		/*
		 * C data 안에 변수 자료형을 선언함. => 현재 기본함수에서 값만 입력한 뒤 객체 값을 받아 산술식으로 계산함.
		 * 해당 변수를 인스턴스 변수라고 함. // 어떤 자료형을 사용하는지 숨길 수 있음. 보안성
		 */
		c.aa = 10;
		c.bb = 30;
		c.cc = c.aa+c.bb;
		System.out.println(c.cc);
		//System.out.println(c.cc);
		
	}

}
//aa는 각각의 다른 클래스에 있기 때문에 중복되지 않습니다.
class Adata{
	String aa = "홍길동";
}

class Bdata{
	String aa = "이순신";
}

class Cdata{
	//해당 Cdata에 있는 클래스에는 자료형에 대한 변수만 선언합니다.
	//단, 해당 클래스에 함수가 없으므로 계산수식 또는 sysout을 사용하지 못 함.
	int aa; 
	int bb;
	int cc;
}