import java.util.Arrays;

public class Array5 {

	public static void main(String[] args) {
		
		//빈 배열 변수에 데이터가 있는 배열로 커스텀하는 방법
		
		int a[] = new int[2]; // 3개의 공간만 제공함.
		int b[] = {1,2,3,4,5,6,7}; //7개의 객체가 있는 상황.
		//System.out.println(a);
		int aea = a.length; // a배열 데이터 객체가 몇 개인지
		int bea = b.length; // b배열 안에 몇 개의 데이터 객체
		//System.out.println(a.length);
		
		int w = 0;
		int ct = 0;
		
		while(w<bea) {
			//System.out.print(b[w]+" ");
			if(b[w]%2==0 && ct<aea) { // if(b배열의 값 중 짝수만 && 새로운 a 배열 전체객체 크기만큼만) 
				// a배열에 공간이 부족할 경우 에러 발생하기 때문에 조건 추가.
				a[ct]=b[w]; // if문을 사용하기 때문에 a배열에는 별도의 카운터 함수 필요함.
				ct++; // 조건에 맞을 시 a의 인덱스 번호를 +1씩 증가시킴.
			}
			w++;
		}
		System.out.println(Arrays.toString(a));

	}

}
