package List1;
import java.util.ArrayList;
import java.util.Arrays;

public class list2 {

	public static void main(String[] args) {
		/*
		 * 응용문제
		 * 해당 데이터 값 중 휴면고객 데이터는 모두 삭제해야 합니다.
		 * 고객 데이터 
		 * {"김수빈","김정현","김창순","박도현","이경훈","정재훈","하윤성"};
		 * 정재욱,하윤성만 출력
		 
		String customer[] = {"김수빈","김정현","김창순","박도현","이경훈","정재욱","하윤성"};
		ArrayList<String> cu = new ArrayList<>(Arrays.asList(customer));
		int ea = cu.size();
		int w1 = 0;
		while(w1<ea) {
			
			if(!cu.get(0).equals("정재욱") && !cu.get(0).equals("하윤성")) {
				
				cu.remove(0);
				
			}
			System.out.println(cu);
			w1++;
		}
		
	
		int w = 4;
		while(w>=0) {
			
			cu.remove(w);
			
			w--;
		}
		
		int w = 0;
		while(w<ea) {
			int ea2 = cu.size(); // node 갯수를 다시 파악함
			int ww=0;
			
			while(ww<ea2) {
			
			if(!cu.get(ww).equals("정재욱") && !cu.get(ww).equals("하윤성")) {
				
				cu.remove(0);
				System.out.println(cu);
			}
			
			
		}
			w++;
		}
		
		
		 * 응용문제 짝수의 숫자를 모두 삭제
		 * 10,7,6,1,11,37,41,22
		 * 7,1,11,37,41
		*/
		
		Integer number[] = {10,10,7,6,1,11,37,41,22};
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(number));
		/*
		int w = num.size();
		int ww = w-1;
		
		
		while(ww>=0) {
			
			if(num.get(ww)%2==0)
			{
				num.remove(ww);
			}
			
			ww--;
		}
		System.out.println(num);
		*/
		
		int no =num.size();
		int z = 0;
		
		do {
			int no2 = num.size(); 
			int zz=0;
			System.out.println(num);
			do {
				if(num.get(zz)%2==0) {
				num.remove(zz);
				break;
				}
				zz++;
				
			}while(zz<no2);
			
			
			z++;
		}while(z<no);
		
		
		
	}
	
	
}

