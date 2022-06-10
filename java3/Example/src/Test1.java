import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주소를 입력하시오");
		String ad = sc.nextLine();
		System.out.println("전화번호를 입력하시오");
		String tel = sc.nextLine();
		
		System.out.println("해당정보를 확인해주세요");
		System.out.printf("주소: %s 전화번호: %s",ad,tel);
		
		sc.close();
		

	}

}
