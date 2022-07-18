import java.util.ArrayList;
import java.util.Random;

public class test5 {

	public static void main(String[] args) {
		/*
		 * 컴퓨터가 1~9까지 숫자를 총 5번 반복 합니다. 5번 반복하는 동안 배열에 해당 값이 저장 되어야 합니다. 단, 중복된 값은 절대 배열에
		 * 입력 되지 않도록 합니다. ※ 힌트 배열은 ArrayList를 사용하며, 배열에 중복값 여부는 별도의 return 메소드를 활용하여 체크
		 * 되도록 합니다.
		 * 
		 * 정답 예시 [2,3,7,9,4]
		 * 
		 */

		test5_1 t = new test5_1();
		t.setter();
		
		
	}

}

class test5_1{
	
	ArrayList<Integer> sum = new ArrayList<>();
	ArrayList<Integer> sum2 = new ArrayList<>();
	String a="";
	
public void setter() {
	Random r = new Random();
	
	int w = 0;
	
	while(w<5) {
		int b = r.nextInt(9)+1;
		this.sum.add(b);
		
		w++;
	}
	
	for(int num: this.sum) {
		if(!this.sum2.contains(num)) {
			this.sum2.add(num);
			
		}
		
		else{
			this.a+=num+",";
		}
		
	}
	
	
	
	System.out.println(this.sum2);
	System.out.println("중복값: "+this.a);

}




}


