import java.util.Arrays;

public class Example7 {

	public static void main(String[] args) {
		/*
		 * 다차원 배열로 생성 + 외부 클래스 및 메소드 사용.
		 * [data]
		 {"홍길동","합격"},
		 {"이순신","합격"},
		 {"강감찬","불합격"},
		 {"김유신","합격"},
		 {"유관순","불합격"},
		 {"장보고","불합격"}
		 * 
		 * 다차원 배열 형태로, 해당 값중 합격자만 출력.
		 * 단, 배열 값을 외부 클래스 안에 메소드에서 처리가 되도록 합니다.
		 * 결과 : 홍길동 이순신 김유신
		 */
		test t = new test();
		t.test1();
		t=null;
		
	}

}

class test{
	
	public void test1() {
		
		String data[][] = {
				 {"홍길동","합격"},
				 {"이순신","합격"},
				 {"강감찬","불합격"},
				 {"김유신","합격"},
				 {"유관순","불합격"},
				 {"장보고","불합격"}
		};
		
		int dea = data.length;
		int w = 0;
		String name = "";
		
		do {
			if(data[w][1].equals("합격"))
					{
				name += data[w][0]+" ";
			}
			
			w++;
		}while(w<dea);
		
		String p[] = name.split(" ");
		System.out.println(Arrays.toString(p));
		
	}
}
