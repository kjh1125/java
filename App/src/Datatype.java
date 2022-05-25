
public class Datatype { //자료형을 여러 개 사용하는 이유 = 서버처리속도 및 최적화

	public static void main(String[] args) {
	   String a = "1234"; //String(문자형)사용 시 "" 무조건 사용
	   System.out.println(a);
	   
	   /* 정수형 시작*/
	   byte b = 127; //byte: -128~127
	   System.out.println(b);
	   
	   short c = 32767; // short: -32,768 ~ 32,767
	   System.out.println(c);
	   
	   int d = 100000; // int: –2,147,483,648 ~ 2,147,483,647
	   System.out.println(d);
	   
	   long f = 9999999L; // long(통계 시 주로 사용) 사용 시 끝에 L 사용 시 한계치 해제 가능.
	   // long: 9,000~~~ 18개 이상, 기본메모리 추가할당 시 범위 늘어남
	   System.out.println(f);
	   /* 정수형 끝 */
	
	   /* 실수형 시작*/
	   
	   //float가 double보다 메모리 처리량이 낮음.
	   //변수 이름 지정 시 다른 변수와 같게 쓰면 안 됨.
	   
	   float z = 3.5f; //3.402480000000+38
	   //.이 문자로 인식되어 숫자 뒤에 무조건 f를 넣어줘야 함.
	   System.out.println(z);
	   
	   double k = 44.5d; //1.784+308
	   // double의 경우 끝에 d 넣든 말든 상관없음.(버전업되어 변경 됨)  
	   System.out.println(k);
	   
	   /* 실수형 끝*/
	}

}
