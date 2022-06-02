import java.util.Scanner;

public class Class_array3 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 다음 문자 배열 데이터 값이 있습니다.
		 * a1 : "홍길동","이순신","강감찬","유관순","김유신"
		 * a2 : "100","80","39","60","55"
		 * 
		 * "검색하고자 하는 이름을 적어주세요" 출력.
		 * 검색에서 이순신이라고 검색하게 되면 
		 * "이순신님은 80점 입니다." 라고 출력이 되어야 합니다.
		 * 
		 */
		
		String a[][] = {
			{"홍길동","이순신","강감찬","유관순","김유신"},
			{"100","80","39","60","55"}
		};
		Scanner sc = new Scanner(System.in);
		System.out.println("검색하고자 하는 이름을 적어주세요");
		String name = sc.next();
		
		data d1 = new data();
		d1.list(a,name);
		
		sc.close();
		d1 = null;

	}

}

class data{
	public void list(String a[][],String b) {
		
		String a1[][] = a; //main에서 가져온 2차 배열 값
		String b1 =b; // Scanner로 입력한 이름
		int w = 0; // 큰 반복문 반복횟수
		int aea = a1.length; //배열의 개수
		int aea1 = a1[0].length; //배열데이터 개수
		String msg=null; 
		
		while(w<aea) { //2번 반복
			int ct=0;
			
			while(ct<aea1) {// 5번 반복 
				if(b1.equals(a1[0][ct])) {
					msg = b1+"님의 점수는 "+a1[1][ct]+"점입니다";
					break;
				}
		
			ct++;
			}
			
			w++;
		}
		System.out.println(msg);
		
		
	}
}
