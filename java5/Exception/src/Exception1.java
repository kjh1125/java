/*
 * Exception : Try,catch와 함께 사용 (예외처리)
 * RuntimeException (Error 발생 시 예외처리 체크를 안 함) - null, class, Arraysize
 * OtherException (예외처리 체크사항 모두 함)
 * Exception[종류]
 * Arithmetic:0으로 나눌 때 발생하는 Exception
 * NullPointer: Null 객체를 참조할 때
 * ClassCast: 클래스형 변환
 * NumberFormat: 숫자형으로 변환
 * ArrayIndexOutOfBound: 배열참조시 인덱스 번호 오류
 * IOException: 입출력 문제 발생 **********
 * Exception: 전체 예외처리 현황 ***********
 */


public class Exception1 {

	public static void main(String[] args) {
		int a;
		String b = "a1";
		try { //try: 해당 값을 int로 변경
			a = Integer.valueOf(b);
			//error 발생 :a1이라는 문자를 int로 변경하다가(1) 
			//강제로 숫자 변환 중 a로 인해 오류발생(2)
		} catch (Exception e) {
			System.out.println(e); // 어디서 문제가 발생했는지 확인(3)
		}
		finally {
			b = b.replaceAll("[a-z]",""); //데이터 재처리(4)
			a = Integer.valueOf(b); //문법 재적용(5)
		    
		}
		System.out.println(a); //최종출력(6)
		
		
		
	}

}
