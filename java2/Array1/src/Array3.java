import java.util.Arrays;
import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		/*
		 * {5,10,15,20,25,30,35}
//		 */
//		
//		Scanner sc = new Scanner(System.in);
//		int data[] = {5,10,15,20,25,30,35};
//		/*
//		 * foreach문을 사용할 때는 인덱스 번호가 필요없이 사용할 경우
//		 * for,do~while문 사용할 때는 인덱스 번호가 필요할 때 사용
//		 * [0][1][2] : 인덱스 번호
//		 */
//		
//		for(int f:data) { // int f가 순차적으로 data 배열값을 받아서 저장시킴.
//			if(f%2==0) {
//		//	System.out.print(f+",");
//			}
//		}
//		
//		String pay[] = {"무통장입금","신용카드","휴대폰","상품권","쿠폰"};
//		
//		//System.out.println("결제하고자 하는 형태를 선택해주세요.");
//		//String pm=sc.next();
//		
//		for(String z:pay) { //배열 데이터가 문자이므로 받는 변수형태 또한 문자형을 사용해야 합니다.
//		//	if(pm.equals(z)) {
//				
//				if(z.equals("휴대폰")) {
//					//System.out.println("현재 시스템 점검으로 해당 결제는 사용하실 수 없습니다.");
//				}
//				else {
//					//System.out.println(pm+"(으)로 결제 진행됩니다.");
//				}
//			}
//			
//		//sc.close();
//	
//		/*
//		 * 응용문제
//		 * {"햄버거","피자","치킨","커피"};
//		 * 
//		 * "주문하고자 하는 음식을 선택해주세요."
//		 * 해당 질문은 총 4번을 물어보게 됩니다.
//		 * 단, "주문종료"라고 사용자가 입력 시 그 즉시 주문은 종료되며,
//		 * 주문내역을 출력하시면 됩니다.
//		 * 
//		 */
		
		String menus[] = {"햄버거","피자","치킨","커피"};
		Scanner sc1 = new Scanner(System.in);
		String user_menu[]= new String[4];
		String user;
		int ct =0;
		
		for(String f:menus) {
			/*
			 * Scanner가 반복문 안에 적용될 시 loop로 무조건 반복하지는 않음.
			 * 사용자가 입력할 때마다 반복문 범위만큼 출력하는 형태임. 
			 */
			
			System.out.println("메뉴를 선택");
			user = sc1.next(); // 반복문 안에 입력이 있을 경우 반복을 하지 않고 1회만 작동함, 고로 제대로 작동시키려면 
			//반복문 안에 조건문을 포함시켜줘야함.
			
			if(user.equals("주문종료")) {
				break;
			}
			else {
				for(String ff:menus) {
					if(user.equals(ff)) {
						user_menu[ct]=ff;
						ct++;
					}
				}
			}
			
			
			
		}
		System.out.println("주문하신 메뉴는 다음과 같습니다."+Arrays.toString(user_menu));
			
		sc1.close();
		}
	
	}
		

		

