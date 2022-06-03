import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {
		/*
		 * 다음 사용자가 복권 관련 프로그램을 요청하였습니다.
		 * 사용자가 총 5개의 숫자를 입력하게 됩니다.
		 * "1~46번 사이의 숫자를 입력해주세요."
		 * 사용자가 입력한 5개의 숫자를 배열로 생성. (main에서 처리)
		 * 
		 * 외부 클래스를 이용하여 pc가 직접 당첨번호 5개를 랜덤하게 뽑아냅니다.
		 * pc가 뽑은 5개의 숫자를 배열로 생성합니다. (외부 클래스 메소드로 생성)
		 * 
		 * 별도의 결과 method를 하나 더 생성하여 사용자가 입력한 5개의 배열 데이터와,
		 * pc가 뽑은 배열 데이터를 해당 method로 전달하여, 출력하면 됩니다.
		 * 
		 * 단, 모든 사용하는 반복문은 무조건 do~while문으로 작성하시오.
		 * 
		 */

		Scanner sc = new Scanner(System.in);
		int dw=0;
		int data[] = new int[5];
		
		do {
			System.out.println("1~46번 사이의 숫자를 5개 입력해주세요.");
			int a = sc.nextInt();
			data[dw] = a;
			dw++;
		}while(dw<5);
		
		num n = new num();
		n.random(data);
		n = null;
		sc.close();
		
	}

}

class num
{
	public void random(int user[]) {
		Random r = new Random();
		int dw =0;
		int ra[] = new int[5]; 
		
		do {
			ra[dw] = r.nextInt(46)+1;
			dw++;
		}while(dw<5);
		r=null;
		total(user,ra);
		
	}
	
	public void total(int a1[],int a2[]) {
		
		
		System.out.println(Arrays.toString(a1));
		System.out.println(Arrays.toString(a2));
		
		
	}
	
}
